package com.itlize.marketBackend.service;

import java.util.List;
import java.util.Map;

import com.itlize.marketBackend.model.SubCategory;

public interface CategoryService {
	
//	Map<String, String> getAllSubCateNames(String cateName); // -> subCate list

	List<SubCategory> getSubCate(String Category);

	Boolean hasCategory(String category);
	
	boolean hasSubCategory(String subCateName);

}
