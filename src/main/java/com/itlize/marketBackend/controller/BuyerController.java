package com.itlize.marketBackend.controller;

import javax.servlet.http.HttpServletRequest;

//import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itlize.marketBackend.model.Buyer;
import com.itlize.marketBackend.service.BuyerService;

@RestController
public class BuyerController {
	
//	private static final Logger logger = Logger
//            .getLogger(BuyerController.class);
	
	public BuyerController() {
		System.out.println("BuyerController...");
	}
	
	@Autowired
	private BuyerService buyerService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public Buyer getBuyer(@RequestBody Buyer user) {
		String buyerName = user.getUsername();
		String password = user.getPassword();
		Buyer buyer = buyerService.getBuyer(user.getUsername());
		if (buyer == null) {
			System.out.println("Not Found user!!! -> " + user);
		}
 
        return buyer;
	}

}
