package com.crm.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.LeadRepository.BillingRepository;
import com.crm.entities.Billing;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingRepo;
	
	
	@Override
	public void saveBill(Billing bill) {
   billingRepo.save(bill);
	}

}
