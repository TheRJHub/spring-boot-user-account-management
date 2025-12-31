package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.ChangePassword;
import com.Entity.MyUser;
import com.Service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping("/public/api/create-user")
	public String saveUser(@RequestBody MyUser user) {
		return service.createUser(user);

	}
	

	@RequestMapping("/public/api/changepassword")
	public String changePassword(@RequestBody ChangePassword cp) {
		return service.changePassword(cp);
	}
}
