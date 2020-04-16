package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.APIResponse;
import com.example.model.Product;
import com.example.model.ProductsFilter;
import com.example.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductsController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/user")
	public APIResponse getPorductsByUser(@RequestBody ProductsFilter productsFilter) {
		return productService.getProductsForUser(productsFilter);
	}
	
	@PostMapping("/save")
	public APIResponse saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
}
