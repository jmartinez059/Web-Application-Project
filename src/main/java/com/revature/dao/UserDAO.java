package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import com.revature.beans.User;
import com.revature.util.SessionUtil;

public class UserDAO implements DAO<User> {

	private Session sess;
	
	public UserDAO() {
		sess = SessionUtil.getSession();
		System.out.println(sess);
	}
	
	@Override
	public User getById(String tId) {
		System.out.println("tid = " + tId);
		User u = sess.get(User.class, tId);
		System.out.println(u);
		return u;
		
	}

	@Override
	public void create(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSess(Session sess) {
		this.sess = sess;
	}

}
