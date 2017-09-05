package com.isolutions4u.retailbanking.dao;

import com.isolutions4u.retailbanking.model.UserProfile;

import java.util.List;

public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
