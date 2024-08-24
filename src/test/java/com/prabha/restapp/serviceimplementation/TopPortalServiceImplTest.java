package com.prabha.restapp.serviceimplementation;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.prabha.restapp.model.TopPortal;
import com.prabha.restapp.repo.TopPortalRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

class TopPortalServiceImplTest {

    @Mock
    private TopPortalRepository topPortalRepository;

    @InjectMocks
    private TopPortalServiceImpl topPortalService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddTopPortal() {
        TopPortal topPortal = new TopPortal();
        when(topPortalRepository.save(topPortal)).thenReturn(topPortal);

        TopPortal result = topPortalService.addTopPortal(topPortal);

        assertNotNull(result);
        assertEquals(topPortal, result);
    }

    @Test
    void testUpdateTopPortalSuccess() {
        Long id = 1L;
        TopPortal topPortal = new TopPortal();
        topPortal.setId(id);
        when(topPortalRepository.existsById(id)).thenReturn(true);
        when(topPortalRepository.save(topPortal)).thenReturn(topPortal);

        TopPortal result = topPortalService.updateTopPortal(id, topPortal);

        assertNotNull(result);
        assertEquals(id, result.getId());
    }

    @Test
    void testUpdateTopPortalNotFound() {
        Long id = 1L;
        TopPortal topPortal = new TopPortal();
        when(topPortalRepository.existsById(id)).thenReturn(false);

        TopPortal result = topPortalService.updateTopPortal(id, topPortal);

        assertNull(result);
    }

    @Test
    void testDeleteTopPortal() {
        Long id = 1L;
        doNothing().when(topPortalRepository).deleteById(id);

        topPortalService.deleteTopPortal(id);

        verify(topPortalRepository, times(1)).deleteById(id);
    }

    @Test
    void testGetAllTopPortals() {
        List<TopPortal> topPortals = new ArrayList<>();
        TopPortal topPortal1 = new TopPortal();
        TopPortal topPortal2 = new TopPortal();
        topPortals.add(topPortal1);
        topPortals.add(topPortal2);
        when(topPortalRepository.findAll()).thenReturn(topPortals);

        List<TopPortal> result = topPortalService.getAllTopPortals();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(topPortal1));
        assertTrue(result.contains(topPortal2));
    }

    @Test
    void testGetTopPortalByIdSuccess() {
        Long id = 1L;
        TopPortal topPortal = new TopPortal();
        topPortal.setId(id);
        when(topPortalRepository.findById(id)).thenReturn(topPortal);

        TopPortal result = topPortalService.getTopPortalById(id);

        assertNotNull(result);
        assertEquals(id, result.getId());
    }

    @Test
    void testGetTopPortalByIdNotFound() {
        Long id = 1L;
        when(topPortalRepository.findById(id)).thenReturn(null);

        TopPortal result = topPortalService.getTopPortalById(id);

        assertNull(result);
    }

    @Test
    void testGetAllTopPortalsForLocation() {
        Long locationId = 1L;
        List<TopPortal> topPortals = new ArrayList<>();
        TopPortal topPortal1 = new TopPortal();
        TopPortal topPortal2 = new TopPortal();
        topPortals.add(topPortal1);
        topPortals.add(topPortal2);
        when(topPortalRepository.findByLocationId(locationId)).thenReturn(topPortals);

        List<TopPortal> result = topPortalService.getAllTopPortalsForLocation(locationId);

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(topPortal1));
        assertTrue(result.contains(topPortal2));
    }
}
