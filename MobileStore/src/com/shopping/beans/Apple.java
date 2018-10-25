package com.shopping.beans;

public class Apple {
	
	int productId;
	String productName;
	String productCompany;
	int productPrice;
	int referenceNumber;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
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
	
	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(int referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public Apple(int productId, String productName, String productCompany, int productPrice, int referenceNumber) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCompany = productCompany;
		this.productPrice = productPrice;
		this.referenceNumber = referenceNumber;
	}
	
	
	
	

}
