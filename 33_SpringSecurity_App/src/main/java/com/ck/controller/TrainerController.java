package com.ck.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainerController {
	
	@GetMapping("/trainer/class") 
	public String startClass() {
		return "Trainer start class api";
	}
	
	@GetMapping("/trainer/assesment") 
	public String assesment() {
		return "Trainer assesment api";
	}


}
