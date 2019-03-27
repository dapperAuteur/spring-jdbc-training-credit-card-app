package com.intraedge.spring.creditcardapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intraedge.spring.creditcardapp.controller.CreditCardApplicationController;
import com.intraedge.spring.creditcardapp.model.CreditCardApplication;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("config.xml");
    	CreditCardApplicationController controller = appContext.getBean(CreditCardApplicationController.class);
    	
    	//I could have used a loop/data structure here to make things more succinct,
    	//but I want to stress that I do have a few named CreditCardApplication beans in my config file
    	//I also could have used an overloaded constructor and skipped it entirely,
    	//but we are trying to limit the usage of the 'new' operator.
        CreditCardApplication app1 = appContext.getBean("app1", CreditCardApplication.class);
        CreditCardApplication app2 = appContext.getBean("app2", CreditCardApplication.class);
        CreditCardApplication app3 = appContext.getBean("app3", CreditCardApplication.class);

    	
        controller.createCreditCardApplication(app1);
        controller.createCreditCardApplication(app2);
        controller.createCreditCardApplication(app3);
        
        System.out.println(controller.retrieveAllCreditCardApplications());
        
        controller.rejectCreditCardApplication(2);
        controller.approveCreditCardApplication(3);
        
        System.out.println(controller.retrieveAllCreditCardApplications());
        
        appContext.close();
    }
}
