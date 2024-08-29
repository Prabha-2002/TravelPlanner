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
