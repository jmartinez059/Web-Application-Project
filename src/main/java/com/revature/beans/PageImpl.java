package com.revature.beans;

import java.util.Map;

public class PageImpl {

	private int id, userId;
	private String pageName;
	private boolean published;
	private Comp[] components;
	private Map<Comp, String[]> compDetails;
	
	public PageImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public Comp[] getComponents() {
		return components;
	}

	public void setComponents(Comp[] components) {
		this.components = components;
	}

	public Map<Comp, String[]> getCompDetails() {
		return compDetails;
	}

	public void setCompDetails(Map<Comp, String[]> compDetails) {
		this.compDetails = compDetails;
	}
}
