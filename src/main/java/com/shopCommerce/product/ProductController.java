package com.shopCommerce.product;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping(path = "api/v1/product")
public class ProductController {
	
	private final ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	
	@PostMapping
	public void saveProduct(@RequestBody Product product) {
		product.setProductID(UUID.randomUUID().toString());
		product.setSku("sku_"+ UUID.randomUUID().toString());
		if (product.getProductType() != null) {
			String type = product.getProductType().toString();
			System.out.println("TYPE: " + type);
			if (type.contains("DESC")) {
				double price = product.getPrice();
				product.setPrice(price/2);
			}
		}
		productService.saveProduct(product);
		
	}
}
