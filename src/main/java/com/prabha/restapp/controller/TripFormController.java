package com.prabha.restapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.prabha.restapp.model.TripForm;
import com.prabha.restapp.service.TripFormService;

import java.util.List;

@RestController
@RequestMapping("/api/trip-forms")
@CrossOrigin("*")
public class TripFormController {

    @Autowired
    private TripFormService tripFormService;

    @PostMapping
    public TripForm createTripForm(@RequestBody TripForm tripForm) {
        return tripFormService.saveTripForm(tripForm);
    }

//    @GetMapping("/{id}")
//    public TripForm getTripForm(@PathVariable Long id) {
//        return tripFormService.getTripForm(id);
//    }

    @GetMapping
    public List<TripForm> getAllTripForms() {
        return tripFormService.getAllTripForms();
    }
    
    
//    @GetMapping("/{id}")
//    public ResponseEntity<TripForm> getTripForm(@PathVariable Long id) {
//        try {
//            TripForm tripForm = tripFormService.getTripForm(id);
//            if (tripForm == null) {
//                return ResponseEntity.notFound().build();
//            }
//            return ResponseEntity.ok(tripForm);
//        } catch (Exception e) {
//            // Log the exception
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//        }
//    }
    
    @GetMapping("/{id}")
    public TripForm getTripForm(@PathVariable Long id) {
        TripForm tripForm = tripFormService.getTripForm(id);
        if (tripForm == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TripForm not found");
        }
        return tripForm;
    }


}
