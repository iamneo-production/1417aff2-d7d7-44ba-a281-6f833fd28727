package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="name")
	private String name;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDOB() {
		return DOB;
	}


	public void setDOB(String dOB) {
		DOB = dOB;
	}


	public Long getCardnumber() {
		return Cardnumber;
	}


	public void setCardnumber(Long cardnumber) {
		Cardnumber = cardnumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getCcv() {
		return ccv;
	}


	public void setCcv(int ccv) {
		this.ccv = ccv;
	}


	@Column(name="DOB")
	private String DOB;
	@Column(name="Cardnumber")
	private Long Cardnumber ;
	@Column(name="email")
	private String email ;
	@Column(name="cv")
	private int ccv ;
	
	

    public Payment( String email, String DOB,String name,int ccv,long Cardnumber) {
		super();
		
		
		this.email = email;
		this.DOB = DOB;
		this.name = name;
		this.ccv = ccv;
		this.Cardnumber = Cardnumber;
		
	
	}


	public Payment() {
		
		
	}
}

