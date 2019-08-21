package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MYEMP")

public class Emp {
	@Id
	@Column(name="EMPNO")
private int empId;
	@Column(name="NAME")
private String name;
	@Column(name="SALARY")
private double sal;
@Column(name="ADDRESS")
private String city;
@ManyToOne
@JoinColumn(name="DNO")
private Mydept dept;

public Mydept getDept() {
	return dept;
}

public void setDept(Mydept dept) {
	this.dept = dept;
}

public Emp() {
}

public Emp(int empId, String name, double sal, String city) {
	this.empId = empId;
	this.name = name;
	this.sal = sal;
	this.city = city;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSal() {
	return sal;
}

public void setSal(double sal) {
	this.sal = sal;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}


}
