package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.revature.beans.User;
import com.revature.beans.UserImpl;
import com.revature.util.SessionUtil;

public class UserDAO implements DAO<User> {

	private Session sess;
	
	public UserDAO() {
		sess = SessionUtil.getSession();
		System.out.println(sess);
	}
	
	@Override
	public User getById(String uId) {
		//System.out.println(sess.get(UserImpl.class, uId));
		//User u = sess.get(UserImpl.class, uId);
		User u = (User)sess.createCriteria(UserImpl.class).add(Restrictions.eq("uName", uId)).list().get(0);
		return u;		
	}

	@Override
	public void create(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSess(Session sess) {
		this.sess = sess;
	}

}
