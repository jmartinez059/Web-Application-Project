package com.revature.services;

import org.springframework.stereotype.Service;

import com.revature.beans.User;
import com.revature.beans.UserImpl;
import com.revature.dao.DAO;
import com.revature.dao.UserDAO;

@Service
public class UserService implements UserServiceInterface {

	DAO<User> userDAO = new UserDAO();

	@Override
	public void setUserDAO(DAO<User> userDAO) {
		this.userDAO = userDAO;
	}
	
	@Override
	public User login(User user) {
		User u = null;
		if (user != null) {
			u = userDAO.getById(user.getuName());
		}
		
		if (u != null && 
				u.getPWord().equals(user.getPWord())) {
			return u;
		}
		return null;
	}

	@Override
	public boolean add(User user) {
		// TODO Auto-generated method stub
		boolean success = false;
		success = true;
		return success;
	}
}
