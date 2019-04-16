package com.itlize.marketBackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itlize.marketBackend.dao.BuyerDAO;
import com.itlize.marketBackend.model.Buyer;
import com.itlize.marketBackend.service.BuyerService;

@Service
@Transactional
public class BuyerServiceImpl implements BuyerService {
	
	@Autowired
	BuyerDAO buyerdao;

	@Override
//	Yipeng
	public Buyer getBuyer(int buyerId) {
		// TODO Auto-generated method stub
		return buyerdao.getBuyer(buyerId);
	}
	
	@Override
//	Yipeng
	public Buyer getBuyer(String username) {
		// TODO Auto-generated method stub
		return buyerdao.getBuyer(username);
	}

	@Override
	public void addBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
		buyerdao.addBuyer(buyer);;
	}
	

	@Override
	public boolean isBuyerExist(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
