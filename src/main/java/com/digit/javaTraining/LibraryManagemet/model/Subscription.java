package com.digit.javaTraining.LibraryManagemet.model;

import java.util.Date;

public class Subscription {

	private int sub_id;
	private int user_id;
	private float amount;
	private Long invoice_no;
	private Date date;
	
	public Subscription() {
		
	}

	public Subscription(int sub_id, int user_id, float amount, Long invoice_no, Date date) {
		super();
		this.sub_id = sub_id;
		this.user_id = user_id;
		this.amount = amount;
		this.invoice_no = invoice_no;
		this.date = date;
	}

	public int getSub_id() {
		return sub_id;
	}

	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Long getInvoice_no() {
		return invoice_no;
	}

	public void setInvoice_no(Long invoice_no) {
		this.invoice_no = invoice_no;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
