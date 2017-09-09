package com.isolutions4u.retailbanking.service;

import com.isolutions4u.retailbanking.model.User;

public interface UserService {

    User findById(int id);

    User findBySso(String sso);

    void save(User user);

}