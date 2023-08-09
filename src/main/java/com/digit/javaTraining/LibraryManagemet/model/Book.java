package com.digit.javaTraining.LibraryManagemet.model;

public class Book {

	private int bid;
	private String bname;
	private String author;
	private float cost;
	private String category;
	private String status;
	
	public Book() {
		
	}

	public Book(int bid, String bname, String author, float cost, String category, String status) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.cost = cost;
		this.category = category;
		this.status = status;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
