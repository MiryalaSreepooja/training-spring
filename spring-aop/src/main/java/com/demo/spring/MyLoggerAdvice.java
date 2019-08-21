package com.demo.spring;

import org.apache.logging.log4j.core.config.Order;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
//@Component
@Aspect
@Order(1)
public class MyLoggerAdvice {
	@Pointcut("execution(* com.demo.spring.Perf*.perform(..))")
	private void pcut() {}
	@Before("pcut()")
public void logBefore() {
	System.out.println("im before log");
}
	@AfterReturning("pcut()")
public void logAfter() {
	System.out.println("im after log");
}
}
