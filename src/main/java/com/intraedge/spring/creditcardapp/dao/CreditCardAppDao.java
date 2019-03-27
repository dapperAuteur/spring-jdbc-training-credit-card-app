package com.intraedge.spring.creditcardapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.intraedge.spring.creditcardapp.model.CreditCardApplication;

@Component
public class CreditCardAppDao implements ICreditCardAppDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	//Note that RowMapper is not an Interface I defined,
	//and I don't directly reference my implementation class (CreditCardApplicationRowMapper)
	//but the Spring container still knows to look in my packages for a class
	//implementing the RowMapper Interface.
	//Also note that a RowMapper is needed for your queries to
	//store the relational database records into CreditCardApplication or any other Object 
	@Autowired
	RowMapper<CreditCardApplication> creditCardAppRowMapper;
	
	public boolean saveCreditCardApplication(CreditCardApplication creditCardApplication) {
		int res = jdbcTemplate.update("insert into Shay_CreditCardApplication(fName, lname, jobTitle, creditScore, income) values(?,?,?,?,?);",
				creditCardApplication.getFirstName(),creditCardApplication.getLastName(),
				creditCardApplication.getJobTitle(), creditCardApplication.getCreditScore(), creditCardApplication.getIncome());
		return res==1?true:false;
	}

	public CreditCardApplication findCreditCardApplication(int id) {

		return jdbcTemplate.query("select * from Shay_CreditCardApplication where id=?", new Object[]{id},creditCardAppRowMapper).get(0);
	}

	public boolean updateCreditCardApplication(CreditCardApplication creditCardApplication) {
		int res = jdbcTemplate.update("update Shay_CreditCardApplication set appStatus=? where id=?;",
				creditCardApplication.getStatus(),creditCardApplication.getId());
		return res==1?true:false;
	}

	public List<CreditCardApplication> getAllCreditCardApplications() {
		return jdbcTemplate.query("select * from Shay_CreditCardApplication", creditCardAppRowMapper);
		
	}

	public CreditCardApplication findCreditCardApplication(String fName, String lName) {
		return jdbcTemplate.query("select * from Shay_CreditCardApplication where fName=? and lName=?", new Object[]{fName, lName},creditCardAppRowMapper).get(0);
	}

}
