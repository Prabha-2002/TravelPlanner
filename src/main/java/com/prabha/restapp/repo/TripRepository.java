package com.prabha.restapp.repo;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.prabha.restapp.model.Place;
import com.prabha.restapp.model.Trip;

public interface TripRepository {

    Trip save(Trip trip);

    List<Trip> findAll();

    Trip findByLocation(@Param("location") String location);

	List<Place> findPlacesByTripId(Long tripId);

	Trip findById(Long id);
}
