package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Contact")
public class Contact {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="email")
	private String email;
	@Column(name="name")
	private String name;
	@Column(name="message")
	private String message;
	
	


	public Contact( String name, String message,String email) {
		super();
		
		
		this.email = email;
		this.message = message;
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


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Contact() {
		
		
	}
}
