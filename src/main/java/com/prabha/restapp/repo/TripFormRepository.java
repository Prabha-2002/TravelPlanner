package com.prabha.restapp.repo;
import java.util.List;

import com.prabha.restapp.model.TripForm;

public interface TripFormRepository {
    TripForm save(TripForm tripForm);
    TripForm findById(Long id);
    List<TripForm> findAll();
}
