package com.intraedge.spring.creditcardapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.intraedge.spring.creditcardapp.model.CreditCardApplication;
import com.intraedge.spring.creditcardapp.service.ICreditCardApplicationService;

@Component
public class CreditCardApplicationController {
	@Autowired
	private ICreditCardApplicationService creditCardApplicationService;
	
	
	public boolean createCreditCardApplication(CreditCardApplication creditCardApplication) {
		creditCardApplicationService.createCreditCardApplication(creditCardApplication);
		return true;
	}
	
	public boolean rejectCreditCardApplication(int id) {
		return creditCardApplicationService.updateCreditCardApplicationStatus(id, "denied");
		
	}
	public boolean approveCreditCardApplication(int id) {
		return creditCardApplicationService.updateCreditCardApplicationStatus(id, "approved");
		
	}
	public List<CreditCardApplication> retrieveAllCreditCardApplications(){
		return creditCardApplicationService.getAllCreditCardApplications();
	}
}
