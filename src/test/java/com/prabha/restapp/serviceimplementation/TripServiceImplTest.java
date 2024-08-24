package com.prabha.restapp.serviceimplementation;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.prabha.restapp.model.Place;
import com.prabha.restapp.model.TopPortal;
import com.prabha.restapp.model.Trip;
import com.prabha.restapp.repo.TripRepository;
import com.prabha.restapp.repo.TopPortalRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

class TripServiceImplTest {

    @Mock
    private TripRepository tripRepository;

    @Mock
    private TopPortalRepository topPortalRepository;

    @InjectMocks
    private TripServiceImpl tripService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveTrip() {
        Trip trip = new Trip();
        when(tripRepository.save(trip)).thenReturn(trip);

        Trip result = tripService.saveTrip(trip);

        assertNotNull(result);
        assertEquals(trip, result);
    }

    @Test
    void testFindByLocation() {
        String location = "Paris";
        Trip trip = new Trip();
        when(tripRepository.findByLocation(location)).thenReturn(trip);

        Trip result = tripService.findByLocation(location);

        assertNotNull(result);
        assertEquals(trip, result);
    }

    @Test
    void testGetPlacesByTripId() {
        Long tripId = 1L;
        List<Place> places = new ArrayList<>();
        Place place1 = new Place();
        Place place2 = new Place();
        places.add(place1);
        places.add(place2);
        when(tripRepository.findPlacesByTripId(tripId)).thenReturn(places);

        List<Place> result = tripService.getPlacesByTripId(tripId);

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(place1));
        assertTrue(result.contains(place2));
    }

    @Test
    void testGetHotelsByTripId() {
        Long tripId = 1L;
        List<TopPortal> hotels = new ArrayList<>();
        TopPortal hotel1 = new TopPortal();
        TopPortal hotel2 = new TopPortal();
        hotels.add(hotel1);
        hotels.add(hotel2);
        when(topPortalRepository.findByTripId(tripId)).thenReturn(hotels);

        List<TopPortal> result = tripService.getHotelsByTripId(tripId);

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(hotel1));
        assertTrue(result.contains(hotel2));
    }

    @Test
    void testGetAllTrips() {
        List<Trip> trips = new ArrayList<>();
        Trip trip1 = new Trip();
        Trip trip2 = new Trip();
        trips.add(trip1);
        trips.add(trip2);
        when(tripRepository.findAll()).thenReturn(trips);

        List<Trip> result = tripService.getAllTrips();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(trip1));
        assertTrue(result.contains(trip2));
    }

    @Test
    void testFindById() {
        Long id = 1L;
        Trip trip = new Trip();
        trip.setId(id);
        when(tripRepository.findById(id)).thenReturn(trip);

        Trip result = tripService.findById(id);

        assertNotNull(result);
        assertEquals(id, result.getId());
    }

    @Test
    void testGetTripById() {
        Long tripId = 1L;
        Trip trip = new Trip();
        trip.setId(tripId);
        when(tripRepository.findById(tripId)).thenReturn(trip);

        Trip result = tripService.getTripById(tripId);

        assertNotNull(result);
        assertEquals(tripId, result.getId());
    }
}
