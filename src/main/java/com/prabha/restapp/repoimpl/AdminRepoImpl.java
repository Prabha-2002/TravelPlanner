package com.prabha.restapp.repoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

import com.prabha.restapp.model.Admin;
import com.prabha.restapp.repo.AdminRepository;

@Repository
public class AdminRepoImpl implements AdminRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void save(Admin admin) {
        if (admin.getId() == null) {
            entityManager.persist(admin);
        } else {
            entityManager.merge(admin);
        }
    }

    @Override
    public Admin findById(Long id) {
        return entityManager.find(Admin.class, id);
    }

    @Override
    public Optional<Admin> findByEmail(String email) {
        List<Admin> admins = entityManager.createQuery("SELECT a FROM Admin a WHERE a.email = :email", Admin.class)
                                          .setParameter("email", email)
                                          .getResultList();
        return admins.stream().findFirst();
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        Admin admin = findById(id);
        if (admin != null) {
            entityManager.remove(admin);
        }
    }

    public Admin findByName(String name) {
        String jpql = "SELECT a FROM Admin a WHERE a.name = :name";
        TypedQuery<Admin> query = entityManager.createQuery(jpql, Admin.class);
        query.setParameter("name", name);
        return query.getResultStream().findFirst().orElse(null);
    }}

