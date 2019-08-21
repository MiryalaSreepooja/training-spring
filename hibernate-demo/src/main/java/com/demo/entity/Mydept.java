package com.demo.entity;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MYDEPT")
public class Mydept {
	@Id
	@Column(name="DNO")
private int dNo;
	@Column(name="DNAME")
private String dName;
	@Column(name="MANAGER")
private String manager;
	@OneToMany
	@JoinColumn(name="DNO")
Set<Emp> emps=new HashSet<>();
public Set<Emp> getEmps() {
	return emps;
}

public void setEmps(Set<Emp> emps) {
	this.emps = emps;
}

public Mydept() {
}

public Mydept(int dNo, String dName, String manager) {
	
	this.dNo = dNo;
	this.dName = dName;
	this.manager = manager;
}

public int getdNo() {
	return dNo;
}

public void setdNo(int dNo) {
	this.dNo = dNo;
}

public String getdName() {
	return dName;
}

public void setdName(String dName) {
	this.dName = dName;
}

public String getManager() {
	return manager;
}

public void setManager(String manager) {
	this.manager = manager;
}


}
