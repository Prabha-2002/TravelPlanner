package com.prabha.restapp.repoimpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prabha.restapp.model.TripForm;
import com.prabha.restapp.repo.TripFormRepository;

import java.util.List;

@Repository
public class TripFormRepositoryImpl implements TripFormRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public TripForm save(TripForm tripForm) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(tripForm);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            throw e;
        } finally {
            session.close();
        }
        return tripForm;
    }

    @Override
    public TripForm findById(Long id) {
        Session session = sessionFactory.openSession();
        TripForm tripForm = session.get(TripForm.class, id);
        session.close();
        return tripForm;
    }

    @Override
    public List<TripForm> findAll() {
        Session session = sessionFactory.openSession();
        List<TripForm> tripForms = session.createQuery("from TripForm", TripForm.class).list();
        session.close();
        return tripForms;
    }
}
