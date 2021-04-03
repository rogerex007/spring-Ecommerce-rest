package com.shopCommerce.productType;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;


import com.shopCommerce.product.Product;

import lombok.Data;


@Data
@Entity
@Table
public class ProductType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "pt_id")
	private String productTypeID;
	
	@Column(name = "ptname")
	private String ptname;
	

	
	public ProductType() {
		
	}
	
	public ProductType(String productTypeId, String ptname, Product product) {
		this.productTypeID = productTypeId;
	
	}
	
	public ProductType(String ptname) {
		this.ptname = ptname;
	}

	public String getProductTypeID() {
		return productTypeID;
	}

	public void setProductTypeID(String producTypeID) {
		this.productTypeID = producTypeID;
	}

	public String getPtname() {
		return ptname;
	}

	public void setPtname(String ptname) {
		this.ptname = ptname;
	}

	@Override
	public String toString() {
		return "ProductType [productTypeID=" + productTypeID + ", ptname=" + ptname + "]";
	}





	




	
	


	
	
	
}
