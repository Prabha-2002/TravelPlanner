package com.prabha.restapp.repo;
import com.prabha.restapp.model.Location;
import java.util.List;
import java.util.Optional;
public interface LocationRepository {
    Location addLocation(Location location);
    Location updateLocation(Long id, Location location);
    void deleteLocation(Long id);
    Location getLocationById(Long id);
    List<Location> getAllLocations();
	Location findById(Long id);
}
