package com.itlize.marketBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itlize.marketBackend.model.Attribute;
import com.itlize.marketBackend.service.FilterService;

@RestController
public class FilterController {
	
	@Autowired
	private FilterService filterService;
	
	@RequestMapping(value = "/filter/{subCateId}", method = RequestMethod.GET)
	public List<Attribute> getFilter(@PathVariable("subCateId")int subCategoryId) {
		System.out.println("filter controller!!!");
		return filterService.getFilterAttributes(subCategoryId);
	}
	
}
