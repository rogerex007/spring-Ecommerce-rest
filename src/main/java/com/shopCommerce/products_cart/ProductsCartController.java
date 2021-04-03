package com.shopCommerce.products_cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/productsCart")
public class ProductsCartController {
	
	private final ProductsCartService productCartService;
	
	@Autowired
	public ProductsCartController(ProductsCartService productCartService) {
		this.productCartService = productCartService;
	}
	
	@GetMapping
	public List<ProductsCart> getProductsCart(){
		return  productCartService.getproductsCart();
	}
	
	@PostMapping
	public void saveProducCart(@RequestBody ProductsCart productCart) {
		productCartService.saveProductCart(productCart);
	}

}
