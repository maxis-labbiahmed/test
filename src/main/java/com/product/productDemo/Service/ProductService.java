package com.product.productDemo.Service;

import java.util.List;

import com.product.productDemo.Entity.Product;
import com.product.productDemo.Repository.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductRepo repo;
	
	public Product getProducts(int id) {
		return repo.findById(id).get();
		
	}
}
