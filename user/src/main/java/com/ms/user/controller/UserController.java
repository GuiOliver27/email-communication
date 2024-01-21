package com.ms.user.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.user.dtos.UserRecordDto;
import com.ms.user.models.UserModel;
import com.ms.user.services.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {
	final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}



	@PostMapping("/users")
	public ResponseEntity<UserModel> saveUser(@RequestBody @Valid UserRecordDto userReCordDto) {
		var userModel = new UserModel();
		
		BeanUtils.copyProperties(userReCordDto, userModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userModel));
	}
}
