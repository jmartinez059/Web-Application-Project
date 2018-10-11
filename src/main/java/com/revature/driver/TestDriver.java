package com.revature.driver;

import com.revature.beans.User;
import com.revature.beans.UserImpl;
import com.revature.services.UserService;

public class TestDriver {

	public static void main(String[] args) {
		User u = new UserImpl();
		u.setuName("jmart");
		u.setPassword("pass");
		u.setId(1);
		
		UserService uServ = new UserService();
		User user = uServ.login(u);
		
		System.out.println(user.toString());
	}
}
