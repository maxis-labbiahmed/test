package com.product.productDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.productDemo.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
