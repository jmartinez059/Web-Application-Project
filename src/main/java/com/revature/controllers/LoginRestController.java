package com.revature.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.User;
import com.revature.beans.UserImpl;
import com.revature.services.UserService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class LoginRestController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET )
	public String loginGet() {
		System.out.println("Made it to get!");
		return "redirect:login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST ,produces="application/json", consumes= {("application/json")})
	public UserImpl  loginPost(UserImpl user, HttpSession sess) {
		System.out.println(user);
		User u =  userService.login(user);
		if (u != null) {
			sess.setAttribute("user", u);
		}
		System.out.println(u);
		return (UserImpl)u;
	}
	
	@PostMapping(value="/register", produces="application/json", consumes= {("application/json")})
	public boolean registerNewUser(UserImpl user) {
		boolean success = false;
		success = userService.add(user);
		return success;
	}
}
