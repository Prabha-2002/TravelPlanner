package com.prabha.restapp.service;

import java.util.List;

import com.prabha.restapp.model.UserPlace;

public interface UserPlaceService {

	public UserPlace addUserPlace(UserPlace UserPlace);

	public	UserPlace updateUserPlace(Long id, UserPlace UserPlace);

	public void deleteUserPlace(Long id);

	public UserPlace getUserPlaceById(Long id);

	public	List<UserPlace> getAllUserPlacesForLocation(Long locationId);

}