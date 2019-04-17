package com.itlize.marketBackend.service;

import com.itlize.marketBackend.domain.Buyer;

public interface BuyerService {
//	Yipeng 
	Buyer getBuyer(int buyerId);
	Buyer getBuyer(String username);
	Buyer validation(String username, String password);
	boolean addBuyer(Buyer buyer);
	boolean isBuyerExist(String username);
}
