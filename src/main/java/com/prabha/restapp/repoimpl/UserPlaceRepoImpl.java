package com.prabha.restapp.repoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.prabha.restapp.model.UserPlace;
import com.prabha.restapp.repo.UserPlaceRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class UserPlaceRepoImpl implements UserPlaceRepository {
	@PersistenceContext

	private EntityManager entityManager;

	@Transactional

	public UserPlace save(UserPlace UserPlace) {

		if (UserPlace.getId() == null) {

			entityManager.persist(UserPlace);

			return UserPlace;

		} else {

			return entityManager.merge(UserPlace);

		}

	}
	  @Override
	    public List<UserPlace> findByTripId(Long tripId) {
	        TypedQuery<UserPlace> query = entityManager.createQuery("SELECT p FROM UserPlace p WHERE p.trip.id = :tripId", UserPlace.class);
	        query.setParameter("tripId", tripId);
	        return query.getResultList();
	    }

	public Optional<UserPlace> findById(Long id) {

		UserPlace UserPlace = entityManager.find(UserPlace.class, id);

		return Optional.ofNullable(UserPlace);

	}

	public List<UserPlace> findAll() {

		return entityManager.createQuery("SELECT p FROM UserPlace p", UserPlace.class).getResultList();

	}

	public List<UserPlace> findByLocationId(Long locationId) {

		return entityManager.createQuery("SELECT p FROM UserPlace p WHERE p.location.id = :locationId", UserPlace.class)

				.setParameter("locationId", locationId)

				.getResultList();

	}

	@Transactional

	public void deleteById(Long id) {

		UserPlace UserPlace = findById(id).orElse(null);

		if (UserPlace != null) {

			entityManager.remove(UserPlace);

		}

	}

	@Override
	public boolean existsById(Long id) {
		String query = "SELECT COUNT(p) FROM UserPlace p WHERE p.id = :id";
		Long count = (Long) entityManager.createQuery(query).setParameter("id", id).getSingleResult();
		return count > 0;
	}

}