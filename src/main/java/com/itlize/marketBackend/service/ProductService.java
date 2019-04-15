package com.itlize.marketBackend.service;

import java.util.List;
import java.util.Map;

import com.itlize.marketBackend.model.Product;

public interface ProductService {
	List<Product> getAllProducts(String Category, String subCategory);
	List<String> getSubCate(String Category);
	Product getProduct(String suffix);//get all the information of one single product
	List<Product> filter(Map filterParams);
	List<Product> search(String suffix); 
	List<Product> compare(List<String> productIds);
	Product createProduct(Product product);
}
