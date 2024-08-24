//package com.prabha.restapp.service;
//
//import java.util.List;
//
//import com.prabha.restapp.model.Place;
//import com.prabha.restapp.model.TopPortal;
//import com.prabha.restapp.model.Trip;
//
//public interface TripService {
//	public Trip saveTrip(Trip trip);
//	public   Trip findByLocation(String location);
//	public   List<Place> getPlacesByTripId(Long tripId);
//	public   List<TopPortal> getHotelsByTripId(Long tripId);
//	public   List<Trip> getAllTrips();
//
//}


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
