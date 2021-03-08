package com.exercise.bank.classes;

import java.util.UUID;

import com.exercise.bank.interfaces.bankOperations;

public class bankAccount implements bankOperations {
	private String accountNumber;
	private String accountType;
	private double balance;
	
	public bankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.accountType = "Bank account";
		this.balance = 0;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdrawMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() - amount);
		}else {
			System.out.println("You can not withdraw a negative value!");
		}
		
	}

	public void depositMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() + amount);
		}else {
			System.out.println("You can not deposit a negative value!");
		}
	}
	
	public String toString() {
		return "Bank account [accountNumber = "+getAccountNumber()+", balance = "+getBalance()+", accountType = "+getAccountType()+"]";
		
	}
	
	
	
	

}
