package com.orange.springaop.service;

import java.util.List;

import com.orange.springaop.module.UserModule;

public interface UserService {
	
	List<UserModule> getAllUsers();
	
	boolean checkUser(UserModule module);

}
