package com.revature.dao;

import static org.junit.Assert.fail;

import org.hibernate.Session;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.revature.beans.User;
import com.revature.beans.UserImpl;

public class UserDAOTest {
	
	private static Session sess;
	
	private static DAO<User> userDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sess = Mockito.mock(Session.class);
		userDAO = new UserDAO();
		userDAO.setSess(sess);
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

	@Test
	public void testGetById() {
		User user = new UserImpl();
		String username = "Frank";
		user.setuName(username);
		user.setPassword("1234");
		user.setId(1);
		Mockito.when(sess.get(User.class, username)).thenReturn(user);
		Assert.assertEquals("Testing getting by id: ", user, userDAO.getById(username));
	}

	@Test
	public void testCreate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

}
