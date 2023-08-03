package com.api.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private Integer productId;
	private String productName;
	private String productDescription;
	private LocalDate expiry;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String description) {
		this.productDescription = description;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription=" + productDescription
				+ ", expiry=" + expiry + "]";
	}
	
	
	

}
