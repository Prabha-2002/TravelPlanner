package com.prabha.restapp.service;

import com.prabha.restapp.model.Place;
import com.prabha.restapp.model.TopPortal;
import com.prabha.restapp.model.Trip;

import java.util.List;

public interface TripService {
    Trip saveTrip(Trip trip);
    Trip findByLocation(String location);
    List<Place> getPlacesByTripId(Long tripId);
    List<TopPortal> getHotelsByTripId(Long tripId);
    List<Trip> getAllTrips();
	Trip getTripById(Long tripId);
}
