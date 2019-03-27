package com.intraedge.spring.creditcardapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.intraedge.spring.creditcardapp.dao.ICreditCardAppDao;
import com.intraedge.spring.creditcardapp.model.CreditCardApplication;

@Component
public class CreditCardApplicationService implements ICreditCardApplicationService {
	@Autowired
	ICreditCardAppDao creditCardAppDao;
	
	public boolean createCreditCardApplication(CreditCardApplication creditCardApplication) {
		//generally, there should be some preliminary checks going on here
		//such as making sure there isn't an existing application for the applicant
		return creditCardAppDao.saveCreditCardApplication(creditCardApplication);
	}

	public boolean updateCreditCardApplicationStatus(int appId, String status) {
		//Another good place for a sanity check - you'd want to make sure
		//people with low scores won't be running up credit card bills they can't or won't pay.
		//You could have separate methods for approving and denying applications,
		//but this way you can see that your controller, service, and DAO methods
		//don't have to (and won't in the real world) have a one-to-one relationship.
		CreditCardApplication creditCardApplication = creditCardAppDao.findCreditCardApplication(appId);
		creditCardApplication.setStatus(status);
		return creditCardAppDao.updateCreditCardApplication(creditCardApplication);
		
	}

	public List<CreditCardApplication> getAllCreditCardApplications() {
		
		return creditCardAppDao.getAllCreditCardApplications();
	}

	public CreditCardApplication getCreditCardApplication(int id) {
		return creditCardAppDao.findCreditCardApplication(id);
	}

	public CreditCardApplication getCreditCardApplication(String fName, String lName) {
		return creditCardAppDao.findCreditCardApplication(fName,  lName);
	}

}
