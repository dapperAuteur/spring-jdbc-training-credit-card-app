package com.intraedge.spring.creditcardapp.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.intraedge.spring.creditcardapp.model.CreditCardApplication;

@Component
public interface ICreditCardApplicationService {
	public boolean createCreditCardApplication(CreditCardApplication creditCardApplication);
	public boolean updateCreditCardApplicationStatus(int id, String status);
	public List<CreditCardApplication> getAllCreditCardApplications();
	public CreditCardApplication getCreditCardApplication(int id);
	public CreditCardApplication getCreditCardApplication(String fName, String lName);
}
