package com.prabha.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prabha.restapp.model.Tripdays;
import com.prabha.restapp.service.TripdaysService;

@RestController
@RequestMapping("/api/tripdays")
@CrossOrigin("*")
public class TripdaysController {

    private final TripdaysService tripdaysService;

    @Autowired
    public TripdaysController(TripdaysService tripdaysService) {
        this.tripdaysService = tripdaysService;
    }

    @PostMapping("/add")
    public String addTrip(@RequestBody Tripdays tripdays) {
        try {
            tripdaysService.saveTrip(tripdays);
            return "Trip added successfully";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @PutMapping("/{id}")
    public String updateTrip(@PathVariable Long id, @RequestBody Tripdays tripdays) {
        try {
            Tripdays existingTrip = tripdaysService.getTripById(id);
            if (existingTrip == null) {
                return "Trip not found";
            }
            tripdays.setId(id);
            tripdaysService.saveTrip(tripdays);
            return "Trip updated successfully";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @DeleteMapping("/{id}")
    public String deleteTrip(@PathVariable Long id) {
        try {
            Tripdays existingTrip = tripdaysService.getTripById(id);
            if (existingTrip == null) {
                return "Trip not found";
            }
            tripdaysService.deleteTrip(id);
            return "Trip deleted successfully";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/all")
    public List<Tripdays> getAllTrips() {
        return tripdaysService.getAllTrips();
    }

    @GetMapping("/{id}")
    public Tripdays getTripById(@PathVariable Long id) {
        Tripdays tripdays = tripdaysService.getTripById(id);
        if (tripdays == null) {
            throw new RuntimeException("Trip not found");
        }
        return tripdays;
    }
}
