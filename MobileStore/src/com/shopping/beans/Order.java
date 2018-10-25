package com.shopping.beans;

import java.sql.Date;

public class Order {

	int orderId;
	String name;
	public Order(int orderId, String name, String email, String productName, String productCompany, int productPrice,
			String address) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.email = email;
		this.productName = productName;
		this.productCompany = productCompany;
		this.productPrice = productPrice;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String	email;
	String productName;
	String productCompany;
	int productPrice;
	String address;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCompany() {
		return productCompany;
	}
	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}



}

