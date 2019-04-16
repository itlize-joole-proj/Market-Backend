package com.itlize.marketBackend.dao;

import com.itlize.marketBackend.model.Buyer;

public interface BuyerDAO {
	void addBuyer(Buyer buyer);
	Buyer getBuyer(int id);
	Buyer getBuyer(String userName);
	boolean isBuyerExist(String username);
}
