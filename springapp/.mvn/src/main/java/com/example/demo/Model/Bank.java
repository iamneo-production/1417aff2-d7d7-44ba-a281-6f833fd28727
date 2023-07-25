package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="marketing")
public class Bank {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="confirmpassword")
	private String confirmpassword;
	
	
	
	public String getname() {
		return name;
	}


	public void setname(String name) {
		this.name = name;
	}


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
	public String getconfirmpassword() {
		return confirmpassword;
	}


	public void setconfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}


	


	public Bank( String name, String email, String password,String confirmpassword) {
		super();
		
		this.name = name;
		this.email = email;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}


	public Bank() {
		
		
	}
}