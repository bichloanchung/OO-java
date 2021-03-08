package com.exercise.bank.classes;

import java.util.UUID;

public class savingAccount extends bankAccount {
	
	public savingAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Saving account");
	}


}
