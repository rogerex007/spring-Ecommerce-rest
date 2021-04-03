package com.shopCommerce.product;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.shopCommerce.productType.ProductType;

import lombok.Data;

@Data
@Entity
@Table
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "product_id")
	private String productID;

	@Column(name = "pName")
	private String pName;
	
	@Column(name = "sku")
	private String sku;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "description")
	private String description;

	@ManyToOne(targetEntity = ProductType.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "pt_fk", referencedColumnName = "pt_id")
	private ProductType productType;
	
	public Product() {
		
	}

	public Product(String productID, String sku, double price, String description, ProductType productType) {
		this.productID = productID;
		this.sku = sku;
		this.price = price;
		this.description = description;
		this.productType = productType;
	}
	
	public Product(String sku, double price, String description, ProductType productType) {
		this.sku = sku;
		this.price = price;
		this.description = description;
		this.productType = productType;
	}
	


	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", pName=" + pName + ", sku=" + sku + ", price=" + price
				+ ", description=" + description + ", productType=" + productType + "]";
	}
	

	

	
	
	
	

}
