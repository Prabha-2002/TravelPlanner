package com.prabha.restapp.serviceimplementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import com.prabha.restapp.model.Admin;
import com.prabha.restapp.repo.AdminRepository;
import com.prabha.restapp.service.AdminService;
@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin loginAdmin(String name, String password) {
        Admin admin = adminRepository.findByName(name);
        if (admin != null && admin.getPassword().equals(password)) {
            return admin;  // Successful login
        }
        return null;  // Login failed
    }
    @Override
    public Admin getAdminById(Long id) {
        return adminRepository.findById(id);
    }

}
