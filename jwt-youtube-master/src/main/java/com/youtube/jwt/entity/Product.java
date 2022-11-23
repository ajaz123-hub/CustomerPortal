package com.youtube.jwt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productID;
	private String productName;
	private String productDescription;
	private double productDiscountPrice;
	private double productActualPrice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer productID, String productName, String productDescription, double productDiscountPrice,
			double productActualPrice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productDiscountPrice = productDiscountPrice;
		this.productActualPrice = productActualPrice;
	}
	public Integer getProductID() {
		return productID;
	}
	public void setProductID(Integer productID) {
		this.productID = productID;
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
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getProductDiscountPrice() {
		return productDiscountPrice;
	}
	public void setProductDiscountPrice(double productDiscountPrice) {
		this.productDiscountPrice = productDiscountPrice;
	}
	public double getProductActualPrice() {
		return productActualPrice;
	}
	public void setProductActualPrice(double productActualPrice) {
		this.productActualPrice = productActualPrice;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productDiscountPrice=" + productDiscountPrice + ", productActualPrice="
				+ productActualPrice + "]";
	}
	

}