package com.product.productDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.product.productDemo.Entity.Product;
import com.product.productDemo.Service.ProductService;


@RestController
public class ProductController {

	@Autowired
	ProductService srv;
	
	Product getAllproduct(@PathVariable("id")int id) {
		return srv.getProducts(id);
	}
}
