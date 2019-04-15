package com.itlize.marketBackend.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itlize.marketBackend.dao.SalesDAO;
import com.itlize.marketBackend.model.Sales;

@Repository
public class SalesDAOImpl implements SalesDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Sales getSales(String id) {
		// TODO Auto-generated method stub
		return (Sales) sessionFactory.getCurrentSession().get(Sales.class, id);
	}

}
