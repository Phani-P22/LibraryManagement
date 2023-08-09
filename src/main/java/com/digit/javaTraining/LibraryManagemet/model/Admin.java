package com.digit.javaTraining.LibraryManagemet.model;

public class Admin {

	private int admin_id;
	private String admin_pin;

	public Admin() {

	}

	public Admin(int admin_id, String admin_pin) {
		super();
		this.admin_id = admin_id;
		this.admin_pin = admin_pin;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_pin() {
		return admin_pin;
	}

	public void setAdmin_pin(String admin_pin) {
		this.admin_pin = admin_pin;
	}

}
