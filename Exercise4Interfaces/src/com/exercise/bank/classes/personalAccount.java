package com.exercise.bank.classes;

import java.util.UUID;

public class personalAccount extends bankAccount {
	
	public personalAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Personal account");
	}

}
