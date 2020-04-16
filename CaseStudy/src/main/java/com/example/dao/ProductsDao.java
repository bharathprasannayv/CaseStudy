package com.example.dao;

import java.util.List;

import com.example.model.Product;
import com.example.model.Products;
import com.example.model.ProductsFilter;


public interface ProductsDao {

	public List<Products> getProductsForUser(ProductsFilter productsFilter);

	public boolean saveProduct(Product product);
}
