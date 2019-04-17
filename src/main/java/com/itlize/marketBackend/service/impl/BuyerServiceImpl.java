package com.itlize.marketBackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itlize.marketBackend.dao.BuyerDAO;
import com.itlize.marketBackend.domain.Buyer;
import com.itlize.marketBackend.service.BuyerService;

@Service
@Transactional
public class BuyerServiceImpl implements BuyerService {
	
	@Autowired
	BuyerDAO buyerDao;

	@Override
//	Yipeng
	public Buyer getBuyer(int buyerId) {
		// TODO Auto-generated method stub
		return buyerDao.getBuyer(buyerId);
	}
	
	@Override
//	Yipeng
	public Buyer getBuyer(String username) {
		// TODO Auto-generated method stub
		return buyerDao.getBuyer(username);
	}

	@Override
	public boolean addBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
//		if (isBuyerExist(buyer.getUsername())) {
		if (buyerDao.isBuyerExist(buyer.getUsername())) {
			return false;
		}
		buyerDao.addBuyer(buyer);
		return true;
	}
	

	@Override
	public boolean isBuyerExist(String username) {
		// TODO Auto-generated method stub
		return buyerDao.getBuyer(username) != null;
	}

	@Override
	public Buyer validation(String username, String password) {
		// TODO Auto-generated method stub
		Buyer buyer = buyerDao.getBuyer(username);
		if(buyer != null) {
			if(buyer.getPassword().equals(password)) return buyer;
			else buyer.setMessage("Username and password does not match!");
		}
		Buyer b = new Buyer();
		b.setMessage("Username not found!");
		return b;
	}


}
