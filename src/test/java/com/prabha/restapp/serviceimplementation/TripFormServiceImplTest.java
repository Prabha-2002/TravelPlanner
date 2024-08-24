package com.prabha.restapp.serviceimplementation;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.prabha.restapp.model.TripForm;
import com.prabha.restapp.repo.TripFormRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

class TripFormServiceImplTest {

    @Mock
    private TripFormRepository tripFormRepository;

    @InjectMocks
    private TripFormServiceImpl tripFormService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveTripForm() {
        TripForm tripForm = new TripForm();
        when(tripFormRepository.save(tripForm)).thenReturn(tripForm);

        TripForm result = tripFormService.saveTripForm(tripForm);

        assertNotNull(result);
        assertEquals(tripForm, result);
    }

    @Test
    void testGetTripFormSuccess() {
        Long id = 1L;
        TripForm tripForm = new TripForm();
        tripForm.setId(id);
        when(tripFormRepository.findById(id)).thenReturn(tripForm);

        TripForm result = tripFormService.getTripForm(id);

        assertNotNull(result);
        assertEquals(id, result.getId());
    }

    @Test
    void testGetTripFormNotFound() {
        Long id = 1L;
        when(tripFormRepository.findById(id)).thenReturn(null);

        TripForm result = tripFormService.getTripForm(id);

        assertNull(result);
    }

    @Test
    void testGetAllTripForms() {
        List<TripForm> tripForms = new ArrayList<>();
        TripForm tripForm1 = new TripForm();
        TripForm tripForm2 = new TripForm();
        tripForms.add(tripForm1);
        tripForms.add(tripForm2);
        when(tripFormRepository.findAll()).thenReturn(tripForms);

        List<TripForm> result = tripFormService.getAllTripForms();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(tripForm1));
        assertTrue(result.contains(tripForm2));
    }
}
