//package com.prabha.restapp.service;
//
//import java.util.List;
//import com.prabha.restapp.model.Location;
//
//public interface LocationService {
//
//	public Location addLocation(Location location);
//
//	public Location updateLocation(Long id, Location location);
//
//	public void deleteLocation(Long id);
//
//	public Location getLocationById(Long id);
//
//	public List<Location> getAllLocations();
//
//}

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
