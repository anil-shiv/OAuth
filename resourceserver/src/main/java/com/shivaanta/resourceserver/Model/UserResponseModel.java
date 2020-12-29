package com.shivaanta.resourceserver.Model;

public class UserResponseModel {
	
	private String firstName;
	private String lastName;
	private String userId;
	
	public UserResponseModel() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public UserResponseModel(String firstName, String lastName, String userId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
	}
	

}
