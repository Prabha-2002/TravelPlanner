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
