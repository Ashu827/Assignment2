package com.ashu.bank;

public class CurrentAcc extends BankAccount {
	//private double odLimit;
	//private boolean isSalaryAccount;
	
	private double odLimit;
	private boolean isSalaryAccount;{
		this.odLimit=20000;
	}
	public CurrentAcc(String accountHolderName, double accountBalance){
		super(accountHolderName, accountBalance);
		this.odLimit=odLimit;
	}
	public CurrentAcc(){
		this.odLimit=odLimit;
		this.isSalaryAccount =true;
	}
	public CurrentAcc(String accountHolderName,double accountBalance,double odLimit,boolean isSalaryAccount){
		super(accountHolderName, accountBalance);
		this.odLimit=odLimit;
		this.isSalaryAccount = true;
	}
//	public void setSalaryAccount(boolean isSalaryAccount) {
//		
//	}
	
	@Override
	public void withdraw(double amount){
		//getAccountBalance();
		
		if(amount>accountBalance){
			if(odLimit+accountBalance<amount)
				System.out.println("can't withdraw");
			else{
			odLimit=(odLimit+accountBalance-amount);
			
			accountBalance=0;
			System.out.println("Account blance after withdraw "+accountBalance);
			System.out.println("Now odLimit is "+odLimit);
		}
		}
		else{
			accountBalance=accountBalance-amount;
		System.out.println("Now odLimit is " +odLimit);
		System.out.println("Account blance after withdraw "+accountBalance);
		}		
	}
}
		
