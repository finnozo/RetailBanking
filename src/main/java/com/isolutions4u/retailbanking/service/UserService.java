package com.isolutions4u.retailbanking.service;

import com.isolutions4u.retailbanking.model.User;

public interface UserService {
    User findUserByEmail(String email);

    void saveUser(User user);
}
