package com.isolutions4u.retailbanking.service;

import com.isolutions4u.retailbanking.model.UserProfile;

import java.util.List;

public interface UserProfileService {

    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}
