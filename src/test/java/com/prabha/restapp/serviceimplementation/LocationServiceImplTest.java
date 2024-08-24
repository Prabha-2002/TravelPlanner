package com.prabha.restapp.serviceimplementation;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.prabha.restapp.model.Location;
import com.prabha.restapp.repo.LocationRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

class LocationServiceImplTest {

    @Mock
    private LocationRepository locationRepository;

    @InjectMocks
    private LocationServiceImpl locationService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddLocation() {
        Location location = new Location();
        when(locationRepository.addLocation(location)).thenReturn(location);

        Location result = locationService.addLocation(location);

        assertNotNull(result);
        assertEquals(location, result);
    }

    @Test
    void testUpdateLocation() {
        Long id = 1L;
        Location location = new Location();
        when(locationRepository.updateLocation(id, location)).thenReturn(location);

        Location result = locationService.updateLocation(id, location);

        assertNotNull(result);
        assertEquals(location, result);
    }

    @Test
    void testDeleteLocation() {
        Long id = 1L;
        doNothing().when(locationRepository).deleteLocation(id);

        locationService.deleteLocation(id);

        verify(locationRepository, times(1)).deleteLocation(id);
    }

    @Test
    void testGetLocationByIdSuccess() {
        Long id = 1L;
        Location location = new Location();
        location.setId(id);
        when(locationRepository.getLocationById(id)).thenReturn(location);

        Location result = locationService.getLocationById(id);

        assertNotNull(result);
        assertEquals(id, result.getId());
    }

    @Test
    void testGetLocationByIdNotFound() {
        Long id = 1L;
        when(locationRepository.getLocationById(id)).thenReturn(null);

        Location result = locationService.getLocationById(id);

       
        assertNull(result);
    }

    @Test
    void testGetAllLocations() {
        List<Location> locations = new ArrayList<>();
        Location location1 = new Location();
        Location location2 = new Location();
        locations.add(location1);
        locations.add(location2);
        when(locationRepository.getAllLocations()).thenReturn(locations);

        List<Location> result = locationService.getAllLocations();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(location1));
        assertTrue(result.contains(location2));
    }

    @Test
    void testFindById() {
        Long id = 1L;
        Location location = new Location();
        when(locationRepository.findById(id)).thenReturn(location);

        Location result = locationService.findById(id);

       
        assertNotNull(result);
        assertEquals(location, result);
    }

    @Test
    void testFindById1() {
        Long id = 1L;
        Location location = new Location();
        when(locationRepository.getLocationById(id)).thenReturn(location);

        Location result = locationService.findById1(id);

        assertNotNull(result);
        assertEquals(location, result);
    }

    @Test
    void testFindByIdWithInvalidString() {
        String location = "InvalidLocation";
        when(locationRepository.getLocationById(null)).thenReturn(null);

        Location result = locationService.findById(location);

        assertNull(result);
    }
}
