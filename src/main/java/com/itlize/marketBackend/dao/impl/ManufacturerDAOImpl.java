package com.itlize.marketBackend.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itlize.marketBackend.dao.ManufacturerDAO;
import com.itlize.marketBackend.model.Manufacturer;

@Repository
public class ManufacturerDAOImpl implements ManufacturerDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Manufacturer getManufacturer(String id) {
		// TODO Auto-generated method stub
		return (Manufacturer) sessionFactory.getCurrentSession().get(Manufacturer.class, id);
	}

}
