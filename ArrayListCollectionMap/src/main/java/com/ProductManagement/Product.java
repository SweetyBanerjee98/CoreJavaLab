package com.ProductManagement;

public class Product {

	// product properties
	private int productId;
	private String productName;
	private int productPrice;
	private int productQuantity;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int productPrice, int productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}

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

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + "]";
	}

}
