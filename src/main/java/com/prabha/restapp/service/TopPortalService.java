////package com.prabha.restapp.service;
////import com.prabha.restapp.model.Location;
////import com.prabha.restapp.model.TopPortal;
////import java.util.List;
////
////public interface TopPortalService {
////    void addTopPortal(TopPortal topPortal, Long locationId);
////    void updateTopPortal(Long id, TopPortal topPortal, Long locationId);
////    void deleteTopPortal(Long id);
////    TopPortal getTopPortalById(Long id);
////    List<TopPortal> getAllTopPortalsForLocation(Long locationId);
////	void addTopPortal(TopPortal topPortal, Location locationId);
////}
////package com.prabha.restapp.service;
////
////import com.prabha.restapp.model.TopPortal;
////import com.prabha.restapp.model.Location;
////import java.util.List;
////
////public interface TopPortalService {
////    void addTopPortal(TopPortal topPortal, Location location); // Adjusted to use Location
////    void updateTopPortal(Long id, TopPortal topPortal, Location location); // Adjusted to use Location
////    void deleteTopPortal(Long id);
////    TopPortal getTopPortalById(Long id);
////    List<TopPortal> getAllTopPortalsForLocation(Long locationId);
////}
////package com.prabha.restapp.service;
////
////import com.prabha.restapp.model.TopPortal;
////import com.prabha.restapp.model.Location;
////import java.util.List;
////
////public interface TopPortalService {
////    void addTopPortal(TopPortal topPortal, Location location);
////    void updateTopPortal(Long id, TopPortal topPortal, Location location);
////    void deleteTopPortal(Long id);
////    TopPortal getTopPortalById(Long id);
////    List<TopPortal> getAllTopPortalsForLocation(Long locationId);
////    Location getLocationById(Long id); // Add this method
////}
//
package com.prabha.restapp.service;
import com.prabha.restapp.model.TopPortal;
//
//
import java.util.List;
//
public interface TopPortalService {
	
	
	public TopPortal addTopPortal(TopPortal TopPortal);

	public	TopPortal updateTopPortal(Long id, TopPortal topPortal);

	public void deleteTopPortal(Long id);

	public TopPortal getTopPortalById(Long id);

	public	List<TopPortal> getAllTopPortalsForLocation(Long locationId);
	
//	 TopPortal saveTopPortal(TopPortal topPortal);
//	    List<TopPortal> getAllTopPortals();
//	    TopPortal getTopPortalById(Long id);
//	    void deleteTopPortal(Long id);
//    TopPortal saveTopPortal(TopPortal topPortal);
//    List<TopPortal> getAllTopPortals();
//    TopPortal getTopPortalById(Long id);
//    void deleteTopPortal(Long id);
//    Location getLocationById(Long locationId); // Add method if needed
}







