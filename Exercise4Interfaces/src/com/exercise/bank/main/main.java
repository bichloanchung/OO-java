package com.exercise.bank.main;

import com.exercise.bank.classes.bankAccount;
import com.exercise.bank.classes.personalAccount;
import com.exercise.bank.classes.savingAccount;

public class main {

	public static void main(String[] args) {
		bankAccount bacc = new bankAccount();
		System.out.println(bacc.toString());
		bacc.depositMoney(200.0);
		
		personalAccount pacc = new personalAccount();
		pacc.depositMoney(70);
		System.out.println(pacc.toString());
		pacc.depositMoney(-1);
		
		savingAccount sacc = new savingAccount();
		sacc.withdrawMoney(-20);
		sacc.withdrawMoney(20);
		System.out.println(sacc.toString());
	
		

	}

}
