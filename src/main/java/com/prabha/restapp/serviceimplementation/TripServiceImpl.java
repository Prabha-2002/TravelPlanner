//package com.prabha.restapp.serviceimplementation;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//import com.prabha.restapp.model.Place;
//import com.prabha.restapp.model.TopPortal;
//import com.prabha.restapp.model.Trip;
//import com.prabha.restapp.repo.PlaceRepository;
//import com.prabha.restapp.repo.TopPortalRepository;
//import com.prabha.restapp.repo.TripRepository;
//import com.prabha.restapp.service.TripService;
//
//@Service
//public class TripServiceImpl implements TripService {
//
//	  @Autowired
//	    private TripRepository tripRepository;
//
//	    @Autowired
//	    private PlaceRepository placeRepository;
//
//	    @Autowired
//	    private TopPortalRepository hotelRepository;
//
//	    @Override
//	    public Trip saveTrip(Trip trip) {
//	        return tripRepository.save(trip);
//	    }
//
////	    @Override
////	    public Trip findByLocation(String location) {
////	        return tripRepository.findByLocation(location);
////	  }
//	    @Override
//	    public Trip findByLocation(String location) {
//	        return tripRepository.findByLocation(location);
//	    }
//
//
//
//	    @Override
//	    public List<Place> getPlacesByTripId(Long tripId) {
//	        return placeRepository.findByTripId(tripId);
//	    }
//
//	    @Override
//	    public List<TopPortal> getHotelsByTripId(Long tripId) {
//	        return hotelRepository.findByTripId(tripId);
//	    }
//
//		public List<Trip> getAllTrips() {
//			// TODO Auto-generated method stub
//			 return tripRepository.findAll();		}
//	}


package com.prabha.restapp.serviceimplementation;

import com.prabha.restapp.model.Place;
import com.prabha.restapp.model.TopPortal;
import com.prabha.restapp.model.Trip;
import com.prabha.restapp.repo.TripRepository;
import com.prabha.restapp.repo.TopPortalRepository;
import com.prabha.restapp.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripServiceImpl implements TripService {

    @Autowired
    private TripRepository tripRepository; // Ensure TripRepository is correctly injected

    @Autowired
    private TopPortalRepository topPortalRepository; // Ensure TopPortalRepository is correctly injected

    @Override
    public Trip saveTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    @Override
    public Trip findByLocation(String location) {
        // Implement the logic to find a Trip by location
        // For example:
        return tripRepository.findByLocation(location); // Assuming such a method exists in TripRepository
    }

    @Override
    public List<Place> getPlacesByTripId(Long tripId) {
        // Implement the logic to get places by trip ID
        return tripRepository.findPlacesByTripId(tripId); // Assuming such a method exists in TripRepository
    }

    @Override
    public List<TopPortal> getHotelsByTripId(Long tripId) {
        // Implement the logic to get hotels by trip ID
        return topPortalRepository.findByTripId(tripId); // Assuming such a method exists in TopPortalRepository
    }

    @Override
    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

	public Trip findById(Long id) {
		// TODO Auto-generated method stub
        return tripRepository.findById(id);
	}

	@Override
	public Trip getTripById(Long tripId) {
		// TODO Auto-generated method stub
        return tripRepository.findById(tripId);
	}}
