package com.shopCommerce.products_cart;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsCartService {
	
	private final ProductsCartRepository productCartRepository;
	
	@Autowired
	public ProductsCartService(ProductsCartRepository productCartRepository) {
		this.productCartRepository = productCartRepository;
	}
	
	@Transactional
	public List<ProductsCart> getproductsCart(){
		return productCartRepository.findAll();
	}
	
	@Transactional
	public void saveProductCart(ProductsCart productsCart) {
		productsCart.setId(UUID.randomUUID().toString());
		productCartRepository.save(productsCart);
	}
}
