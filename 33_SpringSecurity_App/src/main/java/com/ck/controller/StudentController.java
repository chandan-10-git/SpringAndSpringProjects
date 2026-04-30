package com.ck.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student/attendance") 
	public String attendance() {
		return "Student attendence api";
	}
	
	@GetMapping("/student/placement") 
	public String placement() {
		return "Student placement api";
	}

}
