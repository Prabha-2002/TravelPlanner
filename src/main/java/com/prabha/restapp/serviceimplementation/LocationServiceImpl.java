//package com.prabha.restapp.serviceimplementation;
//
//import com.prabha.restapp.model.Location;
//import com.prabha.restapp.repo.LocationRepository;
//import com.prabha.restapp.service.LocationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class LocationServiceImpl implements LocationService {
//
//    @Autowired
//    private LocationRepository locationRepository;
//
//    @Override
//    public Location addLocation(Location location) {
//        return locationRepository.addLocation(location);
//    }
//
//    @Override
//    public Location updateLocation(Long id, Location location) {
//        return locationRepository.updateLocation(id, location);
//    }
//
//    @Override
//    public void deleteLocation(Long id) {
//        locationRepository.deleteLocation(id);
//    }
//
//    @Override
//    public Location getLocationById(Long id) {
//        return locationRepository.getLocationById(id);
//    }
//
//    @Override
//    public List<Location> getAllLocations() {
//        return locationRepository.getAllLocations();
//    }
//}
package com.prabha.restapp.serviceimplementation;

import com.prabha.restapp.model.Location;
import com.prabha.restapp.repo.LocationRepository;
import com.prabha.restapp.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    @Transactional
    public Location addLocation(Location location) {
        return locationRepository.addLocation(location);
    }

    @Override
    @Transactional
    public Location updateLocation(Long id, Location location) {
        return locationRepository.updateLocation(id, location);
    }

    @Override
    @Transactional
    public void deleteLocation(Long id) {
        locationRepository.deleteLocation(id);
    }

    @Override
    public Location getLocationById(Long id) {
        return locationRepository.getLocationById(id);
    }

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.getAllLocations();
    }

	public Location findById(Long id) {
		 return locationRepository.findById(id);
		 }

	public Location findById1(Long id) {
		// TODO Auto-generated method stub
        return getLocationById(id);
	}

	public Location findById(String location) {
		// TODO Auto-generated method stub
		return locationRepository.getLocationById(null);
	}
}
