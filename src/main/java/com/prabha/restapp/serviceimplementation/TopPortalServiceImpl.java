////package com.prabha.restapp.serviceimplementation;
////
////import com.prabha.restapp.model.TopPortal;
////import com.prabha.restapp.model.Location;
////import com.prabha.restapp.repo.TopPortalRepository;
////import com.prabha.restapp.repo.LocationRepository; // Assuming you have this repository
////import com.prabha.restapp.service.TopPortalService;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Service;
////import jakarta.transaction.Transactional;
////
////import java.util.List;
////
////@Service
////public class TopPortalServiceImpl implements TopPortalService {
////
////    @Autowired
////    private TopPortalRepository topPortalRepository;
////
////    @Autowired
////    private LocationRepository locationRepository; // Assuming you have a LocationRepository
////
////    @Override
////    @Transactional
////    public void addTopPortal(TopPortal topPortal, Long locationId) {
////        if (topPortal == null || locationId == null) {
////            throw new IllegalArgumentException("TopPortal or Location ID cannot be null");
////        }
////        TopPortal location = locationRepository.findById(locationId).orElse(null);
////        if (location == null) {
////            throw new IllegalArgumentException("Location not found");
////        }
////        topPortal.setLocation1(null);
////        topPortalRepository.save(topPortal);
////    }
////
////    @Override
////    @Transactional
////    public void updateTopPortal(Long id, TopPortal topPortal, Long locationId) {
////        if (!topPortalRepository.existsById(id)) {
////            throw new IllegalArgumentException("Top portal not found");
////        }
////        Location location = locationRepository.findById(locationId).orElse(null);
////        if (location == null) {
////            throw new IllegalArgumentException("Location not found");
////        }
////
////        topPortal.setId(id);
////        topPortal.setLocation1(location);
////        topPortalRepository.save(topPortal);
////    }
////
////    @Override
////    @Transactional
////    public void deleteTopPortal(Long id) {
////        if (!topPortalRepository.existsById(id)) {
////            throw new IllegalArgumentException("Top portal not found");
////        }
////        topPortalRepository.deleteById(id);
////    }
////
////    @Override
////    public TopPortal getTopPortalById(Long id) {
////        return topPortalRepository.findById(id).orElse(null);
////    }
////
////    @Override
////    public List<TopPortal> getAllTopPortalsForLocation(Long locationId) {
////        return topPortalRepository.findByLocation1Id(locationId);
////    }
////}
////package com.prabha.restapp.serviceimplementation;
////
////import com.prabha.restapp.model.TopPortal;
////import com.prabha.restapp.model.Location;
////import com.prabha.restapp.repo.TopPortalRepository;
////import com.prabha.restapp.repo.LocationRepository;
////import com.prabha.restapp.service.TopPortalService;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Service;
////import jakarta.transaction.Transactional;
////
////import java.util.List;
////
////@Service
////public class TopPortalServiceImpl implements TopPortalService {
////
////    @Autowired
////    private TopPortalRepository topPortalRepository;
////
////    @Autowired
////    private LocationRepository locationRepository;
////
////    @Override
////    @Transactional
////    public void addTopPortal(TopPortal topPortal, Long locationId) {
////        if (topPortal == null || locationId == null) {
////            throw new IllegalArgumentException("TopPortal or Location ID cannot be null");
////        }
////        Location location = locationRepository.findById(locationId).orElse(null);
////        if (location == null) {
////            throw new IllegalArgumentException("Location not found");
////        }
////        topPortal.setLocation1(location);
////        topPortalRepository.save(topPortal);
////    }
////
////    @Override
////    @Transactional
////    public void updateTopPortal(Long id, TopPortal topPortal, Long locationId) {
////        if (!topPortalRepository.existsById(id)) {
////            throw new IllegalArgumentException("Top portal not found");
////        }
////        Location location = locationRepository.findById(locationId).orElse(null);
////        if (location == null) {
////            throw new IllegalArgumentException("Location not found");
////        }
////
////        topPortal.setId(id);
////        topPortal.setLocation1(location);
////        topPortalRepository.save(topPortal);
////    }
////
////    @Override
////    @Transactional
////    public void deleteTopPortal(Long id) {
////        if (!topPortalRepository.existsById(id)) {
////            throw new IllegalArgumentException("Top portal not found");
////        }
////        topPortalRepository.deleteById(id);
////    }
////
////    @Override
////    public TopPortal getTopPortalById(Long id) {
////        return topPortalRepository.findById(id).orElse(null);
////    }
////
////    @Override
////    public List<TopPortal> getAllTopPortalsForLocation(Long locationId) {
////        return topPortalRepository.findByLocation1Id(locationId);
////    }
////}
////package com.prabha.restapp.serviceimplementation;
////
////import com.prabha.restapp.model.TopPortal;
////import com.prabha.restapp.model.Location;
////import com.prabha.restapp.repo.TopPortalRepository;
////import com.prabha.restapp.repo.LocationRepository;
////import com.prabha.restapp.service.TopPortalService;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Service;
////import jakarta.transaction.Transactional;
////
////import java.util.List;
////
////@Service
////public class TopPortalServiceImpl implements TopPortalService {
////
////    @Autowired
////    private TopPortalRepository topPortalRepository;
////
////    @Autowired
////    private LocationRepository locationRepository;
////
////    @Override
////    @Transactional
////    public void addTopPortal(TopPortal topPortal, Long locationId) {
////        if (topPortal == null || locationId == null) {
////            throw new IllegalArgumentException("TopPortal or Location ID cannot be null");
////        }
////        Location location = locationRepository.getLocationById(locationId);
////        if (location == null) {
////            throw new IllegalArgumentException("Location not found");
////        }
////        topPortal.setLocation1(location);
////        topPortalRepository.save(topPortal);
////    }
////
////    @Override
////    @Transactional
////    public void updateTopPortal(Long id, TopPortal topPortal, Long locationId) {
////        if (!topPortalRepository.existsById(id)) {
////            throw new IllegalArgumentException("Top portal not found");
////        }
////        Location location = locationRepository.getLocationById(locationId);
////        if (location == null) {
////            throw new IllegalArgumentException("Location not found");
////        }
////
////        topPortal.setId(id);
////        topPortal.setLocation1(location);
////        topPortalRepository.save(topPortal);
////    }
////
////    @Override
////    @Transactional
////    public void deleteTopPortal(Long id) {
////        if (!topPortalRepository.existsById(id)) {
////            throw new IllegalArgumentException("Top portal not found");
////        }
////        topPortalRepository.deleteById(id);
////    }
////
////    @Override
////    public TopPortal getTopPortalById(Long id) {
////        return topPortalRepository.findById(id).orElse(null);
////    }
////
////    @Override
////    public List<TopPortal> getAllTopPortalsForLocation(Long locationId) {
////        return topPortalRepository.findByLocation1Id(locationId);
////    }
////}
//
//
////package com.prabha.restapp.serviceimplementation;
////
////import com.prabha.restapp.model.TopPortal;
////import com.prabha.restapp.model.Location;
////import com.prabha.restapp.repo.TopPortalRepository;
////import com.prabha.restapp.repo.LocationRepository;
////import com.prabha.restapp.service.TopPortalService;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Service;
////import jakarta.transaction.Transactional;
////
////import java.util.List;
////
////@Service
////public class TopPortalServiceImpl implements TopPortalService {
////
////    @Autowired
////    private TopPortalRepository topPortalRepository;
////
////    @Autowired
////    private LocationRepository locationRepository;
////
////    @Override
////    @Transactional
////    public void addTopPortal(TopPortal topPortal, Location location) {
////        if (topPortal == null || location == null) {
////            throw new IllegalArgumentException("TopPortal or Location cannot be null");
////        }
////        topPortal.setLocation1(location);
////        topPortalRepository.save(topPortal);
////    }
////
////    @Override
////    @Transactional
////    public void updateTopPortal(Long id, TopPortal topPortal, Location location) {
////        if (!topPortalRepository.existsById(id)) {
////            throw new IllegalArgumentException("Top portal not found");
////        }
////        if (location == null) {
////            throw new IllegalArgumentException("Location cannot be null");
////        }
////        topPortal.setId(id);
////        topPortal.setLocation1(location);
////        topPortalRepository.save(topPortal);
////    }
////
////    @Override
////    @Transactional
////    public void deleteTopPortal(Long id) {
////        if (!topPortalRepository.existsById(id)) {
////            throw new IllegalArgumentException("Top portal not found");
////        }
////        topPortalRepository.deleteById(id);
////    }
////
////    @Override
////    public TopPortal getTopPortalById(Long id) {
////        return topPortalRepository.findById(id).orElse(null);
////    }
////
////    @Override
////    public List<TopPortal> getAllTopPortalsForLocation(Long locationId) {
////        return topPortalRepository.findByLocation1Id(locationId);
////    }
////}
//
//
//
////
////package com.prabha.restapp.serviceimplementation;
////
////import com.prabha.restapp.model.TopPortal;
////import com.prabha.restapp.model.Location;
////import com.prabha.restapp.repo.TopPortalRepository;
////import com.prabha.restapp.service.TopPortalService;
////import com.prabha.restapp.service.LocationService; // Import the LocationService
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Service;
////
////import jakarta.transaction.Transactional;
////import java.util.List;
////
////@Service
////public class TopPortalServiceImpl implements TopPortalService {
////
////    @Autowired
////    private TopPortalRepository topPortalRepository;
////
////    @Autowired
////    private LocationService locationService; // Inject the LocationService
////
////    @Override
////    @Transactional
////    public void addTopPortal(TopPortal topPortal, Location location) {
////        if (topPortal == null || location == null) {
////            throw new IllegalArgumentException("TopPortal or Location cannot be null");
////        }
////        topPortal.setLocation1(location);
////        topPortalRepository.save(topPortal);
////    }
////
////    @Override
////    @Transactional
////    public void updateTopPortal(Long id, TopPortal topPortal, Location location) {
////        if (!topPortalRepository.existsById(id)) {
////            throw new IllegalArgumentException("Top portal not found");
////        }
////        if (location == null) {
////            throw new IllegalArgumentException("Location not found");
////        }
////        topPortal.setId(id);
////        topPortal.setLocation1(location);
////        topPortalRepository.save(topPortal);
////    }
////
////    @Override
////    @Transactional
////    public void deleteTopPortal(Long id) {
////        if (!topPortalRepository.existsById(id)) {
////            throw new IllegalArgumentException("Top portal not found");
////        }
////        topPortalRepository.deleteById(id);
////    }
////
////    @Override
////    public TopPortal getTopPortalById(Long id) {
////        return topPortalRepository.findById(id).orElse(null);
////    }
////
////    @Override
////    public List<TopPortal> getAllTopPortalsForLocation(Long locationId) {
////        return topPortalRepository.findByLocation1Id(locationId);
////    }
////
////    @Override
////    public Location getLocationById(Long id) {
////        return locationService.getLocationById(id);
////    }
////}
//
//
//package com.prabha.restapp.serviceimplementation;
//
//import com.prabha.restapp.model.TopPortal;
//import com.prabha.restapp.model.Location;
//import com.prabha.restapp.repo.TopPortalRepository;
//import com.prabha.restapp.service.TopPortalService;
//import com.prabha.restapp.service.LocationService; // Ensure this import
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import jakarta.transaction.Transactional;
//import java.util.List;
//
//@Service
//public class TopPortalServiceImpl implements TopPortalService {
//
//    @Autowired
//    private TopPortalRepository topPortalRepository;
//
//    @Autowired
//    private LocationService locationService; // Inject LocationService
//
//    @Override
//    @Transactional
//    public void addTopPortal(TopPortal topPortal, Location location) {
//        if (topPortal == null || location == null) {
//            throw new IllegalArgumentException("TopPortal or Location cannot be null");
//        }
//        topPortal.setLocation1(location);
//        topPortalRepository.save(topPortal);
//    }
//
//    @Override
//    @Transactional
//    public void updateTopPortal(Long id, TopPortal topPortal, Location location) {
//        if (!topPortalRepository.existsById(id)) {
//            throw new IllegalArgumentException("Top portal not found");
//        }
//        if (location == null) {
//            throw new IllegalArgumentException("Location not found");
//        }
//        topPortal.setId(id);
//        topPortal.setLocation1(location);
//        topPortalRepository.save(topPortal);
//    }
//
//    @Override
//    @Transactional
//    public void deleteTopPortal(Long id) {
//        if (!topPortalRepository.existsById(id)) {
//            throw new IllegalArgumentException("Top portal not found");
//        }
//        topPortalRepository.deleteById(id);
//    }
//
//    @Override
//    public TopPortal getTopPortalById(Long id) {
//        return topPortalRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public List<TopPortal> getAllTopPortalsForLocation(Long locationId) {
//        return topPortalRepository.findByLocation1Id(locationId);
//    }
//
//    @Override
//    public Location getLocationById(Long id) {
//        return locationService.getLocationById(id);
//    }
//}

