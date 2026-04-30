package com.ck.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	@GetMapping("/contact")
	public String contact() {
		return "This is Contact Page";
	}
	
	@GetMapping("/logincheck")
	public String logInCheck() {
		return "This is Login Page";
	}
	
	@GetMapping("/greet")
	public String greet() {
		return "This is greet Page";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "This is welcome Page";
	}

}
