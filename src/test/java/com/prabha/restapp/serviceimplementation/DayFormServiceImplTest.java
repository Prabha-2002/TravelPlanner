package com.prabha.restapp.serviceimplementation;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.prabha.restapp.model.DayForm;
import com.prabha.restapp.repo.DayFormRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

class DayFormServiceImplTest {

    @Mock
    private DayFormRepository dayFormRepository;

    @InjectMocks
    private DayFormServiceImpl dayFormService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveDayForm() {
        // Arrange
        DayForm dayForm = new DayForm();
        when(dayFormRepository.save(dayForm)).thenReturn(dayForm);

        // Act
        DayForm result = dayFormService.saveDayForm(dayForm);

        // Assert
        assertNotNull(result);
        assertEquals(dayForm, result);
    }

    @Test
    void testGetDayFormSuccess() {
        // Arrange
        Long id = 1L;
        DayForm dayForm = new DayForm();
        dayForm.setId(id);
        when(dayFormRepository.findById(id)).thenReturn(dayForm);

        // Act
        DayForm result = dayFormService.getDayForm(id);

        // Assert
        assertNotNull(result);
        assertEquals(id, result.getId());
    }

    @Test
    void testGetDayFormNotFound() {
        // Arrange
        Long id = 1L;
        when(dayFormRepository.findById(id)).thenReturn(null);

        // Act
        DayForm result = dayFormService.getDayForm(id);

        // Assert
        assertNull(result);
    }

    @Test
    void testGetAllDayForms() {
        // Arrange
        List<DayForm> dayForms = new ArrayList<>();
        DayForm dayForm1 = new DayForm();
        DayForm dayForm2 = new DayForm();
        dayForms.add(dayForm1);
        dayForms.add(dayForm2);
        when(dayFormRepository.findAll()).thenReturn(dayForms);

        // Act
        List<DayForm> result = dayFormService.getAllDayForms();

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(dayForm1));
        assertTrue(result.contains(dayForm2));
    }
}
