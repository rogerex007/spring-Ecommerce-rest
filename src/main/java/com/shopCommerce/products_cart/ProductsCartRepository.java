package com.shopCommerce.products_cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsCartRepository extends JpaRepository<ProductsCart, String> {

}
