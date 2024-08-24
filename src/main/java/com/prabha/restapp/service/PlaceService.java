package com.prabha.restapp.service;

import java.util.List;

import com.prabha.restapp.model.Place;

public interface PlaceService {

	public Place addPlace(Place place);

	public	Place updatePlace(Long id, Place place);

	public void deletePlace(Long id);

	public Place getPlaceById(Long id);

	public	List<Place> getAllPlacesForLocation(Long locationId);

}