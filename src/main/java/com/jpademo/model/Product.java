package com.jpademo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	
	@Id
	private int pid;
	private String productName;
	private int qnty;
	private int price;
	
	public Product() {
		
	}
	
	public Product(int pid, String productName, int qnty, int price) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.qnty = qnty;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQnty() {
		return qnty;
	}
	public void setQnty(int qnty) {
		this.qnty = qnty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", qnty=" + qnty + ", price=" + price + "]";
	}
	
	

}
