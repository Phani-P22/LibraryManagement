package com.digit.javaTraining.LibraryManagemet.model;

public class User {

	private int uid;
	private String uname;
	private String pwd;
	private String addr;
	private String phone;
	private String email;
	private String status;

	public User() {

	}

	public User(int uid, String uname, String pwd, String addr, String phone, String email, String status) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.pwd = pwd;
		this.addr = addr;
		this.phone = phone;
		this.email = email;
		this.status = status;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
