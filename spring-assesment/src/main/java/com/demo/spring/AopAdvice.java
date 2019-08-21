package com.demo.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopAdvice {
	@Pointcut("execution(* com.demo.spring.EmpApp*.registerEmp(..))")
	private void pcut() {}
	@Before("pcut()")
	public void hi()
	{
		System.out.println("Hi your Employee id is");
	}
   @AfterReturning("pcut()")
   public void zbye()
   {
	   System.out.println("Ok bye!");
   }
}
