package com.revature.services;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.revature.beans.User;
import com.revature.beans.UserImpl;
import com.revature.dao.DAO;
import com.revature.dao.UserDAO;

public class UserServiceTest {
	
	private static DAO<User> userDAO;
	private static UserService userservice;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		userDAO = Mockito.mock(UserDAO.class);
		userservice = new UserService();
		userservice.setUserDAO(userDAO);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Testing login method
	 */
	@Test
	public void testLogin() {
		User u = new UserImpl();
		User u2 = new UserImpl();
		u.setuName("Gunter");		
		u.setPWord("1234");
		u2.setuName("Gunter");		
		u2.setPWord("1234");
		u.setId(1);
		Mockito.when(userDAO.getById("Gunter")).thenReturn(u);
		User use = userservice.login(u2);
		//System.out.println(use.getuName() + " " + use.getPassword());
		assertEquals("Testing valid login", u, use);
	}

}
