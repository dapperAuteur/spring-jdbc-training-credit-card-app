package com.intraedge.spring.creditcardapp.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.intraedge.spring.creditcardapp.model.CreditCardApplication;

@Component
public interface ICreditCardAppDao {

	public boolean saveCreditCardApplication(CreditCardApplication creditCardApplication);
	public CreditCardApplication findCreditCardApplication(int id);
	public CreditCardApplication findCreditCardApplication(String fName, String lName);
	public boolean updateCreditCardApplication(CreditCardApplication creditCardApplication);
	public List<CreditCardApplication> getAllCreditCardApplications();
}
