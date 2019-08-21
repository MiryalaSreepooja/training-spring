package com.demo.spring.rest;

public class MyRessponse {
	private String message;

	public MyRessponse() {
	}

	public MyRessponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
