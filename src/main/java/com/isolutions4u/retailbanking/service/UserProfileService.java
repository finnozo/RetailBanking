package com.isolutions4u.retailbanking.service;

import java.util.List;

import com.isolutions4u.retailbanking.model.UserProfile;

public interface UserProfileService {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
