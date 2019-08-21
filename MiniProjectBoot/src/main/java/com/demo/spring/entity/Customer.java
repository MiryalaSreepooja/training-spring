package com.demo.spring.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS")
public class Customer {
	@Id
	@Column(name="EMAIL")
private String email;
	@Column(name="FNAME")
private String fname;
	@Column(name="LNAME")
private String lname;
	@Column(name="PHONE")
private String phone;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "EMAIL")
	Set<Requests> requests = new HashSet<>();
	
public Set<Requests> getRequests() {
		return requests;
	}
	public void setRequests(Set<Requests> requests) {
		this.requests = requests;
	}
public Customer() {
	
}
public Customer(String email, String fname, String lname, String phone) {
	this.email = email;
	this.fname = fname;
	this.lname = lname;
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}



}
