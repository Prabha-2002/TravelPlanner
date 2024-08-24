package com.prabha.restapp.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prabha.restapp.model.Place;
import com.prabha.restapp.repo.PlaceRepository;
import com.prabha.restapp.service.PlaceService;

import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    @Override
    public Place addPlace(Place place) {
        return placeRepository.save(place);
    }

    @Override
    public Place updatePlace(Long id, Place place) {
        if (placeRepository.existsById(id)) {
            place.setId(id);
            return placeRepository.save(place);
        }
        return null;
    }

    @Override
    public void deletePlace(Long id) {
        placeRepository.deleteById(id);
    }

    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }

    @Override
    public Place getPlaceById(Long id) {
        return placeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Place> getAllPlacesForLocation(Long locationId) {
        return placeRepository.findByLocationId(locationId);
    }
}
