package com.itlize.marketBackend.dao;

import java.util.List;
import java.util.Map;

public interface CategoryDAO {

	Map<String, String> getAllSubCateNames(String cateName); // -> subCate list

	List<String> getSubCate(String Category);

	Boolean hasCategory(String category);

}
