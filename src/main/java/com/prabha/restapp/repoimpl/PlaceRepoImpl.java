package com.prabha.restapp.repoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.prabha.restapp.model.Place;
import com.prabha.restapp.repo.PlaceRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class PlaceRepoImpl implements PlaceRepository {
	@PersistenceContext

	private EntityManager entityManager;

	@Transactional

	public Place save(Place place) {

		if (place.getId() == null) {

			entityManager.persist(place);

			return place;

		} else {

			return entityManager.merge(place);

		}

	}
	  @Override
	    public List<Place> findByTripId(Long tripId) {
	        TypedQuery<Place> query = entityManager.createQuery("SELECT p FROM Place p WHERE p.trip.id = :tripId", Place.class);
	        query.setParameter("tripId", tripId);
	        return query.getResultList();
	    }

	public Optional<Place> findById(Long id) {

		Place place = entityManager.find(Place.class, id);

		return Optional.ofNullable(place);

	}

	public List<Place> findAll() {

		return entityManager.createQuery("SELECT p FROM Place p", Place.class).getResultList();

	}

	public List<Place> findByLocationId(Long locationId) {

		return entityManager.createQuery("SELECT p FROM Place p WHERE p.location.id = :locationId", Place.class)

				.setParameter("locationId", locationId)

				.getResultList();

	}

	@Transactional

	public void deleteById(Long id) {

		Place place = findById(id).orElse(null);

		if (place != null) {

			entityManager.remove(place);

		}

	}

	@Override
	public boolean existsById(Long id) {
		String query = "SELECT COUNT(p) FROM Place p WHERE p.id = :id";
		Long count = (Long) entityManager.createQuery(query).setParameter("id", id).getSingleResult();
		return count > 0;
	}

}