package com.praveen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;


@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	
	private Integer prodId;
	private String prodName;
	@Lob
	private String description;
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", description=" + description + "]";
	}
	public Product(Integer prodId, String prodName, String description) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.description = description;
	}
	
	public Product() {
		
		super();
		
		
	}
	
	
	
	
	

}
