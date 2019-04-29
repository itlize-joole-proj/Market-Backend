package com.itlize.marketBackend.controller;

import javax.servlet.http.HttpServletResponse;

//import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itlize.marketBackend.domain.Buyer;
import com.itlize.marketBackend.service.BuyerService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
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
	
//	@ModelAttribute
//	public void setVaryResponseHeader(HttpServletResponse response) {
//		response.setHeader("Access-Control-Expose-Headers", "Access-Control-Allow-Origin");
//	    response.setHeader("Access-Control-Allow-Origin", "*");
//	    response.setHeader("crossDomain", "true");
//	}  

}
