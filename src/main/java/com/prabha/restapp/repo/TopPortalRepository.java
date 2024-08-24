//package com.prabha.restapp.repo;
//
//import java.util.List;
//import java.util.Optional;
//
//import com.prabha.restapp.model.TopPortal;
//
//public interface TopPortalRepository {
//    TopPortal save(TopPortal topPortal);
//
//    Optional<TopPortal> findById(Long id);
//
//    List<TopPortal> findAll();
//
//    void deleteById(Long id);
//
//    boolean existsById(Long id);
//
//    List<TopPortal> findByTripId(Long tripId);
//
//    List<TopPortal> findByLocation1Id(Long locationId);
//}
//package com.prabha.restapp.repo;
//
//import com.prabha.restapp.model.TopPortal;
//
//import java.util.List;
//import java.util.Optional;
//
//public interface TopPortalRepository {
//    TopPortal save(TopPortal topPortal);
//    Optional<TopPortal> findById(Long id);
//    List<TopPortal> findAll();
//    void deleteById(Long id);
//    boolean existsById(Long id);
//    List<TopPortal> findByLocation1Id(Long locationId);
//}



//package com.prabha.restapp.repo;
//
//import com.prabha.restapp.model.TopPortal;
//
//import java.util.List;
//import java.util.Optional;
//
//public interface TopPortalRepository {
//   public TopPortal save(TopPortal topPortal);
//   public  TopPortal findById(Long id);
//   public   List<TopPortal> findAll();
//   public  void deleteById(Long id);
//public List<TopPortal> findByTripId(Long tripId);
//}


package com.prabha.restapp.repo;

import com.prabha.restapp.model.TopPortal;

import java.util.List;
import java.util.Optional;

public interface TopPortalRepository {
   public TopPortal save(TopPortal topPortal);
   public  TopPortal findById(Long id);
   public   List<TopPortal> findAll();
   public   void deleteById(Long id);
   public   List<TopPortal> findByTripId(Long tripId);
   public    List<TopPortal> findByLocationId(Long locationId);
   public 	boolean existsById(Long id);

}
