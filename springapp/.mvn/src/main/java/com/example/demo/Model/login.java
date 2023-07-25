package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="market")
public class login {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	
	public String getemail() {
		return email;
	}


	public void setemail(String email) {
		this.email = email;
	}


	public String getpassword() {
		return password;
	}


	public void setpassword(String password) {
		this.password = password;
	}
	


	


	public login( String email, String password) {
		super();
		
		
		this.email = email;
		this.password = password;
	
	}


	public login() {
		
		
	}
}
