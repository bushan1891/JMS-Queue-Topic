package io.bush.model;

public class Email {
	String email;
	String name;
	public Email(String email, String name) {
		// TODO Auto-generated constructor stub
		this.email=email;
		this.name=name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
