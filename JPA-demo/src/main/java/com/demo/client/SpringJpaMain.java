package com.demo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.entity.Emp;
import com.demo.spring.JpaConfig;

public class SpringJpaMain {
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JpaConfig.class);
		EmpJpaDao dao=(EmpJpaDao)ctx.getBean("empJpaDao");
		dao.findEmp(100);
		dao.saveEmp(new Emp(301,"Narender",300000,"delhi"));
	}

}
