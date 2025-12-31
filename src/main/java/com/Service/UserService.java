package com.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.ChangePassword;
import com.Entity.MyUser;
import com.Repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo jpa;
	
	public String createUser(MyUser user) {
		Optional<MyUser> option = jpa.findById(user.getEmail());
		if(!option.isPresent()) {
			jpa.save(user);
			return "User Details Saved";
		}
		else {
			return "User details already present";
		}
	}
	public String changePassword(ChangePassword cp) {
		Optional<MyUser> option = jpa.findById(cp.getEmail());
		if(option.isPresent()) {
			MyUser user=option.get();
			user.setPassword(cp.getNewPassword());
			jpa.save(user);
			return "Password Changed...!";
		}else {
			 return "User not found";
		}
	}
	
}
