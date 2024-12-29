package com.example.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserNameController {
	@GetMapping("/")
	public String Greet() {
		return "Welcome to spring boot";
	}
}
