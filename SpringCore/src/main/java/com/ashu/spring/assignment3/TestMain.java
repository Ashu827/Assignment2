package com.ashu.spring.assignment3;

public class TestMain {

	public static void main(String[] args) {
		
		BankAccountepositoryImpl bank=new BankAccountepositoryImpl();
		System.out.println(bank.updateBalance(1, 10000));
		
		BankAccountServiceImpl acc=new BankAccountServiceImpl();
		System.out.println(acc.withdraw(1, 1000));

	}

}
