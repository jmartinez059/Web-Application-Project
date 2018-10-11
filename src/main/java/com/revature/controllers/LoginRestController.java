package com.revature.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.User;
import com.revature.services.UserServiceInterface;

@RestController
public class LoginRestController {

	@Autowired
	private UserServiceInterface userService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public User loginPost(User user, HttpSession sess, ModelMap modelMap) {
		User u =  userService.login(user);
		if (u != null) {
			sess.setAttribute("user", u);
		}
		return u;
	}
}
