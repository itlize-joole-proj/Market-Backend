package com.itlize.marketBackend.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itlize.marketBackend.dao.ManufacturerDAO;
import com.itlize.marketBackend.dao.ProductDAO;
import com.itlize.marketBackend.dao.SalesDAO;
import com.itlize.marketBackend.model.Manufacturer;
import com.itlize.marketBackend.model.Product;
import com.itlize.marketBackend.model.Sales;
import com.itlize.marketBackend.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDao;

	@Override
	public List<Product> getAllSubCateProducts(int subCategoryID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(int ProductID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> filter(Map<String, String> filterParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> compare(List<Product> productIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product createProduct(Product product) {
		productDao.createProduct(product);
		return null;
	}
	
	@Autowired
	ManufacturerDAO manufaturerDao;

	@Override
	public Manufacturer getManufacturer(int id) {
		// TODO Auto-generated method stub
		return manufaturerDao.getManufacturer(id);
	}
	
	@Autowired
	SalesDAO salesDao;

	@Override
	public Sales getSale(int id) {
		// TODO Auto-generated method stub
		return salesDao.getSale(id);
	}
	
	

}
