package com.itlize.marketBackend.controller;

//import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itlize.marketBackend.Util.exceptions.UserNotFoundException;
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
	public void addBuyer(@RequestBody Buyer new_buyer) throws Throwable {
		if (!buyerService.addBuyer(new_buyer)) {
			System.out.println("User already existed!!! Failed to register...");
		} else {
			System.out.println("Successfully register!!!");
		}
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public Buyer getBuyer(@RequestBody Buyer user) throws Throwable {
		
		Buyer buyer = buyerService.getBuyer(user);
		
		if (buyer == null) {
			System.out.println("Not Found user!!! -> " + user.getUsername());
			throw new Exception("User Not found!!!");
		} else if (!buyer.getPassword().equals(user.getPassword())) {
			System.out.println("Password not match!!!");
			throw new Exception("Password not match!!!");
		}
 
        return buyer;
	}
	
	//test rest controller advice
	@RequestMapping(value="/buyers/{username}", method=RequestMethod.GET)
	public ResponseEntity<?> testEx(@PathVariable("username") String username) {
		System.out.println("test!");
		throw new UserNotFoundException(username);
	}

}
