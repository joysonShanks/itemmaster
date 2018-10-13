package com.itemmaster.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itemmaster.models.Users;
import com.itemmaster.services.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	/*@Autowired
	BCryptPasswordEncoder passwordEncoder;*/

	@RequestMapping(path = "/user", method = RequestMethod.POST)
	public void saveUser(@RequestBody Users user, ModelMap map) {
		//user.setPassword(passwordEncoder.encode(user.getPassword()));
		userService.saveUser(user);
	}
	
	@RequestMapping(path = "/user", method = RequestMethod.GET)
	public String test() {
		return "hello";
	}
}
