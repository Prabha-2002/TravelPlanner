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

import com.prabha.restapp.model.UserPlace;
import com.prabha.restapp.serviceimplementation.UserPlaceServiceImpl;

@RestController
@RequestMapping("/api/schedules")
@CrossOrigin("*")
public class UserPlaceController {

    private final UserPlaceServiceImpl UserPlaceService;

    public UserPlaceController(UserPlaceServiceImpl UserPlaceService) {
        this.UserPlaceService = UserPlaceService;
    }

    @PostMapping("/save")
    public String addUserPlace(@RequestBody UserPlace UserPlace) {
        try {
            
            UserPlaceService.addUserPlace(UserPlace);
            return "UserPlace added successfully";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @PutMapping("/{id}")
    public String updateUserPlace(@PathVariable Long id, @RequestBody UserPlace UserPlace) {
        try {
            UserPlaceService.updateUserPlace(id, UserPlace);
            return "UserPlace updated successfully";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @DeleteMapping("/{id}")
    public String deleteUserPlace(@PathVariable Long id) {
        try {
            UserPlaceService.deleteUserPlace(id);
            return "UserPlace deleted successfully";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/all")
    public List<UserPlace> getAllUserPlaces() {
        return UserPlaceService.getAllUserPlaces();
    }

    @GetMapping("/{id}")
    public UserPlace getUserPlaceById(@PathVariable Long id) {
        return UserPlaceService.getUserPlaceById(id);
    }

    @GetMapping("/location/{locationId}")
    public List<UserPlace> getAllUserPlacesForLocation(@PathVariable Long locationId) {
        return UserPlaceService.getAllUserPlacesForLocation(locationId);
    }
}
