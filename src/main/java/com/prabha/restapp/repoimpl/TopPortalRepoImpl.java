////package com.prabha.restapp.repoimpl;
////
////import java.util.List;
////import java.util.Optional;
////
////import org.springframework.stereotype.Repository;
////
////import com.prabha.restapp.model.TopPortal;
////import com.prabha.restapp.repo.TopPortalRepository;
////
////import jakarta.persistence.EntityManager;
////import jakarta.persistence.PersistenceContext;
////import jakarta.transaction.Transactional;
////
////@Repository
////public class TopPortalRepoImpl implements TopPortalRepository {
////
////    @PersistenceContext
////    private EntityManager entityManager;
////
////    @Override
////    @Transactional
////    public TopPortal save(TopPortal topPortal) {
////        if (topPortal.getId() == null) {
////            entityManager.persist(topPortal);
////            return topPortal;
////        } else {
////            return entityManager.merge(topPortal);
////        }
////    }
////
////    @Override
////    public Optional<TopPortal> findById(Long id) {
////        TopPortal topPortal = entityManager.find(TopPortal.class, id);
////        return Optional.ofNullable(topPortal);
////    }
////
////    @Override
////    public List<TopPortal> findAll() {
////        return entityManager.createQuery("SELECT tp FROM TopPortal tp", TopPortal.class).getResultList();
////    }
////
////    @Override
////    @Transactional
////    public void deleteById(Long id) {
////        TopPortal topPortal = findById(id).orElse(null);
////        if (topPortal != null) {
////            entityManager.remove(topPortal);
////        }
////    }
////
////    @Override
////    public boolean existsById(Long id) {
////        String query = "SELECT COUNT(tp) FROM TopPortal tp WHERE tp.id = :id";
////        Long count = (Long) entityManager.createQuery(query).setParameter("id", id).getSingleResult();
////        return count > 0;
////    }
////
////    @Override
////    public List<TopPortal> findByTripId(Long tripId) {
////        return entityManager.createQuery("SELECT t FROM TopPortal t WHERE t.trip.id = :tripId", TopPortal.class)
////                            .setParameter("tripId", tripId)
////                            .getResultList();
////    }
////
////    @Override
////    public List<TopPortal> findByLocation1Id(Long locationId) {
////        return entityManager.createQuery("SELECT t FROM TopPortal t WHERE t.location1.id = :locationId", TopPortal.class)
////                            .setParameter("locationId", locationId)
////                            .getResultList();
////    }
////}
//
////package com.prabha.restapp.repoimpl;
////
////import java.util.List;
////import java.util.Optional;
////
////import org.springframework.stereotype.Repository;
////
////import com.prabha.restapp.model.TopPortal;
////import com.prabha.restapp.repo.TopPortalRepository;
////
////import jakarta.persistence.EntityManager;
////import jakarta.persistence.PersistenceContext;
////import jakarta.transaction.Transactional;
////
////@Repository
////public class TopPortalRepoImpl implements TopPortalRepository {
////
////    @PersistenceContext
////    private EntityManager entityManager;
////
////    @Override
////    @Transactional
////    public TopPortal save(TopPortal topPortal) {
////        if (topPortal.getId() == null) {
////            entityManager.persist(topPortal);
////            return topPortal;
////        } else {
////            return entityManager.merge(topPortal);
////        }
////    }
////
////    @Override
////    public Optional<TopPortal> findById(Long id) {
////        TopPortal topPortal = entityManager.find(TopPortal.class, id);
////        return Optional.ofNullable(topPortal);
////    }
////
////    @Override
////    public List<TopPortal> findAll() {
////        return entityManager.createQuery("SELECT tp FROM TopPortal tp", TopPortal.class).getResultList();
////    }
////
////    @Override
////    @Transactional
////    public void deleteById(Long id) {
////        TopPortal topPortal = findById(id).orElse(null);
////        if (topPortal != null) {
////            entityManager.remove(topPortal);
////        }
////    }
////
////    @Override
////    public boolean existsById(Long id) {
////        String query = "SELECT COUNT(tp) FROM TopPortal tp WHERE tp.id = :id";
////        Long count = (Long) entityManager.createQuery(query)
////                                         .setParameter("id", id)
////                                         .getSingleResult();
////        return count > 0;
////    }
////
////    @Override
////    public List<TopPortal> findByTripId(Long tripId) {
////        return entityManager.createQuery("SELECT t FROM TopPortal t WHERE t.trip.id = :tripId", TopPortal.class)
////                            .setParameter("tripId", tripId)
////                            .getResultList();
////    }
////
////    @Override
////    public List<TopPortal> findByLocation1Id(Long locationId) {
////        return entityManager.createQuery("SELECT t FROM TopPortal t WHERE t.location1.id = :locationId", TopPortal.class)
////                            .setParameter("locationId", locationId)
////                            .getResultList();
////    }
////}
//
//
//
////package com.prabha.restapp.repoimpl;
////
////import com.prabha.restapp.model.TopPortal;
////import com.prabha.restapp.repo.TopPortalRepository;
////import jakarta.persistence.EntityManager;
////import jakarta.persistence.PersistenceContext;
////import jakarta.persistence.TypedQuery;
////import jakarta.transaction.Transactional;
////import org.springframework.stereotype.Repository;
////
////import java.util.List;
////import java.util.Optional;
////
////@Repository
////@Transactional
////public class TopPortalRepoImpl implements TopPortalRepository {
////
////    @PersistenceContext
////    private EntityManager entityManager;
////
////    @Override
////    public TopPortal save(TopPortal topPortal) {
////        if (topPortal.getId() == null) {
////            entityManager.persist(topPortal);
////            return topPortal;
////        } else {
////            return entityManager.merge(topPortal);
////        }
////    }
////
////    @Override
////    public Optional<TopPortal> findById(Long id) {
////        TopPortal topPortal = entityManager.find(TopPortal.class, id);
////        return Optional.ofNullable(topPortal);
////    }
////
////    @Override
////    public List<TopPortal> findAll() {
////        TypedQuery<TopPortal> query = entityManager.createQuery("SELECT tp FROM TopPortal tp", TopPortal.class);
////        return query.getResultList();
////    }
////
////    @Override
////    public void deleteById(Long id) {
////        TopPortal topPortal = findById(id).orElse(null);
////        if (topPortal != null) {
////            entityManager.remove(topPortal);
////        }
////    }
////
////    @Override
////    public boolean existsById(Long id) {
////        String query = "SELECT COUNT(tp) FROM TopPortal tp WHERE tp.id = :id";
////        Long count = (Long) entityManager.createQuery(query)
////                                         .setParameter("id", id)
////                                         .getSingleResult();
////        return count > 0;
////    }
////
////    @Override
////    public List<TopPortal> findByLocation1Id(Long locationId) {
////        TypedQuery<TopPortal> query = entityManager.createQuery("SELECT t FROM TopPortal t WHERE t.location1.id = :locationId", TopPortal.class);
////        query.setParameter("locationId", locationId);
////        return query.getResultList();
////    }
////}
//
//
//
//
//
//
//
//
//
//
//
//package com.prabha.restapp.repoimpl;
//
//import com.prabha.restapp.model.TopPortal;
//import com.prabha.restapp.repo.TopPortalRepository;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.persistence.TypedQuery;
//import jakarta.transaction.Transactional;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class TopPortalRepoImpl implements TopPortalRepository {
//
//    @PersistenceContext
//     EntityManager entityManager;
//
//    @Override
//    @Transactional
//    public TopPortal save(TopPortal topPortal) {
//        if (topPortal.getId() == null) {
//            // New entity, so persist it
//            entityManager.persist(topPortal);
//            return topPortal;
//        } else {
//            // Existing entity, so merge it
//            return entityManager.merge(topPortal);
//        }
//    }
//
//    @Override
//    public TopPortal findById(Long id) {
//        return entityManager.find(TopPortal.class, id);
//    }
//
//    @Override
//    public List<TopPortal> findAll() {
//        TypedQuery<TopPortal> query = entityManager.createQuery("SELECT t FROM TopPortal t", TopPortal.class);
//        return query.getResultList();
//    }
//
//    @Override
//    @Transactional
//    public void deleteById(Long id) {
//        TopPortal topPortal = findById(id);
//        if (topPortal != null) {
//            entityManager.remove(topPortal);
//        }
//    }
//}
//
////
////import com.prabha.restapp.model.TopPortal;
////import com.prabha.restapp.repo.TopPortalRepository;
////import jakarta.persistence.EntityManager;
////import jakarta.persistence.PersistenceContext;
////import jakarta.persistence.TypedQuery;
////import jakarta.transaction.Transactional;
////import org.springframework.stereotype.Repository;
////
////import java.util.List;
////import java.util.Optional;
////
////@Repository
////@Transactional
////public class TopPortalRepoImpl implements TopPortalRepository {
////
////    @PersistenceContext
////    private EntityManager entityManager;
////
////    @Override
////    public TopPortal save(TopPortal topPortal) {
////        if (topPortal.getId() == null) {
////            entityManager.persist(topPortal);
////            return topPortal;
////        } else {
////            return entityManager.merge(topPortal);
////        }
////    }
////
////    @Override
////    public Optional<TopPortal> findById(Long id) {
////        TopPortal topPortal = entityManager.find(TopPortal.class, id);
////        return Optional.ofNullable(topPortal);
////    }
////
////    @Override
////    public List<TopPortal> findAll() {
////        TypedQuery<TopPortal> query = entityManager.createQuery("SELECT tp FROM TopPortal tp", TopPortal.class);
////        return query.getResultList();
////    }
////
////    @Override
////    public void deleteById(Long id) {
////        TopPortal topPortal = findById(id).orElse(null);
////        if (topPortal != null) {
////            entityManager.remove(topPortal);
////        }
////    }
////
////    @Override
////    public boolean existsById(Long id) {
////        String query = "SELECT COUNT(tp) FROM TopPortal tp WHERE tp.id = :id";
////        Long count = (Long) entityManager.createQuery(query)
////                                         .setParameter("id", id)
////                                         .getSingleResult();
////        return count > 0;
////    }
////
////    @Override
////    public List<TopPortal> findByLocation1Id(Long locationId) {
////        TypedQuery<TopPortal> query = entityManager.createQuery("SELECT t FROM TopPortal t WHERE t.location1.id = :locationId", TopPortal.class);
////        query.setParameter("locationId", locationId);
////        return query.getResultList();
////    }
////
////    @Override
////    public List<TopPortal> findByTripId(Long tripId) {
////        TypedQuery<TopPortal> query = entityManager.createQuery("SELECT tp FROM TopPortal tp WHERE tp.trip.id = :tripId", TopPortal.class);
////        query.setParameter("tripId", tripId);
////        return query.getResultList();
////    }
////}
////

