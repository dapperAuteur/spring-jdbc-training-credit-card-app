package com.intraedge.spring.creditcardapp.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class CreditCardApplicationRowMapper implements RowMapper<CreditCardApplication> {

	public CreditCardApplication mapRow(ResultSet rs, int rowNum) throws SQLException {
		CreditCardApplication creditCardApplication = new CreditCardApplication();
		creditCardApplication.setId(rs.getInt("id"));
		creditCardApplication.setFirstName(rs.getString("fName"));
		creditCardApplication.setLastName(rs.getString("lName"));
		creditCardApplication.setJobTitle(rs.getString("jobTitle"));
		creditCardApplication.setIncome(rs.getFloat("income"));
		creditCardApplication.setCreditScore(rs.getInt("creditScore"));
		creditCardApplication.setStatus(rs.getString("appStatus"));
		return creditCardApplication;
	}

}
