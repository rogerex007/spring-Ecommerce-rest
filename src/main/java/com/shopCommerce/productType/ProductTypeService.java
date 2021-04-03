package com.shopCommerce.productType;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductTypeService {
	private final ProductTypeRepository productTypeRepository;
	
	@Autowired
	public ProductTypeService(ProductTypeRepository productTypeRepository) {
		this.productTypeRepository = productTypeRepository;
	}
	
	@Transactional
	public List<ProductType> getProductsType() {
		
		return productTypeRepository.findAll();
	}
	
	@Transactional
	public Optional<ProductType> getProductType(String productTypeID) {
		return productTypeRepository.findById(productTypeID);
	}
	
	@Transactional
	public void saveProductType(ProductType productType) {
		Optional<ProductType> productTypeByPtName = productTypeRepository
				.findProductTypeByPtName(productType.getPtname());
		
		if (productTypeByPtName.isPresent()) {
			throw new IllegalStateException("Product type name is taken");
		}
		productTypeRepository.save(productType);
	}
}
