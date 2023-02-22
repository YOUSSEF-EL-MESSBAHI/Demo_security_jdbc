package com.securityjdbc.demojdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/home")
	public String home() {
		return "<h1> WELCOME </h1>";
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h1> WELCOME user </h1>";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "<h1> WELCOME admin </h1>";
	}
}
