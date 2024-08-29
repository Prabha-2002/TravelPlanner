package com.prabha.restapp.service;

import com.prabha.restapp.model.Location;
import java.util.List;

public interface LocationService {
    Location addLocation(Location location);
    Location updateLocation(Long id, Location location);
    void deleteLocation(Long id);
    Location getLocationById(Long id);
    List<Location> getAllLocations();
}
