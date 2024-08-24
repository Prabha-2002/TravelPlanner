package com.prabha.restapp.serviceimplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prabha.restapp.model.TripForm;
import com.prabha.restapp.repo.TripFormRepository;
import com.prabha.restapp.service.TripFormService;

import java.util.List;

@Service
public class TripFormServiceImpl implements TripFormService {

    @Autowired
    private TripFormRepository tripFormRepository;

    public TripForm saveTripForm(TripForm tripForm) {
        return tripFormRepository.save(tripForm);
    }


    
    public TripForm getTripForm(Long id) {
        return tripFormRepository.findById(id);
    }

    @Override
    public List<TripForm> getAllTripForms() {
        return tripFormRepository.findAll();
    }
}
