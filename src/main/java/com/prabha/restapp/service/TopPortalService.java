package com.prabha.restapp.service;
import com.prabha.restapp.model.TopPortal;
import java.util.List;
public interface TopPortalService {
	
	
	public TopPortal addTopPortal(TopPortal TopPortal);

	public	TopPortal updateTopPortal(Long id, TopPortal topPortal);

	public void deleteTopPortal(Long id);

	public TopPortal getTopPortalById(Long id);

	public	List<TopPortal> getAllTopPortalsForLocation(Long locationId);
	
}







