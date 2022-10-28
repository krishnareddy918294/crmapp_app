package com.crm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.Services.BillingService;
import com.crm.entities.Billing;

@Controller
public class BillingController {

	@Autowired
	private BillingService  billingService;
	
	@RequestMapping("/GenearteBilling")
	public String generateBill(Billing bill) {
		 billingService.saveBill(bill);
		return "final_billings_info";
		
	}
}
