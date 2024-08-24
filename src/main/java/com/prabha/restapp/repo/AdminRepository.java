package com.prabha.restapp.repo;

import java.util.Optional;
import com.prabha.restapp.model.Admin;

public interface AdminRepository {
    Optional<Admin> findByEmail(String email);
    Admin findById(Long id);
    void save(Admin admin);
    void deleteById(Long id);
	Admin findByName(String name);
}
