package com.prabha.restapp.serviceimplementation;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.prabha.restapp.model.Admin;
import com.prabha.restapp.repo.AdminRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class AdminServiceImplTest {

    @Mock
    private AdminRepository adminRepository;

    @InjectMocks
    private AdminServiceImpl adminService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testLoginAdminSuccess() {
        String name = "admin";
        String password = "password123";
        Admin admin = new Admin(1L, name, "admin@example.com", password);
        when(adminRepository.findByName(name)).thenReturn(admin);

        Admin result = adminService.loginAdmin(name, password);

        // Assert
        assertNotNull(result);
        assertEquals(admin.getName(), result.getName());
        assertEquals(admin.getPassword(), result.getPassword());
    }

    @Test
    void testLoginAdminFailureIncorrectPassword() {
        String name = "admin";
        String password = "wrongpassword";
        Admin admin = new Admin(1L, name, "admin@example.com", "password123");
        when(adminRepository.findByName(name)).thenReturn(admin);

        Admin result = adminService.loginAdmin(name, password);

        assertNull(result);
    }

    @Test
    void testLoginAdminFailureAdminNotFound() {
        String name = "admin";
        String password = "password123";
        when(adminRepository.findByName(name)).thenReturn(null);

        Admin result = adminService.loginAdmin(name, password);

        assertNull(result);
    }

    @Test
    void testGetAdminByIdSuccess() {
        
        Long id = 1L;
        Admin admin = new Admin(id, "admin", "admin@example.com", "password123");
        when(adminRepository.findById(id)).thenReturn(admin);

        Admin result = adminService.getAdminById(id);

        assertNotNull(result);
        assertEquals(admin.getId(), result.getId());
        assertEquals(admin.getName(), result.getName());
    }

    @Test
    void testGetAdminByIdNotFound() {
        Long id = 1L;
        when(adminRepository.findById(id)).thenReturn(null);

        Admin result = adminService.getAdminById(id);

        assertNull(result);
    }
}
