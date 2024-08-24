package com.prabha.restapp.serviceimplementation;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.prabha.restapp.model.FieldForm;
import com.prabha.restapp.repo.FieldFormRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

class FieldFormServiceImplTest {

    @Mock
    private FieldFormRepository fieldFormRepository;

    @InjectMocks
    private FieldFormServiceImpl fieldFormService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveFieldForm() {
        FieldForm fieldForm = new FieldForm();
        when(fieldFormRepository.save(fieldForm)).thenReturn(fieldForm);

        FieldForm result = fieldFormService.saveFieldForm(fieldForm);

        assertNotNull(result);
        assertEquals(fieldForm, result);
    }

    @Test
    void testGetFieldFormSuccess() {
        Long id = 1L;
        FieldForm fieldForm = new FieldForm();
        fieldForm.setId(id);
        when(fieldFormRepository.findById(id)).thenReturn(fieldForm);

        FieldForm result = fieldFormService.getFieldForm(id);

        assertNotNull(result);
        assertEquals(id, result.getId());
    }

    @Test
    void testGetFieldFormNotFound() {
        Long id = 1L;
        when(fieldFormRepository.findById(id)).thenReturn(null);

        FieldForm result = fieldFormService.getFieldForm(id);

        assertNull(result);
    }

    @Test
    void testGetAllFieldForms() {
        List<FieldForm> fieldForms = new ArrayList<>();
        FieldForm fieldForm1 = new FieldForm();
        FieldForm fieldForm2 = new FieldForm();
        fieldForms.add(fieldForm1);
        fieldForms.add(fieldForm2);
        when(fieldFormRepository.findAll()).thenReturn(fieldForms);

        List<FieldForm> result = fieldFormService.getAllFieldForms();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(fieldForm1));
        assertTrue(result.contains(fieldForm2));
    }
}
