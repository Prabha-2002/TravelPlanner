package com.prabha.restapp.serviceimplementation;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.prabha.restapp.model.Tripdays;
import com.prabha.restapp.repo.TripdaysRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

class TripdaysServiceImplTest {

    @Mock
    private TripdaysRepository tripdaysRepository;

    @InjectMocks
    private TripdaysServiceImpl tripdaysService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveTrip() {
        Tripdays tripdays = new Tripdays();
        doNothing().when(tripdaysRepository).save(tripdays);

        tripdaysService.saveTrip(tripdays);

        verify(tripdaysRepository, times(1)).save(tripdays);
    }

    @Test
    void testGetAllTrips() {
        List<Tripdays> trips = new ArrayList<>();
        Tripdays trip1 = new Tripdays();
        Tripdays trip2 = new Tripdays();
        trips.add(trip1);
        trips.add(trip2);
        when(tripdaysRepository.findAll()).thenReturn(trips);

        List<Tripdays> result = tripdaysService.getAllTrips();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(trip1));
        assertTrue(result.contains(trip2));
    }

    @Test
    void testGetTripByIdSuccess() {
        Long id = 1L;
        Tripdays tripdays = new Tripdays();
        tripdays.setId(id);
        when(tripdaysRepository.findById(id)).thenReturn(tripdays);

        Tripdays result = tripdaysService.getTripById(id);

        assertNotNull(result);
        assertEquals(id, result.getId());
    }

    @Test
    void testGetTripByIdNotFound() {
        Long id = 1L;
        when(tripdaysRepository.findById(id)).thenReturn(null);

        Tripdays result = tripdaysService.getTripById(id);

        assertNull(result);
    }

    @Test
    void testDeleteTrip() {
        Long id = 1L;
        doNothing().when(tripdaysRepository).deleteById(id);

        tripdaysService.deleteTrip(id);

        verify(tripdaysRepository, times(1)).deleteById(id);
    }
}
