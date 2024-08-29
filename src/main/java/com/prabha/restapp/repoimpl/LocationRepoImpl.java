package com.prabha.restapp.repoimpl;
import com.prabha.restapp.model.Location;
import com.prabha.restapp.repo.LocationRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class LocationRepoImpl implements LocationRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Location addLocation(Location location) {
        entityManager.persist(location);
        return location;
    }

    @Override
    public Location updateLocation(Long id, Location location) {
        Location existingLocation = entityManager.find(Location.class, id);
        if (existingLocation != null) {
            existingLocation.setName(location.getName());
            existingLocation.setClimaticCondition(location.getClimaticCondition());
            return entityManager.merge(existingLocation);
        }
        return null;
    }

    @Override
    public void deleteLocation(Long id) {
        Location location = entityManager.find(Location.class, id);
        if (location != null) {
            entityManager.remove(location);
        }
    }

    @Override
    public Location getLocationById(Long id) {
        return entityManager.find(Location.class, id); 
    }


    @Override
    public List<Location> getAllLocations() {
        TypedQuery<Location> query = entityManager.createQuery("SELECT l FROM Location l", Location.class);
        return query.getResultList();
    }

	@Override
	public Location findById(Long id) {
        return entityManager.find(Location.class, id);
	}
}
