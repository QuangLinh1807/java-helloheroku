package com.example.Demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	@GetMapping("/heroku")
	public String heroku() {
		return "Hello, from Heroku";
	}
}
