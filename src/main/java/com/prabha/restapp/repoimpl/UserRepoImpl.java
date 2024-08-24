package com.prabha.restapp.repoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.prabha.restapp.model.User;
import com.prabha.restapp.repo.UserRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class UserRepoImpl implements UserRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	@Override
	public User save(User user) {
		if (user.getId() == null) {
			entityManager.persist(user);
			return user;
		} else {
			return entityManager.merge(user);
		}
	}

	@Override
	public Optional<User> findById(Long id) {
		User user = entityManager.find(User.class, id);
		return Optional.ofNullable(user);
	}

	@Override
	public List<User> findAll() {
		return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
	}

	@Override
	public Optional<User> findByEmail(String email) {
		List<User> users = entityManager.createQuery("SELECT u FROM User u WHERE u.email = :email", User.class)
				.setParameter("email", email).getResultList();
		return users.stream().findFirst();
	}

	@Transactional
	@Override
	public void deleteById(Long id) {
		User user = findById(id).orElse(null);
		if (user != null) {
			entityManager.remove(user);
		}
	}
}
