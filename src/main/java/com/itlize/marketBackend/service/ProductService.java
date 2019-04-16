package com.itlize.marketBackend.service;

import java.util.List;
import java.util.Map;

import com.itlize.marketBackend.model.Manufacturer;
import com.itlize.marketBackend.model.Product;
import com.itlize.marketBackend.model.Sales;

public interface ProductService {

	List<Product> getAllSubCateProducts(int subCategoryID);

	Product getProduct(int ProductID);

	List<Product> filter(Map<String, String> filterParams);

	List<Product> compare(List<Product> productIds); // Fronted creates Map

	Product createProduct(Product product);
	
	Manufacturer getManufacturer(int id);
	
	Sales getSale(int id);

}
