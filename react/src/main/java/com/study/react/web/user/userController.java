package com.study.react.web.user;

import org.json.JSONObject;
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
		
		String json = "{ 'A' : 'Hello Json!!',"
				+ "'B' : '안녕하세요 제이슨',"
				+ "'C' : 'Json Data',"
				+ "'Boolean' : 'true',"
				+ "'Number' : 2020"
				+ "}";
		
		return json;
	}
}
