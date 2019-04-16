package com.itlize.marketBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itlize.marketBackend.model.Manufacturer;
import com.itlize.marketBackend.model.Sales;
import com.itlize.marketBackend.service.ProductService;

@RestController
public class ProductController {

	public ProductController() {
		// TODO Auto-generated constructor stub
		System.out.println("ProductController initialization...");
	}

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/Manufacturer/{id}", method = RequestMethod.GET)
	public Manufacturer getManufacturerInfo(@PathVariable("id") String manuId) {
		return productService.getManufacturer(Integer.parseInt(manuId));
	}

	@RequestMapping(value = "/Sale/{id}", method = RequestMethod.GET)
	public Sales getSaleInfo(@PathVariable("id") String saleId) {
		return productService.getSale(Integer.parseInt(saleId));
	}

}
