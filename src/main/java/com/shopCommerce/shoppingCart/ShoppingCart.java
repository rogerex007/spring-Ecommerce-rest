package com.shopCommerce.shoppingCart;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;




import lombok.Data;

@Data
@Entity
@Table
public class ShoppingCart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "shpc_id")
	private String shoppingCartID;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private ShoppingCartStatus status;
	
	public ShoppingCart() {
		
	}

	public ShoppingCart(String shoppingCartID, ShoppingCartStatus status) {
		this.shoppingCartID = shoppingCartID;
		this.status = status;
	}
	
	public ShoppingCart(ShoppingCartStatus status) {
		this.status = status;
	}

	public String getShoppingCartID() {
		return shoppingCartID;
	}

	public void setShoppingCartID(String shoppingCartID) {
		this.shoppingCartID = shoppingCartID;
	}

	public ShoppingCartStatus getStatus() {
		return status;
	}

	public void setStatus(ShoppingCartStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ShoppingCart [shoppingCartID=" + shoppingCartID + ", status=" + status + "]";
	}
	
	
	
	
	

	
	
	
}
