package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity
@Table(name="users")
@SecondaryTables({
	@SecondaryTable(name="user_credentials"),
	@SecondaryTable(name="user_pay_info"),
	@SecondaryTable(name="curr_charges")
})
public class UserImpl implements User {

	@Id
	@Column(table="users", name="u_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(table="user_credentials", name="u_name")
	private String uName;
	
	@Column(table="users", name="f_name")	
	private String fName;

	@Column(table="users", name="l_name")
	private String lName;

	@Column(table="users", name="email")
	private String email;

	@Column(table="user_credentials", name="p_word")
	private String password;

	/*@Column(table="user_payi_info", name="u_id")*/
	private String cc_info;
	
	/*@Column(table="curr_charges", name="total_amount")*/
	private Double chargeAmount;
	

	@Column(table="users", name="experienced")
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

	public Double getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(Double chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	@Override
	public String toString() {
		return "UserImpl [id=" + id + ", uName=" + uName + ", fName=" + fName + ", lName=" + lName + ", email=" + email
				+ ", password=" + password + ", cc_info=" + cc_info + ", chargeAmount=" + chargeAmount
				+ ", experienced=" + experienced + "]";
	}

	public boolean isExperienced() {
		return experienced;
	}

	public void setExperienced(boolean experienced) {
		this.experienced = experienced;
	}		
}
