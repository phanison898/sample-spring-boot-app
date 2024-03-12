package com.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/")
	public String home() {
		return "hello world!";
	}
	
	@GetMapping("/profile")
	public String profile() {
		return "Profile page";
	}
	
	@GetMapping("/about")
	public String hello() {
		return "About page";
	}

}
