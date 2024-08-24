package com.prabha.restapp.repoimpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prabha.restapp.model.FieldForm;
import com.prabha.restapp.repo.FieldFormRepository;

import java.util.List;

@Repository
public class FieldFormRepositoryImpl implements FieldFormRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public FieldForm save(FieldForm fieldForm) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(fieldForm);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            throw e;
        } finally {
            session.close();
        }
        return fieldForm;
    }

    @Override
    public FieldForm findById(Long id) {
        Session session = sessionFactory.openSession();
        FieldForm fieldForm = session.get(FieldForm.class, id);
        session.close();
        return fieldForm;
    }

    @Override
    public List<FieldForm> findAll() {
        Session session = sessionFactory.openSession();
        List<FieldForm> fieldForms = session.createQuery("from FieldForm", FieldForm.class).list();
        session.close();
        return fieldForms;
    }
}

