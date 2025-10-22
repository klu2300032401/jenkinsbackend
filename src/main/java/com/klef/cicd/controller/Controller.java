package com.klef.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	public String run() {
		return "Running";
	}
	@GetMapping("/test")
	public String test() {
		return "Testing";
	}

}
