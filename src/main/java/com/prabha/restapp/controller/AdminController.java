package com.prabha.restapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.prabha.restapp.model.Admin;
import com.prabha.restapp.model.LoginRequest;
import com.prabha.restapp.serviceimplementation.AdminServiceImpl;

@RestController
@RequestMapping("/api/admins")
@CrossOrigin("*")
public class AdminController {

    @Autowired
    private AdminServiceImpl adminService;

    @PostMapping("/login")
    public ResponseEntity<?> loginAdmin(@RequestBody LoginRequest loginRequest) {
        Admin admin = adminService.loginAdmin(loginRequest.getName(), loginRequest.getPassword());
        if (admin != null) {
            return ResponseEntity.ok(admin);  
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");  
        }
    }

    @GetMapping("/{id}")
    public Admin getAdminById(@PathVariable Long id) {
        return adminService.getAdminById(id);
    }
}
