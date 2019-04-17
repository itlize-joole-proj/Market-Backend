package com.itlize.marketBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itlize.marketBackend.domain.SubCategory;
import com.itlize.marketBackend.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	@RequestMapping(value = "/SubCategory-{subCategory}", method = RequestMethod.GET)
	public boolean hasSubCate(@PathVariable("subCategory") String subCatoryName) {

		boolean hasSubCate = categoryService.hasSubCategory(subCatoryName);
		System.out.println(hasSubCate);
		return hasSubCate;

	}

	@RequestMapping(value = "/Category-{Category}/SubCates", method = RequestMethod.GET)
	public List<SubCategory> getSubCateByCate(@PathVariable("Category") String category) {

		List<SubCategory> subCate = categoryService.getSubCate(category);
		boolean hasCate = categoryService.hasCategory(category);
		System.out.println("Category exist: " + hasCate);
		return subCate;

	}

}
