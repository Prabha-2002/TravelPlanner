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

