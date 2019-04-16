package com.itlize.marketBackend.service;

import java.util.List;
import java.util.Map;

public interface CategoryService {
	
	Map<String, String> getAllSubCateNames(String cateName); // -> subCate list

	List<String> getSubCate(String Category);

	Boolean hasCategory(String category);
	
	boolean hasSubCategory(String subCateName);

}
