package com.prabha.restapp.repo;

import java.util.List;
import java.util.Optional;

import com.prabha.restapp.model.Place;

public interface PlaceRepository {
	Place save(Place place);

	Optional<Place> findById(Long id);

	List<Place> findAll();

	List<Place> findByLocationId(Long locationId);

	void deleteById(Long id);

	boolean existsById(Long id);

	List<Place> findByTripId(Long tripId);

}