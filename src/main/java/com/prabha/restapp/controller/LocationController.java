package com.prabha.restapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.prabha.restapp.model.Location;
import com.prabha.restapp.serviceimplementation.LocationServiceImpl;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/locations")
@CrossOrigin("*")
public class LocationController {

    @Autowired
    LocationServiceImpl locationService;

    @PostMapping("/add")
    public Location addLocation(@RequestBody Location location) {
        return locationService.addLocation(location);
    }

    @PutMapping("/{id}")
    public Location updateLocation(@PathVariable Long id, @RequestBody Location location) {
        return locationService.updateLocation(id, location);
    }

    @DeleteMapping("/{id}")
    public void deleteLocation(@PathVariable Long id) {
        locationService.deleteLocation(id);
    }

    @GetMapping("/names")
    public List<String> getAllLocationNames() {
        return locationService.getAllLocations().stream()
                              .map(Location::getName)
                              .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Location getLocationById(@PathVariable("id") Long id) {
        return locationService.getLocationById(id);
    }

    @GetMapping("/all")
    public List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }
}
