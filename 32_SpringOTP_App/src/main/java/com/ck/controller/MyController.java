package com.ck.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;



import com.ck.entities.User;

import com.ck.service.UserService;



@Controller

public class MyController {

	

	@Autowired
	UserService userServ;

	

	@GetMapping("/")

	public String displaySignUpPage()

	{

		return "index";

	}



	@PostMapping("/register")

	public String registerUser(@ModelAttribute User user)

	{

		userServ.register(user);

		System.out.println("Registration Successfull......");

		return "login";

	}

	

	

	

	

	

	

	

	

	

}
