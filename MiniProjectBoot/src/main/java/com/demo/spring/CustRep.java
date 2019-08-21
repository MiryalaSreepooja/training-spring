package com.demo.spring;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.demo.spring.entity.Customer;
import com.demo.spring.entity.Requests;

public interface CustRep extends JpaRepositoryImplementation<Customer,Integer> {



	

}
