package com.orange.springaop.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orange.springaop.controller.UserController;
import com.orange.springaop.module.UserModule;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/configuration/bean.xml");
		UserController controller = (UserController) context
				.getBean("userController");
		List<UserModule> list = controller.getAllUsers();
		System.out.println(list.size());

		UserModule model = new UserModule();
		model.setName("admin");
		model.setPwd("admin");
		boolean flag = controller.checkUser(model);
		System.out.println(flag);
	}
}
