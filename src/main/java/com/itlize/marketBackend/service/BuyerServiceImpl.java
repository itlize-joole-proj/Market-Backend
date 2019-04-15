package com.itlize.marketBackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itlize.marketBackend.dao.BuyerDAO;
import com.itlize.marketBackend.model.Buyer;

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
	public Buyer addBuyer(Buyer user) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public boolean isBuyerExist(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
