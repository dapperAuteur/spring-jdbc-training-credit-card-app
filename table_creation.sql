use mydb;
create table Shay_CreditCardApplication(
	id int not null auto_increment,
    fName varchar(255),
    lName  varchar(255),
    jobTitle  varchar(666),
    income float,
    creditScore smallint,
    appStatus enum("pending", "approved", "denied") default "pending",
    primary key(id)    
);