//package com.prabha.restapp.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.prabha.restapp.model.Trip;
//import com.prabha.restapp.serviceimplementation.TripServiceImpl;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/trips")
//@CrossOrigin("*")
//
//public class TripController {
//
////    @Autowired
////    private TripServiceImpl tripService;
////
////    @PostMapping("/add")
////    public Trip createTrip(@RequestBody Trip trip) {
////        return tripService.saveTrip(trip);
////    }
////
////    @GetMapping("/get")
////    public List<Trip> getAllTrips() {
////        return tripService.getAllTrips();
////    }
////    @GetMapping("/location/{location}")
////    public Trip getTripByLocation(@PathVariable String location) {
////        return tripService.findByLocation(location);
////    }
//	
//	
//	  @Autowired
//	   private  TripServiceImpl tripService;
//
//	    @PostMapping("/add")
//	    public Trip createTrip(@RequestBody Trip trip) {
//	        return tripService.saveTrip(trip);
//	    }
//
//	    @GetMapping("/location/{location}")
//	    public Trip getTripByLocation(@PathVariable String location) {
//	        return tripService.findByLocation(location);
//	    }
//
//	    @GetMapping("/{tripId}/places")
//	    public List<Place> getPlaces(@PathVariable Long tripId) {
//	        return tripService.getPlacesByTripId(tripId);
//	    }
//
//	    @GetMapping("/{tripId}/hotels")
//	    public List<TopPortal> getHotels(@PathVariable Long tripId) {
//	        return tripService.getHotelsByTripId(tripId);
//	    }
//
//	    @GetMapping("/all")
//	    public List<Trip> getAllTrips() {
//	        return tripService.getAllTrips();
//	    }
//
//}
package com.prabha.restapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prabha.restapp.model.Place;
import com.prabha.restapp.model.TopPortal;
import com.prabha.restapp.model.Trip;
import com.prabha.restapp.serviceimplementation.TripServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
@CrossOrigin("*")
public class TripController {

    @Autowired
    private TripServiceImpl tripService; // Ensure TripService is correctly injected

    @PostMapping("/add")
    public Trip createTrip(@RequestBody Trip trip) {
        return tripService.saveTrip(trip);
    }

    @GetMapping("/location/{location}")
    public Trip getTripByLocation(@PathVariable String location) {
        return tripService.findByLocation(location);
    }

    @GetMapping("/{tripId}/places")
    public List<Place> getPlaces(@PathVariable Long tripId) {
        return tripService.getPlacesByTripId(tripId); // Ensure this method is present in TripService
    }

    @GetMapping("/{tripId}/hotels")
    public List<TopPortal> getHotels(@PathVariable Long tripId) {
        return tripService.getHotelsByTripId(tripId); // Ensure this method is present in TripService
    }

    @GetMapping("/all")
    public List<Trip> getAllTrips() {
        return tripService.getAllTrips(); // Ensure this method is present in TripService
    }
}



