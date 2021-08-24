package com.study.react.web.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

	@GetMapping("/")
	public String user() {
		return "project start";
	}
	
	@GetMapping("/user")
	public String username() {
		return "heojun";
	}
}
