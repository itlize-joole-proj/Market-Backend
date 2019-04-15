package com.itlize.marketBackend.service;

import com.itlize.marketBackend.model.Buyer;

public interface BuyerService {
//	Yipeng 
	Buyer getBuyer(int buyerId);
	Buyer getBuyer(String username);
	Buyer addBuyer(Buyer buyer);
	boolean isBuyerExist(String username);
}
