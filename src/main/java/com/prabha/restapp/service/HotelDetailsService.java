package com.prabha.restapp.service;

import com.prabha.restapp.model.HotelDetails;
import java.util.List;

public interface HotelDetailsService {

    void saveHotelDetails(HotelDetails hotelDetails);

    List<HotelDetails> getAllHotelDetails();

    HotelDetails getHotelDetailsById(Long id);

    void deleteHotelDetails(Long id);
}
