package com.revature.services;

import com.revature.beans.User;
import com.revature.dao.DAO;

public interface UserServiceInterface {

	public User login(User user);
	
	public void setUserDAO(DAO<User> userDAO);
}
