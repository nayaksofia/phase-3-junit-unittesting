package com.ecommerce.webapp;

public class BankApp {

	double balance = 3000;
	
	//Operation For Show Balance
	public double showBalance() {
		return balance;
	}
	
	//Operation For Deposite Balance
	public double depositeAmount(double amount) {
		
		if(amount<0) {
			return -1;
		}
		
		this.balance += amount;
		return this.balance;
		
	}
	
	//HomeWork: Withdraw Operation
}
