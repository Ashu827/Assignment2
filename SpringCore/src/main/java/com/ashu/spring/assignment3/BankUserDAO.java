package com.ashu.spring.assignment3;

import java.util.ArrayList;

public class BankUserDAO {
	
	ArrayList<BankAccount> list=new ArrayList<BankAccount>();
	
	public BankUserDAO(){
		list=new ArrayList<BankAccount>();
		list.add(new BankAccount(1, "Ashu", "saving", 5000));
		list.add(new BankAccount(2, "Sidd", "saving", 6000));
		
		
		
	}

}
