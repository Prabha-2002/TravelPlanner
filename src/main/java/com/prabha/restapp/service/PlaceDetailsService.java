package com.prabha.restapp.service;

import com.prabha.restapp.model.PlaceDetails;
import java.util.List;

public interface PlaceDetailsService {

    void savePlaceDetails(PlaceDetails placeDetails);

    List<PlaceDetails> getAllPlaceDetails();

    PlaceDetails getPlaceDetailsById(Long id);

    void deletePlaceDetails(Long id);
}
