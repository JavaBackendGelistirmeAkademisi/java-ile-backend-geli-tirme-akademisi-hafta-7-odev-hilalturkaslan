package com.example.freelancer_matching_platform.controller;

import com.example.freelancer_matching_platform.model.User;
import com.example.freelancer_matching_platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		User savedUser = userService.registerUser(user);
		return ResponseEntity.ok(savedUser);
	}

	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody User user) {
		Optional<User> loggedUser = userService.loginUser(user.getUsername(), user.getPassword());
		if (loggedUser.isPresent()) {
			return ResponseEntity.ok("Giriş başarılı");
		} else {
			return ResponseEntity.status(401).body("Giriş başarısız");
		}
	}
}


