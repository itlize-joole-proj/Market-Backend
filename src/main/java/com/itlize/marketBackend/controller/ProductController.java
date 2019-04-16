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
	
	@RequestMapping(value="/SubCategory", method = RequestMethod.POST)
	public void getSubCate(@RequestBody SubCategory subCatoryName) {
		boolean hasSubCate = categoryService.hasSubCategory(subCatoryName.getSubCategoryName());
		System.out.println(hasSubCate);
	}
	
	@RequestMapping(value="/Category", method = RequestMethod.POST)
	public List<SubCategory> getCatetogory(@RequestBody Category category) {
		System.out.println(category.getCategoryName());
		List<SubCategory> subCate = categoryService.getSubCate(category.getCategoryName());
		boolean hasCate = categoryService.hasCategory(category.getCategoryName());
		System.out.println("Category exist: " + hasCate);
		return subCate;
	}
	
}
