package com.prabha.restapp.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prabha.restapp.model.Place;
import com.prabha.restapp.serviceimplementation.PlaceServiceImpl;

@RestController
@RequestMapping("/api/places")
@CrossOrigin("*")
public class PlaceController {

    private final PlaceServiceImpl placeService;

    public PlaceController(PlaceServiceImpl placeService) {
        this.placeService = placeService;
    }

    @PostMapping("/add")
    public String addPlace(@RequestBody Place place) {
        try {
            if (place.getLocation() == null || place.getLocation().getId() == null) {
                return "Location must be provided";
            }
            placeService.addPlace(place);
            return "Place added successfully";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @PutMapping("/{id}")
    public String updatePlace(@PathVariable Long id, @RequestBody Place place) {
        try {
            placeService.updatePlace(id, place);
            return "Place updated successfully";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @DeleteMapping("/{id}")
    public String deletePlace(@PathVariable Long id) {
        try {
            placeService.deletePlace(id);
            return "Place deleted successfully";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/all")
    public List<Place> getAllPlaces() {
        return placeService.getAllPlaces();
    }

    @GetMapping("/{id}")
    public Place getPlaceById(@PathVariable Long id) {
        return placeService.getPlaceById(id);
    }

    @GetMapping("/location/{locationId}")
    public List<Place> getAllPlacesForLocation(@PathVariable Long locationId) {
        return placeService.getAllPlacesForLocation(locationId);
    }
}
