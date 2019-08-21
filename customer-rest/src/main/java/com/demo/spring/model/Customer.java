package com.demo.spring.model;

import java.util.Date;

public class Customer {
private Long id;
private String firstName;
private String lastName;
private String email;
private String mobile;
private Date dateOfBirth;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}

public Customer(Long i, String firstName, String lastName, String email, String mobile) {
	this.id = i;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.mobile = mobile;
	this.dateOfBirth = new Date();
}
public Customer() {
}


}
