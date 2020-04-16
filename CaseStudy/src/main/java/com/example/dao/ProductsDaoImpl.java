package com.example.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dp.ProcessData;
import com.example.model.Product;
import com.example.model.Products;
import com.example.model.ProductsFilter;

@Service
public class ProductsDaoImpl implements ProductsDao {
	ProcessData processData = new ProcessData();
	@Override
	public List<Products> getProductsForUser(ProductsFilter productsFilter) {
		
		return processData.getProducts(productsFilter.getType(), productsFilter.getValue(),
				productsFilter.getCategory());
	}

	@Override
	public boolean saveProduct(Product product) {
		
		return processData.saveProduct(product);
	}

}
