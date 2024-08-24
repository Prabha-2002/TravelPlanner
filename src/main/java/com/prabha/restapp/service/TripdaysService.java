package com.prabha.restapp.service;

import com.prabha.restapp.model.Tripdays;
import java.util.List;

public interface TripdaysService {

    void saveTrip(Tripdays tripdays);

    List<Tripdays> getAllTrips();

    Tripdays getTripById(Long id);

    void deleteTrip(Long id);
}
