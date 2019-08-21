package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpApp {
	//@Autowired
public Emp registerEmp(int id,String name,String city,double salary)
{
	Emp employee =new Emp(id,name,city,salary);
	return employee;
}
public int save(Emp emp)
{
	return emp.getEmpId();
	
}
}
