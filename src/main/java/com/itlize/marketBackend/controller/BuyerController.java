package com.itlize.marketBackend.controller;

//import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itlize.marketBackend.domain.Buyer;
import com.itlize.marketBackend.service.BuyerService;

@RestController
public class BuyerController {
	
//	private static final Logger logger = Logger
//            .getLogger(BuyerController.class);
	
	public BuyerController() {
		System.out.println("BuyerController initialization...");
	}
	
	@Autowired
	private BuyerService buyerService;
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public void addBuyer(@RequestBody Buyer new_buyer) {
		if (new_buyer.getUsername() == null) {
			System.out.println("Please enter username");
		}
		if (new_buyer.getPassword() == null) {
			System.out.println("Please enter password");
		}
		if (new_buyer.getFirstname() == null) {
			System.out.println("Please enter Fist Name");
		}
		if (new_buyer.getLastname() == null) {
			System.out.println("Please enter Last Name");
		}
		if (new_buyer.getEmail() == null) {
			System.out.println("Please enter email address");
		}
		if (!buyerService.addBuyer(new_buyer)) {
			System.out.println("User already existed!!! Failed to register...");
		} else {
			System.out.println("Successfully register!!!");
		}
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public Buyer getBuyer(@RequestBody Buyer user) {
		String buyerName = user.getUsername();
		String password = user.getPassword();
		if (buyerName == null || buyerName.length() == 0) {
			System.out.println("Please enter username!!!");
			return null;
		}
		if (password == null || password.length() == 0) {
			System.out.println("Please enter password");
			return null;
		}
		Buyer buyer = buyerService.getBuyer(user.getUsername());
		if (buyer == null) {
			System.out.println("Not Found user!!! -> " + buyerName);
			return null;
		} else if (!buyer.getPassword().equals(user.getPassword())) {
			System.out.println("Password not match!!!");
			return null;
		}
 
        return buyer;
	}

}
