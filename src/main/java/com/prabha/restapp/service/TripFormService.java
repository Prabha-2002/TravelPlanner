package com.prabha.restapp.service;
import java.util.List;

import com.prabha.restapp.model.TripForm;

public interface TripFormService {
    TripForm saveTripForm(TripForm tripForm);
    TripForm getTripForm(Long id);
    List<TripForm> getAllTripForms();
}
