package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Mokshi Vyas
 * creation date: 24 Sep 19 4.44pm
 * modification date: 04 Oct 19 9.55 AM
 * @version 2.0
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is persistence class
 * 				it represents database table Product
 * 				it is POJO class.
 *
 */
@XmlRootElement
@XmlType(propOrder = {"productId","name","brand","price"})
@Entity 
@Table(name = "product")
public class Product 
{

	@Id
	@Column(name = "id")
	private int productId;
	private String name;
	private String brand;
	private float price;

public Product() {
	// TODO Auto-generated constructor stub
}


public Product(int productId, String name, String brand, float d) {
	super();
	this.productId = productId;
	this.name = name;
	this.brand = brand;
	this.price = d;
}


public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
}

}
