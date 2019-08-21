package com.demo.spring;
import java.util.ArrayList;
import java.util.List;

import com.demo.spring.model.*;
public class CustomerDao {
private static List<Customer> customers;
{
customers=new ArrayList();
Customer c1=new Customer((long) 101,"john","berth","john@gmail.com","9473847384");
customers.add(c1);
Customer c2=new Customer((long) 102,"johnny","katre","johnny@gmail.com","947897847384");
customers.add(c1);
}
public Long delete(Long id)
{
	for(Customer c: customers)
		if(c.getId().equals(id))
			customers.remove(c);
	return id;
}
public void getAllEmp()
{
	
}
}
