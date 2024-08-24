package com.prabha.restapp.repoimpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prabha.restapp.model.DayForm;
import com.prabha.restapp.repo.DayFormRepository;

import java.util.List;

@Repository
public class DayFormRepositoryImpl implements DayFormRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public DayForm save(DayForm dayForm) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(dayForm);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            throw e;
        } finally {
            session.close();
        }
        return dayForm;
    }

    @Override
    public DayForm findById(Long id) {
        Session session = sessionFactory.openSession();
        DayForm dayForm = session.get(DayForm.class, id);
        session.close();
        return dayForm;
    }

    @Override
    public List<DayForm> findAll() {
        Session session = sessionFactory.openSession();
        List<DayForm> dayForms = session.createQuery("from DayForm", DayForm.class).list();
        session.close();
        return dayForms;
    }
}
