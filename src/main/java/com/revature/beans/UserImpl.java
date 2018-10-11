package com.revature.beans;

import javax.persistence.Table;

@Table(name="USER_CREDENTIALS")
public class UserImpl implements User {

	private int id;
	private String uName, fName, lName, email, password, cc_info;
	private double chargeAmount;
	private boolean experienced;
	
	/*
	 * No args constructor
	 */
	public UserImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCc_info() {
		return cc_info;
	}

	public void setCc_info(String cc_info) {
		this.cc_info = cc_info;
	}

	public double getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(double chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public boolean isExperienced() {
		return experienced;
	}

	public void setExperienced(boolean experienced) {
		this.experienced = experienced;
	}		
}
