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

	public String getPWord();

	public void setPWord(String pWord);

	//public String getCc_info();

	//public void setCc_info(String cc_info);

	//public Double getChargeAmount();

	//public void setChargeAmount(Double chargeAmount) ;

	public boolean isExperienced();
	
	public void setExperienced(boolean experienced);
}
