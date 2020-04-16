package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProductsDao;
import com.example.model.APIResponse;
import com.example.model.Product;
import com.example.model.Products;
import com.example.model.ProductsFilter;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductsDao productsDao;
	
	@Override
	public APIResponse getProductsForUser(ProductsFilter productsFilter) {
		APIResponse apiResponse = new APIResponse();
		List<Products> products = productsDao.getProductsForUser(productsFilter);
		apiResponse.setObjects(products);
		apiResponse.setUserId(productsFilter.getUserId());
		return apiResponse;
	}

	@Override
	public APIResponse saveProduct(Product product) {
		APIResponse apiResponse = new APIResponse();
		if(productsDao.saveProduct(product)) {
		apiResponse.setStatusMessage("Product Saved Successfully.");
		}
		apiResponse.setStatusMessage("Unable to Save Product.");
		return apiResponse;
	}
	
	

}
