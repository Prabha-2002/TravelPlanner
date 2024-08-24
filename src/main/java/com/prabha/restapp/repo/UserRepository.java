package com.prabha.restapp.repo;

import java.util.List;
import java.util.Optional;

import com.prabha.restapp.model.User;

public interface UserRepository {
	User save(User user);

	Optional<User> findById(Long id);

	Optional<User> findByEmail(String email);

	List<User> findAll();

	void deleteById(Long id);
}
