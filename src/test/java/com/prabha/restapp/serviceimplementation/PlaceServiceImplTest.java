package com.prabha.restapp.serviceimplementation;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.prabha.restapp.model.Place;
import com.prabha.restapp.repo.PlaceRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class PlaceServiceImplTest {

    @Mock
    private PlaceRepository placeRepository;

    @InjectMocks
    private PlaceServiceImpl placeService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddPlace() {
        Place place = new Place();
        when(placeRepository.save(place)).thenReturn(place);

        Place result = placeService.addPlace(place);

        assertNotNull(result);
        assertEquals(place, result);
    }

    @Test
    void testUpdatePlaceSuccess() {
        Long id = 1L;
        Place place = new Place();
        place.setId(id);
        when(placeRepository.existsById(id)).thenReturn(true);
        when(placeRepository.save(place)).thenReturn(place);

        Place result = placeService.updatePlace(id, place);

        assertNotNull(result);
        assertEquals(id, result.getId());
    }

    @Test
    void testUpdatePlaceNotFound() {
        Long id = 1L;
        Place place = new Place();
        when(placeRepository.existsById(id)).thenReturn(false);

        Place result = placeService.updatePlace(id, place);

        assertNull(result);
    }

    @Test
    void testDeletePlace() {
        Long id = 1L;
        doNothing().when(placeRepository).deleteById(id);

        placeService.deletePlace(id);

        verify(placeRepository, times(1)).deleteById(id);
    }

    @Test
    void testGetAllPlaces() {
        List<Place> places = new ArrayList<>();
        Place place1 = new Place();
        Place place2 = new Place();
        places.add(place1);
        places.add(place2);
        when(placeRepository.findAll()).thenReturn(places);

        List<Place> result = placeService.getAllPlaces();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(place1));
        assertTrue(result.contains(place2));
    }

    @Test
    void testGetPlaceByIdSuccess() {
        Long id = 1L;
        Place place = new Place();
        place.setId(id);
        when(placeRepository.findById(id)).thenReturn(Optional.of(place));

        Place result = placeService.getPlaceById(id);

        assertNotNull(result);
        assertEquals(id, result.getId());
    }

    @Test
    void testGetPlaceByIdNotFound() {
        Long id = 1L;
        when(placeRepository.findById(id)).thenReturn(Optional.empty());

        
        Place result = placeService.getPlaceById(id);

        assertNull(result);
    }

    @Test
    void testGetAllPlacesForLocation() {
        Long locationId = 1L;
        List<Place> places = new ArrayList<>();
        Place place1 = new Place();
        Place place2 = new Place();
        places.add(place1);
        places.add(place2);
        when(placeRepository.findByLocationId(locationId)).thenReturn(places);

        List<Place> result = placeService.getAllPlacesForLocation(locationId);

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(place1));
        assertTrue(result.contains(place2));
    }
}
