package com.itlize.marketBackend.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itlize.marketBackend.dao.CategoryDAO;
import com.itlize.marketBackend.model.Category;
import com.itlize.marketBackend.model.SubCategory;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<SubCategory> getSubCate(String Category) {
		// TODO Auto-generated method stub
		Category category = (Category) sessionFactory.getCurrentSession().createCriteria(Category.class, "c")
				.add(Restrictions.eq("c.categoryName", Category)).uniqueResult();
		int categoryId = category.getCateGoryId();
		List<SubCategory> subCate_list = sessionFactory.getCurrentSession().createCriteria(SubCategory.class, "sc")
				.add(Restrictions.eq("sc.SubCategoryID", categoryId)).list();
		return subCate_list;
	}

	@Override
	public Boolean hasCategory(String cateName) {
		// TODO Auto-generated method stub
		Category category = (Category) sessionFactory.getCurrentSession().createCriteria(Category.class, "c")
				.add(Restrictions.eq("c.categoryName", cateName)).uniqueResult();
		if (category == null) {
			return false;
		}
		return true;
	}

}