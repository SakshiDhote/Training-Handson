/*Account Management
John wants to maintain basic information about his customers account.
Create class Account with private variable balance of double type. Add setter and getter for balance.
Account class allows customer to deposit and withdraw balance. Minimum balance is 5000. Use setter based dependency.
 Add below methods,
public void deposit(double amount) --> will deposit money in account
public void withdraw(double amount) --> will withdraw money from account. After withdraw, minimum balance must be maintained ,
i.e. 5000 rs
Create class Customer which maintains customer information and his account details. Customer class will have 
first name(String), last name(String) and account (Account). Add setter, getter for all instance variables.
Create spring.xml to configure bean objects. Use maven to add dependency for jars (pom.xml)
Create main class. Using ApplicationContext access bean object for customer and perfom below operations
1.	Accept amount for deposit and display balance and first name , last name
2.	Accept amount for withdraw and display balance (show message if withdraw amount is more than balance)
*/

package com.java;

import com.java.Account;

public class Customer {
	
	private String firstname;
	private String lastname;
	private Account account;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", account=" + account + "]";
	}
	

}
