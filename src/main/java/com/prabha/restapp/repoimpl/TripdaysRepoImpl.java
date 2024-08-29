package com.prabha.restapp.repoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.prabha.restapp.model.Tripdays;
import com.prabha.restapp.repo.TripdaysRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class TripdaysRepoImpl implements TripdaysRepository {

    private final EntityManager entityManager;

    public TripdaysRepoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Tripdays tripdays) {
        if (tripdays.getId() == null) {
            entityManager.persist(tripdays);
        } else {
            entityManager.merge(tripdays);
        }
    }

    @Override
    public List<Tripdays> findAll() {
        TypedQuery<Tripdays> query = entityManager.createQuery("SELECT t FROM Tripdays t", Tripdays.class);
        return query.getResultList();
    }

    @Override
    public void deleteById(Long id) {
        Tripdays tripdays = entityManager.find(Tripdays.class, id);
        if (tripdays != null) {
            entityManager.remove(tripdays);
        }
    }

    @Override
    public Tripdays findById(Long id) {
        return entityManager.find(Tripdays.class, id);
    }
}
