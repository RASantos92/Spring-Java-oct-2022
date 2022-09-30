package com.robert.firstspringdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@RequestMapping("/")
	public String apiTest() {
		return "Hello World";
	}
	
	@RequestMapping("/api/number")
	public int numberTest() {
		return 7;
	}


}
