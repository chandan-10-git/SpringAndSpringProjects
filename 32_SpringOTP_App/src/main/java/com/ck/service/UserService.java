package com.ck.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ck.entities.User;
import com.ck.Repo.*;



@Service
public class UserService {

	@Autowired
	UserRepo userRepo;

	public void register(User user)
	{
		userRepo.save(user);
	}
}
