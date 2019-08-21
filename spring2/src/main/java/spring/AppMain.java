package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
public static void main(String args[])
{
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	EmpApp empApp=(EmpApp) ctx.getBean("empApp");
	empApp.registerEmp();
	
	
	
}
}
