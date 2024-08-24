package com.prabha.restapp.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.prabha.restapp.model.Tripdays;
import com.prabha.restapp.repo.TripdaysRepository;
import com.prabha.restapp.service.TripdaysService;

import java.util.List;

@Service
@Transactional
public class TripdaysServiceImpl implements TripdaysService {

    @Autowired
    private TripdaysRepository tripdaysRepository;

    @Override
    public void saveTrip(Tripdays tripdays) {
        tripdaysRepository.save(tripdays);
    }

    @Override
    public List<Tripdays> getAllTrips() {
        return tripdaysRepository.findAll();
    }

    @Override
    public Tripdays getTripById(Long id) {
        return tripdaysRepository.findById(id);
    }

    @Override
    public void deleteTrip(Long id) {
        tripdaysRepository.deleteById(id);
    }
}
