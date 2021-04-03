package com.shopCommerce.shoppingCart;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/shoppingCart")
public class ShoppingCartController {
	
	private final ShoppingCartService shoppingCartService;
	
	@Autowired
	public ShoppingCartController(ShoppingCartService shoppingCartService) {
		this.shoppingCartService = shoppingCartService;
	}
	
	@GetMapping
	public List<ShoppingCart> getShoppingCarts (){
		return shoppingCartService.getShoppingCarts();
	}
	
	@PostMapping
	public void saveShoppingCart (ShoppingCart shoppingCart) {
		shoppingCart.setShoppingCartID(UUID.randomUUID().toString());
		if (shoppingCart.getStatus() == null ) {
			shoppingCart.setStatus(ShoppingCartStatus.PENDING);
		}
		shoppingCartService.saveShoppingCart(shoppingCart);
	}
}
