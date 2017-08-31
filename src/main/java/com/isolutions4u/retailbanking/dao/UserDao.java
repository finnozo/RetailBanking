package com.isolutions4u.retailbanking.dao;

import com.isolutions4u.retailbanking.model.User;

public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);

	void save(User user);
	
}

