package com.prabha.restapp.controller;

import com.prabha.restapp.model.TopPortal;
import com.prabha.restapp.serviceimplementation.TopPortalServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/topportal")
@CrossOrigin("*") // Ensure this matches your frontend's URL
public class TopPortalController {

    @Autowired
    private TopPortalServiceImpl topPortalService;

    @PostMapping("/add")
    public String addTopPortal(@RequestBody TopPortal topPortal) {
        try {
            topPortalService.addTopPortal(topPortal);
            return "TopPortal added successfully";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @PutMapping("/{id}")
    public String updateTopPortal(@PathVariable Long id, @RequestBody TopPortal topPortal) {
        try {
            topPortalService.updateTopPortal(id, topPortal);
            return "TopPortal updated successfully";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @DeleteMapping("/{id}")
    public String deleteTopPortal(@PathVariable Long id) {
        try {
            topPortalService.deleteTopPortal(id);
            return "TopPortal deleted successfully";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/all")
    public List<TopPortal> getAllTopPortals() {
        return topPortalService.getAllTopPortals();
    }

    @GetMapping("/{id}")
    public TopPortal getTopPortalById(@PathVariable Long id) {
        return topPortalService.getTopPortalById(id);
    }

    @GetMapping("/location/{locationId}")
    public List<TopPortal> getAllTopPortalsForLocation(@PathVariable Long locationId) {
        return topPortalService.getAllTopPortalsForLocation(locationId);
    }
}
