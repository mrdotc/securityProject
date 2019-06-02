package com.netflix.prodServer.entity;

import java.util.Date;

public class Product {

	private int productId;

	private String productName;

	private Date produceDate;

	public Product() {
	}

	public Product(int productId, String productName, Date produceDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.produceDate = produceDate;
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

	public Date getProduceDate() {
		return produceDate;
	}

	public void setProduceDate(Date produceDate) {
		this.produceDate = produceDate;
	}

}
