package com.prabha.restapp.service;

import com.prabha.restapp.model.Admin;

public interface AdminService {
    Admin loginAdmin(String name, String password);
    Admin getAdminById(Long id);
}
