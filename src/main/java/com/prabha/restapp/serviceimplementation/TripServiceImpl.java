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
    private TripRepository tripRepository; 

    @Autowired
    private TopPortalRepository topPortalRepository; 

    @Override
    public Trip saveTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    @Override
    public Trip findByLocation(String location) {

        return tripRepository.findByLocation(location);
    }

    @Override
    public List<Place> getPlacesByTripId(Long tripId) {
        return tripRepository.findPlacesByTripId(tripId);
    }

    @Override
    public List<TopPortal> getHotelsByTripId(Long tripId) {
        return topPortalRepository.findByTripId(tripId); 
    }

    @Override
    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

	public Trip findById(Long id) {
        return tripRepository.findById(id);
	}

	@Override
	public Trip getTripById(Long tripId) {
        return tripRepository.findById(tripId);
	}}
