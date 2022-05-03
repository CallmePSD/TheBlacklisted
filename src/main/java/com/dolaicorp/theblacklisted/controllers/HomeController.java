package com.dolaicorp.theblacklisted.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String showForm() {
		return "index";
	}
}
