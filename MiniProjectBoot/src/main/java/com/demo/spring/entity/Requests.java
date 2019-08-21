package com.demo.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="SUPP_REQUESTS")
public class Requests {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "REQUEST_ID")
	private int r_Id;
	@Column(name="SOFTWARE")
	private String software;
	@Column(name="OS")
	private String os;
	@Column(name="PROBLEM")
	private String problem;
	@ManyToOne
	@JoinColumn(name = "EMAIL")
	private Customer customer;
	public Requests(int r_Id, String software, String os, String problem, Customer customer) {
		this.r_Id = r_Id;
		this.software = software;
		this.os = os;
		this.problem = problem;
		this.customer = customer;
	}
	public int getR_Id() {
		return r_Id;
	}
	public void setR_Id(int r_Id) {
		this.r_Id = r_Id;
	}
	public String getSoftware() {
		return software;
	}
	public void setSoftware(String software) {
		this.software = software;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Requests() {
	}
	
}