//
//package com.prabha.restapp.serviceimplementation;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.prabha.restapp.model.Location;
//import com.prabha.restapp.model.TopPortal;
//import com.prabha.restapp.model.Trip;
//import com.prabha.restapp.repo.TopPortalRepository;
//import com.prabha.restapp.service.LocationService;
//import com.prabha.restapp.service.TopPortalService;
//import com.prabha.restapp.service.TripService;
//
//import jakarta.transaction.Transactional;
//
//@Service
//@Transactional
//public class TopPortalServiceImpl implements TopPortalService {
//
//    @Autowired
//    private TopPortalRepository topPortalRepository;
//
//    @Autowired
//    private LocationService locationService;
//
//    @Autowired
//    private TripService tripService;
//
////    @Override
////    public TopPortal saveTopPortal(TopPortal topPortal) {
////        return topPortalRepository.save(topPortal);
////    }
////
////    @Override
////    public List<TopPortal> getAllTopPortals() {
////        return topPortalRepository.findAll();
////    }
////
////    @Override
////    public TopPortal getTopPortalById(Long id) {
////        Optional<TopPortal> topPortal = topPortalRepository.findById(id);
////        return topPortal.orElse(null); // or throw an exception if not found
////    }
////
////    @Override
////    public void deleteTopPortal(Long id) {
////        topPortalRepository.deleteById(id);
////    }
//
//    public TopPortal save(TopPortal topPortal) {
//        return topPortalRepository.save(topPortal);
//    }
//
//	public TopPortal findById(Long id) {
//		// TODO Auto-generated method stub
//        return topPortalRepository.findById(id);
//	}
//
//	public List<TopPortal> findAll() {
//		// TODO Auto-generated method stub
//        return topPortalRepository.findAll();
//	}
//
//	public void deleteById(Long id) {
//      topPortalRepository.deleteById(id);
//		
//	}
//
//	public TopPortal addTopPortal(TopPortal topPortal, Long locationId, Long tripId) {
//		// TODO Auto-generated method stub
//		 Location location = locationService.getLocationById(locationId);
//	        Trip trip = tripService.getTripById(tripId);
//	        
//	        if (location != null) {
//	            topPortal.setLocation1(location);
//	        }
//	        
//	        if (trip != null) {
//	            topPortal.setTrip(trip);
//	        }
//	        
//	        return topPortalRepository.addTopPortal(topPortal);	}
//
//  
//
//
//}
//


package com.prabha.restapp.serviceimplementation;

import com.prabha.restapp.model.TopPortal;

import com.prabha.restapp.repo.TopPortalRepository;
import com.prabha.restapp.service.TopPortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopPortalServiceImpl implements TopPortalService {

	@Autowired
    private TopPortalRepository topPortalRepository;
	
	  @Override
	    public TopPortal addTopPortal(TopPortal TopPortal) {
	        return topPortalRepository.save(TopPortal);
	    }

	    @Override
	    public TopPortal updateTopPortal(Long id, TopPortal topPortal) {
	        if (topPortalRepository.existsById(id)) {
	            topPortal.setId(id);
	            return topPortalRepository.save(topPortal);
	        }
	        return null;
	    }

	    @Override
	    public void deleteTopPortal(Long id) {
	        topPortalRepository.deleteById(id);
	    }

	    public List<TopPortal> getAllTopPortals() {
	        return topPortalRepository.findAll();
	    }

	    @Override
	    public TopPortal getTopPortalById(Long id) {
	        return topPortalRepository.findById(id);
	    }

	    @Override
	    public List<TopPortal> getAllTopPortalsForLocation(Long locationId) {
	        return topPortalRepository.findByLocationId(locationId);
	    }
    
}

