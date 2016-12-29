package com.orange.springaop.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopAspectj {

	//@Pointcut("@within(com.orange.springaop.common.AopAnnotation)") class type
	@Pointcut("@annotation(com.orange.springaop.common.AopAnnotation)") //method
	public void aopPoint() {
	}

	@Before(value = "aopPoint()")
	public void bef(JoinPoint jp) {
		System.out.println("sdfa");
	}
}
