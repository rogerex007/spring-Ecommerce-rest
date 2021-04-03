package com.shopCommerce.product;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	private final ProductRespository productRepository;
	
	@Autowired
	public ProductService(ProductRespository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Transactional
	public List<Product> getProducts (){
		return productRepository.findAll();
	}
	
	@Transactional
	public void saveProduct(Product product) {
		Optional<Product> productByPname = productRepository
				.findProductByPname(product.getpName());
		
		if (productByPname.isPresent()) {
			throw new IllegalStateException("Product name is taken");
		}
				
		productRepository.save(product);
	}
}
