package com.prabha.restapp.repo;

import com.prabha.restapp.model.PlaceDetails;
import java.util.List;

public interface PlaceDetailsRepository {

    void save(PlaceDetails placeDetails);

    List<PlaceDetails> findAll();

    void deleteById(Long id);

    PlaceDetails findById(Long id);
}
