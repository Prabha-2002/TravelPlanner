package com.prabha.restapp.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prabha.restapp.model.UserPlace;
import com.prabha.restapp.repo.UserPlaceRepository;
import com.prabha.restapp.service.UserPlaceService;

import java.util.List;

@Service
public class UserPlaceServiceImpl implements UserPlaceService {

    @Autowired
    private UserPlaceRepository UserPlaceRepository;

    @Override
    public UserPlace addUserPlace(UserPlace UserPlace) {
        return UserPlaceRepository.save(UserPlace);
    }

    @Override
    public UserPlace updateUserPlace(Long id, UserPlace UserPlace) {
        if (UserPlaceRepository.existsById(id)) {
            UserPlace.setId(id);
            return UserPlaceRepository.save(UserPlace);
        }
        return null;
    }

    @Override
    public void deleteUserPlace(Long id) {
        UserPlaceRepository.deleteById(id);
    }

    public List<UserPlace> getAllUserPlaces() {
        return UserPlaceRepository.findAll();
    }

    @Override
    public UserPlace getUserPlaceById(Long id) {
        return UserPlaceRepository.findById(id).orElse(null);
    }

    @Override
    public List<UserPlace> getAllUserPlacesForLocation(Long locationId) {
        return UserPlaceRepository.findByLocationId(locationId);
    }
}
