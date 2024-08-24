////package com.prabha.restapp.controller;
////
////import com.prabha.restapp.model.Location;
////import com.prabha.restapp.model.TopPortal;
////import com.prabha.restapp.model.TopPortalRequest; // Import the TopPortalRequest class
////import com.prabha.restapp.service.TopPortalService;
////import com.prabha.restapp.serviceimplementation.TopPortalServiceImpl;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.web.bind.annotation.*;
////
////import java.util.List;
////
////@RestController
////@RequestMapping("/api/topportals")
////@CrossOrigin("*")
////public class TopPortalController {
////
////    @Autowired
////    private TopPortalServiceImpl topPortalService;
//////
//////    @PostMapping("/add")
//////    public String addTopPortal(@RequestBody TopPortalRequest topPortalRequest) {
//////        try {
////////            if (topPortalRequest == null || topPortalRequest.getLocationId() == null) {
////////                return "Location ID must be provided";
////////            }
//////
//////            TopPortal topPortal = topPortalRequest.toTopPortal();
//////            topPortalService.addTopPortal(topPortal, topPortalRequest.getLocationId());
//////            return "Top portal added successfully";
//////        } catch (Exception e) {
//////            return "Error: " + e.getMessage();
//////        }
//////    }
//////
//////    @PutMapping("/{id}")
//////    public String updateTopPortal(@PathVariable Long id, @RequestBody TopPortalRequest topPortalRequest) {
//////        try {
////////            if (topPortalRequest == null || topPortalRequest.getLocationId() == null) {
////////                return "Location ID must be provided";
////////            }
//////            TopPortal topPortal = topPortalRequest.toTopPortal();
//////            topPortalService.updateTopPortal(id, topPortal, topPortalRequest.getLocationId());
//////            return "Top portal updated successfully";
//////        } catch (Exception e) {
//////            return "Error: " + e.getMessage();
//////        }
//////    }
//////
//////    @DeleteMapping("/{id}")
//////    public String deleteTopPortal(@PathVariable Long id) {
//////        try {
//////            topPortalService.deleteTopPortal(id);
//////            return "Top portal deleted successfully";
//////        } catch (Exception e) {
//////            return "Error: " + e.getMessage();
//////        }
//////    }
//////
//////    @GetMapping("/{id}")
//////    public TopPortal getTopPortalById(@PathVariable Long id) {
//////        return topPortalService.getTopPortalById(id);
//////    }
//////
//////    @GetMapping("/location/{locationId}")
//////    public List<TopPortal> getAllTopPortalsForLocation(@PathVariable Long locationId) {
//////        return topPortalService.getAllTopPortalsForLocation(locationId);
//////    }
//////}
////    
////    @PostMapping("/add")
////    public String addTopPortal(@RequestBody TopPortalRequest topPortalRequest) {
////        try {
////            if (topPortalRequest == null || topPortalRequest.getLocationId() == null) {
////                return "Location ID must be provided";
////            }
////
////            TopPortal topPortal = topPortalRequest.toTopPortal();
////            // Retrieve Location by ID and pass it to the service
////            Location location = topPortalService.getLocationById(topPortalRequest.getLocationId()); // Make sure this method exists in TopPortalService
////            if (location == null) {
////                return "Location not found";
////            }
////            topPortalService.addTopPortal(topPortal, location);
////            return "Top portal added successfully";
////        } catch (Exception e) {
////            return "Error: " + e.getMessage();
////        }
////    }
////
////    @PutMapping("/{id}")
////    public String updateTopPortal(@PathVariable Long id, @RequestBody TopPortalRequest topPortalRequest) {
////        try {
////            if (topPortalRequest == null || topPortalRequest.getLocationId() == null) {
////                return "Location ID must be provided";
////            }
////
////            TopPortal topPortal = topPortalRequest.toTopPortal();
////            // Retrieve Location by ID and pass it to the service
////            Location location = topPortalService.getLocationById(topPortalRequest.getLocationId()); // Make sure this method exists in TopPortalService
////            if (location == null) {
////                return "Location not found";
////            }
////            topPortalService.updateTopPortal(id, topPortal, location);
////            return "Top portal updated successfully";
////        } catch (Exception e) {
////            return "Error: " + e.getMessage();
////        }
////    }
////
////    @DeleteMapping("/{id}")
////    public String deleteTopPortal(@PathVariable Long id) {
////        try {
////            topPortalService.deleteTopPortal(id);
////            return "Top portal deleted successfully";
////        } catch (Exception e) {
////            return "Error: " + e.getMessage();
////        }
////    }
////
////    @GetMapping("/{id}")
////    public TopPortal getTopPortalById(@PathVariable Long id) {
////        return topPortalService.getTopPortalById(id);
////    }
////
////    @GetMapping("/location/{locationId}")
////    public List<TopPortal> getAllTopPortalsForLocation(@PathVariable Long locationId) {
////        return topPortalService.getAllTopPortalsForLocation(locationId);
////    }
////}
//
//
//
////
////import com.prabha.restapp.model.TopPortal;
////import com.prabha.restapp.model.Location;
////import com.prabha.restapp.service.TopPortalService;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.web.bind.annotation.*;
////
////import java.util.List;
////
////@RestController
////@RequestMapping("/api/topportals")
////public class TopPortalController {
////
////    @Autowired
////    private TopPortalService topPortalService;
////
////    @PostMapping("/add")
////    public String addTopPortal(@RequestBody TopPortal topPortal) {
////        try {
////            topPortalService.saveTopPortal(topPortal);
////            return "TopPortal added successfully";
////        } catch (Exception e) {
////            return "Error: " + e.getMessage();
////        }
////    }
////
////    @PutMapping("/{id}")
////    public String updateTopPortal(@PathVariable Long id, @RequestBody TopPortal topPortal) {
////        try {
////            TopPortal existingTopPortal = topPortalService.getTopPortalById(id);
////            if (existingTopPortal == null) {
////                return "TopPortal not found";
////            }
////            topPortal.setId(id);
////            topPortalService.saveTopPortal(topPortal);
////            return "TopPortal updated successfully";
////        } catch (Exception e) {
////            return "Error: " + e.getMessage();
////        }
////    }
////
////    @DeleteMapping("/{id}")
////    public String deleteTopPortal(@PathVariable Long id) {
////        try {
////            TopPortal existingTopPortal = topPortalService.getTopPortalById(id);
////            if (existingTopPortal == null) {
////                return "TopPortal not found";
////            }
////            topPortalService.deleteTopPortal(id);
////            return "TopPortal deleted successfully";
////        } catch (Exception e) {
////            return "Error: " + e.getMessage();
////        }
////    }
////
////    @GetMapping("/all")
////    public List<TopPortal> getAllTopPortals() {
////        return topPortalService.getAllTopPortals();
////    }
////
////    @GetMapping("/{id}")
////    public TopPortal getTopPortalById(@PathVariable Long id) {
////        TopPortal topPortal = topPortalService.getTopPortalById(id);
////        if (topPortal == null) {
////            throw new RuntimeException("TopPortal not found");
////        }
////        return topPortal;
////    }
////}
////*****************************below
////package com.prabha.restapp.controller;
////
////import com.prabha.restapp.model.TopPortal;
////import com.prabha.restapp.serviceimplementation.TopPortalServiceImpl;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.web.bind.annotation.*;
////
////import java.util.List;
////import java.util.Optional;
////
////@RestController
////@RequestMapping("/api/topportals")
////@CrossOrigin("*")
////public class TopPortalController {
////
////	@Autowired
////	TopPortalServiceImpl topPortalService;
////
////	 @PostMapping
////	    public TopPortal createTopPortal(@RequestBody TopPortal topPortal) {
////	        return topPortalService.save(topPortal);
////	    }
////
////	    @GetMapping("/{id}")
////	    public TopPortal getTopPortalById(@PathVariable Long id) {
////	        return topPortalService.findById(id);
////	    }
////
////	    @GetMapping
////	    public List<TopPortal> getAllTopPortals() {
////	        return topPortalService.findAll();
////	    }
////
////	    @DeleteMapping("/{id}")
////	    public void deleteTopPortal(@PathVariable Long id) {
////	            topPortalService.deleteById(id);
////	    }
////	    
////	    @PutMapping("/{id}")
////	    public TopPortal updateTopPortal(@PathVariable Long id, @RequestBody TopPortal topPortal) {
////	        // Check if the TopPortal exists
////	        TopPortal existingTopPortal = topPortalService.findById(id);
////	        if (existingTopPortal == null) {
////	            throw new RuntimeException("TopPortal not found with id: " + id);
////	        }
////
////	        // Update existingTopPortal with values from topPortal
////	        existingTopPortal.setName(topPortal.getName());
////	        
////	        // Add additional field updates here as needed
////
////	        // Save the updated TopPortal
////	        return topPortalService.save(existingTopPortal);
////	    }
////	}
//
////812345623456666666666666666666666666666666666666
////package com.prabha.restapp.controller;
////
////import java.util.List;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.http.HttpStatus;
////import org.springframework.http.ResponseEntity;
////import org.springframework.web.bind.annotation.CrossOrigin;
////import org.springframework.web.bind.annotation.DeleteMapping;
////import org.springframework.web.bind.annotation.GetMapping;
////import org.springframework.web.bind.annotation.PathVariable;
////import org.springframework.web.bind.annotation.PostMapping;
////import org.springframework.web.bind.annotation.PutMapping;
////import org.springframework.web.bind.annotation.RequestBody;
////import org.springframework.web.bind.annotation.RequestMapping;
////import org.springframework.web.bind.annotation.RequestParam;
////import org.springframework.web.bind.annotation.RestController;
////
////import com.prabha.restapp.model.Location;
////import com.prabha.restapp.model.TopPortal;
////import com.prabha.restapp.serviceimplementation.LocationServiceImpl;
////import com.prabha.restapp.serviceimplementation.TopPortalServiceImpl;
////
////@RestController
////@RequestMapping("/api/topportals")
////@CrossOrigin("*")
////public class TopPortalController {
////
////    @Autowired
////    private TopPortalServiceImpl topPortalService;
////
////    @Autowired
////    private LocationServiceImpl locationService; // Service to handle Location entity
////
//////    @PostMapping
//////    public TopPortal createTopPortal(@RequestBody TopPortal topPortal,
//////                                      @RequestParam Long locationId) {
//////
//////        // Fetch the Location entity based on locationId
//////        Location location = locationService.findById(locationId);
//////        if (location == null) {
//////            throw new RuntimeException("Location not found with id: " + locationId);
//////        }
//////
//////        // Set the Location entity in the TopPortal
//////        topPortal.setLocation1(location);
//////
//////        // Save the TopPortal
//////        return topPortalService.save(topPortal);
//////    }
////    
////    @PostMapping
////    public ResponseEntity<TopPortal> createTopPortal(@RequestBody TopPortal topPortal) {
////        TopPortal savedTopPortal = topPortalService.save(topPortal);
////        return ResponseEntity.ok(savedTopPortal);
////    }
////
////
////
////    @GetMapping("/{id}")
////    public TopPortal getTopPortalById(@PathVariable Long id) {
////        return topPortalService.findById(id);
////    }
////
////    @GetMapping
////    public List<TopPortal> getAllTopPortals() {
////        return topPortalService.findAll();
////    }
////
////    @DeleteMapping("/{id}")
////    public void deleteTopPortal(@PathVariable Long id) {
////        topPortalService.deleteById(id);
////    }
////
////    @PutMapping("/{id}")
////    public TopPortal updateTopPortal(@PathVariable Long id, @RequestBody TopPortal topPortal) {
////        // Check if the TopPortal exists
////        TopPortal existingTopPortal = topPortalService.findById(id);
////        if (existingTopPortal == null) {
////            throw new RuntimeException("TopPortal not found with id: " + id);
////        }
////
////        existingTopPortal.setName(topPortal.getName());
////        existingTopPortal.setRate(topPortal.getRate());
////        existingTopPortal.setRating(topPortal.getRating());
////        existingTopPortal.setImageUrl(topPortal.getImageUrl());
////
////        // Handle Location relationship
////        if (topPortal.getLocation1() != null) {
////            Location location = locationService.findById(topPortal.getLocation1().getId());
////            if (location == null) {
////                throw new RuntimeException("Location not found with id: " + topPortal.getLocation1().getId());
////            }
////            existingTopPortal.setLocation1(location);
////        }
////
////        // Save the updated TopPortal
////        return topPortalService.save(existingTopPortal);
////    }
////}
//
//
//package com.prabha.restapp.controller;
//
//import com.prabha.restapp.model.TopPortal;
//import com.prabha.restapp.serviceimplementation.TopPortalServiceImpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/topportal")
//@CrossOrigin("*")
//
//public class TopPortalController {
//
//    @Autowired
//    private TopPortalServiceImpl topPortalService;
//
//    @PostMapping("/add")
//    public String addTopPortal(@RequestBody TopPortal topPortal) {
//        try {
//            if (topPortal.getLocation() == null || topPortal.getLocation().getId() == null) {
//                return "Location must be provided";
//            }
//            topPortalService.addTopPortal(topPortal);
//            return "TopPortal added successfully";
//        } catch (Exception e) {
//            return "Error: " + e.getMessage();
//        }
//    }
//
//    @PutMapping("/{id}")
//    public String updateTopPortal(@PathVariable Long id, @RequestBody TopPortal topPortal) {
//        try {
//            topPortalService.updateTopPortal(id, topPortal);
//            return "TopPortal updated successfully";
//        } catch (Exception e) {
//            return "Error: " + e.getMessage();
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public String deleteTopPortal(@PathVariable Long id) {
//        try {
//            topPortalService.deleteTopPortal(id);
//            return "TopPortal deleted successfully";
//        } catch (Exception e) {
//            return "Error: " + e.getMessage();
//        }
//    }
//
//    @GetMapping("/all")
//    public List<TopPortal> getAllTopPortals() {
//        return topPortalService.getAllTopPortals();
//    }
//
//    @GetMapping("/{id}")
//    public TopPortal getTopPortalById(@PathVariable Long id) {
//        return topPortalService.getTopPortalById(id);
//    }
//
//    @GetMapping("/location/{locationId}")
//    public List<TopPortal> getAllTopPortalsForLocation(@PathVariable Long locationId) {
//        return topPortalService.getAllTopPortalsForLocation(locationId);
//    }
//}
package com.prabha.restapp.controller;

import com.prabha.restapp.model.TopPortal;
import com.prabha.restapp.serviceimplementation.TopPortalServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/topportal")
@CrossOrigin("*") // Ensure this matches your frontend's URL
public class TopPortalController {

    @Autowired
    private TopPortalServiceImpl topPortalService;

    @PostMapping("/add")
    public String addTopPortal(@RequestBody TopPortal topPortal) {
        try {
            topPortalService.addTopPortal(topPortal);
            return "TopPortal added successfully";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @PutMapping("/{id}")
    public String updateTopPortal(@PathVariable Long id, @RequestBody TopPortal topPortal) {
        try {
            topPortalService.updateTopPortal(id, topPortal);
            return "TopPortal updated successfully";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @DeleteMapping("/{id}")
    public String deleteTopPortal(@PathVariable Long id) {
        try {
            topPortalService.deleteTopPortal(id);
            return "TopPortal deleted successfully";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/all")
    public List<TopPortal> getAllTopPortals() {
        return topPortalService.getAllTopPortals();
    }

    @GetMapping("/{id}")
    public TopPortal getTopPortalById(@PathVariable Long id) {
        return topPortalService.getTopPortalById(id);
    }

    @GetMapping("/location/{locationId}")
    public List<TopPortal> getAllTopPortalsForLocation(@PathVariable Long locationId) {
        return topPortalService.getAllTopPortalsForLocation(locationId);
    }
}
