package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.dao.CustomerDao;
import com.demo.entity.Customer;

public class CustomerController {
     
	@Autowired
	private CustomerDao CustomerDao;
	
	@GetMapping("/custtomers")
	public List getCustomers()
	{
		return CustomerDao.list();
	}
	@GetMapping("/customers/{id}")
	public ResponseEntity getCustomer(@PathVariable("id")Long id)
	{
		Customer customer=CustomerDao.get(id);
		if(customer==null)
		{
			return new ResponseEntity("No customer found for if"+id, HttpStatus.OK);
		}
		return new ResponseEntity(customer,HttpStatus.OK);
	}
	@GetMapping("/customers/{id}")
	public ResponseEntity deleteCustomer(@PathVariable Long id)
	{
		if(null==CustomerDao.delete(id)) {
			return new ResponseEntity("No customer found for id"+id, HttpStatus.OK);
		}
		return new ResponseEntity(id,HttpStatus.OK);
	}
	public ResponseEntity createCustomer(@RequestBody Customer customer)
	{
	CustomerDao.create(customer);
	return new ResponseEntity(customer,HttpStatus.OK);
	}
	
	
	
	
}
