package com.orange.springaop.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.orange.springaop.module.UserModule;
import com.orange.springaop.service.UserService;

@Service("userService")
public class UserBusiness implements UserService {

	@Override
	public List<UserModule> getAllUsers() {
		List<UserModule> list = new ArrayList<UserModule>();
		UserModule module1 = new UserModule();
		module1.setName("hyman");
		module1.setPwd("admin");
		UserModule module2 = new UserModule();
		module2.setName("ADMIN");
		module2.setPwd("ADMIN");
		list.add(module1);
		list.add(module2);
		return list;
	}

	@Override
	public boolean checkUser(UserModule module) {
		if ("admin".equalsIgnoreCase(module.getName())
				&& "admin".equalsIgnoreCase(module.getPwd())) {
			return true;
		}
		return false;
	}

}
