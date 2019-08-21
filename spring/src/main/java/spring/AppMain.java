package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
public static void main(String args[])
{
	ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
	WriterApp app=(WriterApp)ctx.getBean("app");
	app.print("tea ");
	
}
}
