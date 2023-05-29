package com.zohocrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entites.Billing;
import com.zohocrm.repository.BillingRepository;
@Service
public class BilingServiceImpl implements BillingService {
@Autowired
private BillingRepository billingRepo;
	@Override
	public void generateBill(Billing bill) {
		billingRepo.save(bill);

	}

}
