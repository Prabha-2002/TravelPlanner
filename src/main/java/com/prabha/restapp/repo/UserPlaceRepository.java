package com.prabha.restapp.repo;

import java.util.List;
import java.util.Optional;

import com.prabha.restapp.model.UserPlace;

public interface UserPlaceRepository {
	UserPlace save(UserPlace UserPlace);

	Optional<UserPlace> findById(Long id);

	List<UserPlace> findAll();

	List<UserPlace> findByLocationId(Long locationId);

	void deleteById(Long id);

	boolean existsById(Long id);

	List<UserPlace> findByTripId(Long tripId);
}
