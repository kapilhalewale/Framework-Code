/*
 * Auther  : H Kapil Kumar
 * Date    : 12/22/2016
 * Company : Vanward Information Technologies Pvt. Ltd. Bangalore
 */

package com.kapil.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Product implements Serializable
{
	private static final long serialVersionUID = -1493937818144238678L;
	private int id;
	private String productName;
	private int quantity;
	private BigDecimal price;
	private Date productExpiry;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getProductExpiry() {
		return productExpiry;
	}
	public void setProductExpiry(Date productExpiry) {
		this.productExpiry = productExpiry;
	}
}
