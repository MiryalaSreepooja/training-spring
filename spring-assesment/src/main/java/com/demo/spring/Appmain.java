package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Appmain {
	public static void main(String args[])
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmpApp empApp=(EmpApp) ctx.getBean("empApp");
		Emp e=empApp.registerEmp(100,"pooja","hyderabad",50000);
		
		Emp e1=empApp.registerEmp(200,"kavya","hyderabad",50001);
		System.out.println(empApp.save(e));
		System.out.println(empApp.save(e1));
	}
}
