package com.shopCommerce.productType;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, String>  {
	
	@Query("SELECT pt FROM ProductType pt WHERE pt.ptname = ?1 ")
	Optional<ProductType> findProductTypeByPtName (String ptname);
}
