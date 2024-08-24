package com.prabha.restapp.repoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

import com.prabha.restapp.model.Place;
import com.prabha.restapp.model.Trip;
import com.prabha.restapp.repo.TripRepository;

@Repository
public class TripRepoImpl implements TripRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	@Override
	public Trip save(Trip trip) {
		if (trip.getId() == null) {
			entityManager.persist(trip);
		} else {
			entityManager.merge(trip);
		}
		return trip;
	}

	@Override
	public List<Trip> findAll() {
		return entityManager.createQuery("SELECT t FROM Trip t", Trip.class).getResultList();
	}

//	@Override
//	public Trip findByLocation(String location) {
//		TypedQuery<Trip> query = entityManager.createQuery("SELECT t FROM Trip t WHERE t.location = :location",
//				Trip.class);
//		query.setParameter("location", location);
//		return query.getSingleResult();
//	}
	
	public Trip findByLocation(String location) {
	    return entityManager.createQuery("SELECT t FROM Trip t WHERE t.location = :location", Trip.class)
	        .setParameter("location", location)
	        .getSingleResult();
	}

	@Override
	public List<Place> findPlacesByTripId(Long tripId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trip findById(Long id) {
		// TODO Auto-generated method stub
        return entityManager.find(Trip.class, id);
	}

}
