package com.shopCommerce.product;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductRespository extends JpaRepository<Product, String> {
	@Query("SELECT p FROM Product p WHERE p.pName = ?1")
	Optional<Product> findProductByPname (String pName);
	
}

