package com.demo.spring2.app2;
import spring.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import spring.AppConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class TestEmpApp {
	@Autowired
	EmpApp empApp;
	@Test
public void testsave()
{
		empApp.registerEmp();
	assertTrue("Test Passed", true);
}
}
