package com.example.service;

import com.example.model.APIResponse;
import com.example.model.Product;
import com.example.model.ProductsFilter;

public interface ProductService {

	public APIResponse getProductsForUser(ProductsFilter productsFilter);
	public APIResponse saveProduct(Product product);
	
}
