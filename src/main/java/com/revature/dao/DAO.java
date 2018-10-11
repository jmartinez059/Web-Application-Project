package com.revature.dao;

import java.util.List;

import org.hibernate.Session;

public interface DAO<T> {

	/**
	 * Searches the DataBase for T with id = tId
	 * and returns the object if found, else returns null
	 * @param tId
	 * @return
	 */
	public T getById(String tId);
	
	public void create(T t);
	
	public List<T> getAll();
	
	public void update(T t);
	
	public void delete(T t);
	
	public void setSess(Session sess);
}
