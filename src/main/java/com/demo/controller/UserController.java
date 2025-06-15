package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.User;
import com.demo.services.IUserService;

@RestController
public class UserController {

	@Autowired
	private IUserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<String> register(@RequestBody User user) {
		userService.create(user);
		
		return ResponseEntity.ok("Register success");
	}
	
	@GetMapping("/users")
	@ResponseBody
	public List<User> getUsers() {
		return userService.findAll();
	}
}
