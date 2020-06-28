package com.expava.gpp.contentmanagement.model;

import javax.validation.constraints.NotNull;

public class User {

	@NotNull(message = "First name is required.")
	private String firstname;
	 
	@NotNull(message = "Last name is required.")
	private String lastname;
	
	private Character gender;

	public User() {
	}

	public User(String firstname, String lastname, Character gender) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", Gender=" + gender + "]";
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

}