package com.prabha.restapp.repoimpl;

import com.prabha.restapp.model.TopPortal;
import com.prabha.restapp.repo.TopPortalRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class TopPortalRepoImpl implements TopPortalRepository {

     EntityManager entityManager; 
     

    public TopPortalRepoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override  
    public TopPortal save(TopPortal topPortal) {
        if (topPortal.getId() == null) {
            entityManager.persist(topPortal);
            return topPortal;
        } else {
            return entityManager.merge(topPortal);
        }
    }

    @Override
    public TopPortal findById(Long id) {
    	return entityManager.find(TopPortal.class, id);

    }

    @Override
    public List<TopPortal> findAll() {
    	String sql = "From TopPortal";
    	Query q = entityManager.createQuery(sql);
    	return q.getResultList();

    }

    @Override
    
    public void deleteById(Long id) {
        TopPortal topPortal = findById(id);
            entityManager.remove(topPortal);
    }

    @Override
    public List<TopPortal> findByTripId(Long tripId) {
        Query query = entityManager.createQuery(
                "SELECT t FROM TopPortal t WHERE t.trip.id = :tripId", TopPortal.class);
        query.setParameter("tripId", tripId);
        return query.getResultList();
    }

    @Override
    public List<TopPortal> findByLocationId(Long locationId) {

		return entityManager.createQuery("SELECT p FROM TopPortal p WHERE p.location.id = :locationId", TopPortal.class)

				.setParameter("locationId", locationId)

				.getResultList();
    }
	@Override
	public boolean existsById(Long id) {
		String query = "SELECT COUNT(p) FROM TopPortal p WHERE p.id = :id";
		Long count = (Long) entityManager.createQuery(query).setParameter("id", id).getSingleResult();
		return count > 0;
	}

}
