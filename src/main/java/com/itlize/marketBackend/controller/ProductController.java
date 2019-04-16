package com.itlize.marketBackend.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itlize.marketBackend.model.Category;
import com.itlize.marketBackend.model.SubCategory;
import com.itlize.marketBackend.service.CategoryService;

@RestController
public class ProductController {
	
	public ProductController() {
		// TODO Auto-generated constructor stub
		System.out.println("ProductController initialization...");
	}

	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value="/subCategory", method = RequestMethod.POST)
	public void getSubCate(@RequestBody SubCategory subCatoryName) {
		boolean hasSubCate = categoryService.hasSubCategory(subCatoryName.getSubCategoryName());
		System.out.println(hasSubCate);
	}
	
	@RequestMapping(value="/Category", method = RequestMethod.POST)
	public void getCatetogory(@RequestBody Category category) {
		System.out.println(category.getCategoryName());
		Map<String, String> allSubCateNamesMap = categoryService.getAllSubCateNames(category.getCategoryName());
		List<String> subCate = categoryService.getSubCate(category.getCategoryName());
		boolean hasCate = categoryService.hasCategory(category.getCategoryName());
		System.out.println("Category exist: " + hasCate);
		System.out.println("SubCate and Id: ");
		for (String key : allSubCateNamesMap.keySet()) {
			System.out.println("\t" + key + " : " + allSubCateNamesMap.get(key));
		}
		System.out.println("SubCate: ");
		for (String name : subCate) {
			System.out.println("\t" + name + " ");
		}
	}
	
}
