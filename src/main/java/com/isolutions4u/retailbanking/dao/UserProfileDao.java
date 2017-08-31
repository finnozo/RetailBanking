package com.isolutions4u.retailbanking.dao;

import java.util.List;

import com.isolutions4u.retailbanking.model.UserProfile;

public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
