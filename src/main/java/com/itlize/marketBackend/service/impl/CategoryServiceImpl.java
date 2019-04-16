package com.itlize.marketBackend.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itlize.marketBackend.dao.CategoryDAO;
import com.itlize.marketBackend.dao.SubCategoryDAO;
import com.itlize.marketBackend.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	SubCategoryDAO subCategoryDao;
	
	@Override
	public boolean hasSubCategory(String subCateName) {
		// TODO Auto-generated method stub
		return subCategoryDao.hasSubCate(subCateName);
	}
	
	@Autowired
	CategoryDAO categoryDAO;

	@Override
	public Map<String, String> getAllSubCateNames(String cateName) {
		// TODO Auto-generated method stub
		return categoryDAO.getAllSubCateNames(cateName);
	}

	@Override
	public List<String> getSubCate(String Category) {
		// TODO Auto-generated method stub
		return categoryDAO.getSubCate(Category);
	}

	@Override
	public Boolean hasCategory(String category) {
		// TODO Auto-generated method stub
		return categoryDAO.hasCategory(category);
	}

}
