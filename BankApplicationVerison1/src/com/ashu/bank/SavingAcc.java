package com.ashu.bank;

public class SavingAcc extends BankAccount{
	private double minBalance;
	private boolean isSalaryAccount;
	
	public SavingAcc(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
		this.isSalaryAccount=true;
	}
	public SavingAcc(){
		this.isSalaryAccount=true;
	}
	public SavingAcc(String accountHolderName,double accountBalance, boolean isSalaryAccount){
		super(accountHolderName, accountBalance);
		this.isSalaryAccount=isSalaryAccount;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void withdraw(double amount){
		super.withdraw(amount);
	}
	

}
