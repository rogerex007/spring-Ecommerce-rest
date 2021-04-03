package com.shopCommerce.products_cart;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.shopCommerce.product.Product;
import com.shopCommerce.shoppingCart.ShoppingCart;

import lombok.Data;

@Data
@Entity
@Table
public class ProductsCart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	@ManyToOne(targetEntity = ShoppingCart.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_shp_id", referencedColumnName = "shpc_id")
	private ShoppingCart shoppingCart;
	
	@ManyToOne(targetEntity = Product.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_product_id", referencedColumnName = "product_id")
	private Product products;
	
	@Column(name = "qty")
	private int quantity;
	
	public ProductsCart() {
		
	}

	public ProductsCart(String id, ShoppingCart shoppingCart, Product products, int quantity) {
		this.id = id;
		this.shoppingCart = shoppingCart;
		this.products = products;
		this.quantity = quantity;
	}
	
	public ProductsCart(ShoppingCart shoppingCart, Product products, int quantity) {
		this.shoppingCart = shoppingCart;
		this.products = products;
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public Product getProducts() {
		return products;
	}

	public void setProducts(Product products) {
		this.products = products;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductsCart [id=" + id + ", shoppingCart=" + shoppingCart + ", products=" + products + ", quantity="
				+ quantity + "]";
	}
	
	
	
	
	
}
