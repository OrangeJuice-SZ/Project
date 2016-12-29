package com.orange.springaop.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.orange.springaop.common.AopAnnotation;
import com.orange.springaop.module.UserModule;
import com.orange.springaop.service.UserService;

@Service
public class UserController {

	@Resource
	private UserService userService;
	
	@AopAnnotation
	public List<UserModule> getAllUsers() {
		return userService.getAllUsers();
	}
	public boolean checkUser(UserModule user) {
		return userService.checkUser(user);
	}

}
