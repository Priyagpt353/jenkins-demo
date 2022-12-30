package com.ngarro.springDemo.springDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/home")
	public String home() {
		return "This is home";
	}
}
