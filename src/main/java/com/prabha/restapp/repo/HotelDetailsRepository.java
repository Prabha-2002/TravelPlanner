package com.prabha.restapp.repo;

import com.prabha.restapp.model.HotelDetails;
import java.util.List;

public interface HotelDetailsRepository {

    void save(HotelDetails hotelDetails);

    List<HotelDetails> findAll();

    void deleteById(Long id);

    HotelDetails findById(Long id);
}
