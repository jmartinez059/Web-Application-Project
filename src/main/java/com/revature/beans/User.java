package com.revature.beans;

public interface User {

	public int getId();

	public void setId(int id);

	public String getuName();

	public void setuName(String uName);

	public String getfName();

	public void setfName(String fName);

	public String getlName();

	public void setlName(String lName);

	public String getEmail();

	public void setEmail(String email);

	public String getPassword();

	public void setPassword(String password);

	public String getCc_info();

	public void setCc_info(String cc_info);

	public double getChargeAmount();

	public void setChargeAmount(double chargeAmount) ;

	public boolean isExperienced();
	
	public void setExperienced(boolean experienced);
}
