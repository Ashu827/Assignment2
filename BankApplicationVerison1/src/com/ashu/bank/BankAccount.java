package com.ashu.bank;//collection of logical classes

public abstract class BankAccount {
	
	
	//static variables
	private static int autoAccountNo;
	
	
	//instance variables//class variables
	private  static int accountNumber;//creating three private variables
	private String accountHolderName;//we can't access these instance variables without creating object.
	protected double accountBalance;//
	
	//init bolck
	{
		
		accountNumber=++autoAccountNo;
	}
	//constructor overloading
	public BankAccount(){//default constructor
	  
	  accountHolderName="Unknown";
	  accountBalance=0;
	  
  }
	//parametrised constructor
	public BankAccount(String accountHolderName, double accountBalance){
		
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
		
	}
	
	//modify or reinitalize member variable-setter method
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public static int getAccountNumber() {
		return accountNumber;
	}
	
	//service method
	public void withdraw(double amount){
		this.accountBalance-=amount;
	}
	public  void deposit(double amount){
		this.accountBalance+=amount;
	}
	
	//main method inside the class BankAccount
	public static void main(String[] args) {
		//BankAccount acc=new BankAccount();
	//	BankAccount acc2=new BankAccount("Ashu", 5000);
	}
	
}

//some time we can give default access specifier