package com.example.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.example.model.Product;
import com.example.model.Products;

public class ProcessData {
	public static List<Products> products = new ArrayList<>();
	public volatile List<Products> soldProducts = new ArrayList<>();

	public List<Products> getProducts(String type, String value, String categories) {
		List<Products> respProducts = new ArrayList<>();

		List<Products> requiredProducts = products.stream()
				.filter(pr -> categories.equalsIgnoreCase(pr.getProductCategoryType())).collect(Collectors.toList());
		List<Product> prds = new ArrayList<>();
		switch (type) {
		case "brand":
			prds = requiredProducts.get(0).getProductsList().stream()
					.filter(pr -> value.equalsIgnoreCase(pr.getBrand())).collect(Collectors.toList());

			break;
		case "price":
			prds = requiredProducts.get(0).getProductsList().stream()
					.filter(pr ->  pr.getPrice()<= Double.parseDouble(value)).collect(Collectors.toList());
			Collections.reverse(prds);
			break;
		case "color":
			prds = requiredProducts.get(0).getProductsList().stream()
					.filter(pr -> value.equalsIgnoreCase(pr.getColor())).collect(Collectors.toList());
			break;
		case "size":
			prds = requiredProducts.get(0).getProductsList().stream()
					.filter(pr -> Integer.parseInt(value) == pr.getSize()).collect(Collectors.toList());
			break;
		case "sgk":
			break;
		default:
			prds = requiredProducts.get(0).getProductsList().stream()
					.filter(pr -> Double.parseDouble(value) <= pr.getPrice()).collect(Collectors.toList());
			Collections.reverse(prds);
			break;
		}
		Products p = new Products(categories, prds);
		respProducts.add(p);
		return respProducts;
	}

	public boolean saveProduct(Product product) {
		List<Products> prds = products.stream()
				.filter(pr -> pr.getProductCategoryType().equalsIgnoreCase(product.getProductCategoryType()))
				.collect(Collectors.toList());
		Products finalProduct = null;
		if (null != prds) {
			finalProduct = new Products(product.getProductCategoryType(), prds.get(0).getProductsList());
			products.add(finalProduct);
			return true;
		} 
		
		return false;
	}

	static {

		Product product = new Product(1, "Basics", 2500.00, "white", 40, "12", "Shirts");
		Product product1 = new Product(2, "Arrow", 2500.00, "blue", 40, "12", "Shirts");
		Product product2 = new Product(3, "LP", 2500.00, "green", 40, "12", "Shirts");
		Product product3 = new Product(4, "VH", 2500.00, "white", 40, "12","Shirts");
		List<Product> prod = new ArrayList<>();
		prod.add(product);
		prod.add(product1);
		prod.add(product2);
		prod.add(product3);
		Products producta = new Products("Shirts", prod);
		products.add(producta);
	}

}
