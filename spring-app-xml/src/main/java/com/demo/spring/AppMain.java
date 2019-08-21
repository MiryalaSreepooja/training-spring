package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * BeanFactory fac=new XmlBeanFactory(new
		 * FileSystemResource("C:\\Users\\Abridge\\TA DBS\\spring-app-xml\\src\\main\\resources\\context.xml"
		 * ));
		 */
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		Mail mail = (Mail) ctx.getBean("mymail");
		System.out.println(mail.getMessage().getBody());
		mail.getMessage().setBody("we will take no break");
		Mail mail1 = (Mail) ctx.getBean("mymail");
		System.out.println(mail1.getMessage().getBody());
	}

}
