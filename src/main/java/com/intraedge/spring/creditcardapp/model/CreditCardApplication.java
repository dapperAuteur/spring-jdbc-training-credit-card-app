package com.intraedge.spring.creditcardapp.model;

public class CreditCardApplication {
private String firstName, lastName, jobTitle, status;
private float income;
private int id, creditScore;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getJobTitle() {
	return jobTitle;
}
public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public float getIncome() {
	return income;
}
public void setIncome(float income) {
	this.income = income;
}
public int getCreditScore() {
	return creditScore;
}
public void setCreditScore(int creditScore) {
	this.creditScore = creditScore;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "CreditCardApplication [firstName=" + firstName + ", lastName=" + lastName + ", jobTitle=" + jobTitle
			+ ", status=" + status + ", income=" + income + ", id=" + id + ", creditScore=" + creditScore + "]";
}
}
