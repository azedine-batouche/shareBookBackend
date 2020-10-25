package com.compagny.shareBookB.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.compagny.shareBookB.model.Book;
import com.compagny.shareBookB.model.User;

@RestController
public class UserController {

	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable("userId") String userId) {
		
		User user =new User();
		user.setIdUser("1");
		user.setFirstName("Azedine");
		user.setLastName("Batouche");	
		return user;
	}
	
	@PostMapping("/users")
	@ResponseStatus(value = HttpStatus.CREATED)
	public User createUser(@RequestBody User user) {
		
		return user;
	}
	
	
	
	@GetMapping("/users/delete/{userId}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void  deleteUser(@PathVariable("userId") String userId) {
		
	}
	

	
	
}

	