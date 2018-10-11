package com.revature.services;

import com.revature.beans.User;
import com.revature.dao.DAO;
import com.revature.dao.UserDAO;

public class UserService implements UserServiceInterface {

	DAO<User> userDAO = new UserDAO();
	
	@Override
	public User login(User user) {
		User u = null;
		if (user != null) {
			u = userDAO.getById(user.getuName());
		}
		
		if (u != null && 
				u.getPassword().equals(user.getPassword())) {
			return u;
		}
		return null;
	}

	@Override
	public void setUserDAO(DAO<User> userDAO) {
		this.userDAO = userDAO;
	}
}
