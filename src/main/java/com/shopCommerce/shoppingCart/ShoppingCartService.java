package com.shopCommerce.shoppingCart;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {
	
	private final ShoppingCartRepository shoppingCartRepository;
	
	@Autowired
	public ShoppingCartService (ShoppingCartRepository shoppingCartRepository) {
		this.shoppingCartRepository = shoppingCartRepository;
	}
	
	@Transactional
	public List<ShoppingCart> getShoppingCarts (){
		return shoppingCartRepository.findAll();
	}
	
	@Transactional
	public void saveShoppingCart(ShoppingCart shoppingCart) {
		shoppingCartRepository.save(shoppingCart);
	}
}
