package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/hello")
	
	public String sayhello() {
		return "Hello Word! Meu primeiro projeto Spring";
	}

}
