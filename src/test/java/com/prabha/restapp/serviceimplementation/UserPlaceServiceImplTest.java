package com.prabha.restapp.serviceimplementation;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.prabha.restapp.model.UserPlace;
import com.prabha.restapp.repo.UserPlaceRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class UserPlaceServiceImplTest {

    @Mock
    private UserPlaceRepository userPlaceRepository;

    @InjectMocks
    private UserPlaceServiceImpl userPlaceService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddUserPlace() {
        // Arrange
        UserPlace userPlace = new UserPlace();
        when(userPlaceRepository.save(userPlace)).thenReturn(userPlace);

        // Act
        UserPlace result = userPlaceService.addUserPlace(userPlace);

        // Assert
        assertNotNull(result);
        assertEquals(userPlace, result);
    }

    @Test
    void testUpdateUserPlace() {
        // Arrange
        Long id = 1L;
        UserPlace userPlace = new UserPlace();
        userPlace.setId(id);
        when(userPlaceRepository.existsById(id)).thenReturn(true);
        when(userPlaceRepository.save(userPlace)).thenReturn(userPlace);

        // Act
        UserPlace result = userPlaceService.updateUserPlace(id, userPlace);

        // Assert
        assertNotNull(result);
        assertEquals(id, result.getId());
    }

    @Test
    void testUpdateUserPlaceNotFound() {
        // Arrange
        Long id = 1L;
        UserPlace userPlace = new UserPlace();
        when(userPlaceRepository.existsById(id)).thenReturn(false);

        // Act
        UserPlace result = userPlaceService.updateUserPlace(id, userPlace);

        // Assert
        assertNull(result);
    }

    @Test
    void testDeleteUserPlace() {
        // Arrange
        Long id = 1L;
        doNothing().when(userPlaceRepository).deleteById(id);

        // Act
        userPlaceService.deleteUserPlace(id);

        // Assert
        verify(userPlaceRepository, times(1)).deleteById(id);
    }

    @Test
    void testGetAllUserPlaces() {
        // Arrange
        List<UserPlace> userPlaces = new ArrayList<>();
        UserPlace userPlace1 = new UserPlace();
        UserPlace userPlace2 = new UserPlace();
        userPlaces.add(userPlace1);
        userPlaces.add(userPlace2);
        when(userPlaceRepository.findAll()).thenReturn(userPlaces);

        // Act
        List<UserPlace> result = userPlaceService.getAllUserPlaces();

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(userPlace1));
        assertTrue(result.contains(userPlace2));
    }

    @Test
    void testGetUserPlaceById() {
        // Arrange
        Long id = 1L;
        UserPlace userPlace = new UserPlace();
        when(userPlaceRepository.findById(id)).thenReturn(Optional.of(userPlace));

        // Act
        UserPlace result = userPlaceService.getUserPlaceById(id);

        // Assert
        assertNotNull(result);
        assertEquals(userPlace, result);
    }

    @Test
    void testGetUserPlaceByIdNotFound() {
        // Arrange
        Long id = 1L;
        when(userPlaceRepository.findById(id)).thenReturn(Optional.empty());

        // Act
        UserPlace result = userPlaceService.getUserPlaceById(id);

        // Assert
        assertNull(result);
    }

    @Test
    void testGetAllUserPlacesForLocation() {
        // Arrange
        Long locationId = 1L;
        List<UserPlace> userPlaces = new ArrayList<>();
        UserPlace userPlace1 = new UserPlace();
        UserPlace userPlace2 = new UserPlace();
        userPlaces.add(userPlace1);
        userPlaces.add(userPlace2);
        when(userPlaceRepository.findByLocationId(locationId)).thenReturn(userPlaces);

        // Act
        List<UserPlace> result = userPlaceService.getAllUserPlacesForLocation(locationId);

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(userPlace1));
        assertTrue(result.contains(userPlace2));
    }
}
