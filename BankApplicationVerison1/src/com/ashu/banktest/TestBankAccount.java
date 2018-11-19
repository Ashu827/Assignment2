package com.ashu.banktest;
import com.ashu.bank.BankAccount;
import com.ashu.bank.CurrentAcc;
import com.ashu.bank.CurrentAccVer2;
import com.ashu.bank.SavingAcc;
import com.ashu.bank.SavingAccVer2;
public  class TestBankAccount {

	public static void testBankAccountMethod(){
		//BankAccount acc=new BankAccount();
		//acc.setAccountHolderName("Ashu");
	}
	
		public static void testSavingAccount(){
		SavingAcc savingacc=new SavingAcc("Ashu",500,true);
		System.out.println("Account No. is "+savingacc.getAccountNumber());
		System.out.println("Account blance "+savingacc.getAccountBalance());
		 savingacc.deposit(5000);
		System.out.println("Acount balance "+savingacc.getAccountBalance());
		savingacc.withdraw(3000);
		System.out.println("Account balance "+savingacc.getAccountBalance());
		System.out.println("isSalart Account "+savingacc.isSalaryAccount());
		}
	public static void testCurrentAccount(){
		CurrentAcc currentacc=new CurrentAcc("Kumar",40000);
		//System.out.println("Account No. is "+currentacc.getAccountNumber());
		System.out.println("Account blance Before withdraw "+currentacc.getAccountBalance());
		 //currentacc.deposit(5000);
		//System.out.println("Acount balance "+currentacc.getAccountBalance());
		//currentacc.withdraw(3000);
		//System.out.println("Account balance "+currentacc.getAccountBalance());
		currentacc.withdraw(100000);
	}
		
	
	public static BankAccount getBankAccount(String accountType){
		BankAccount acc=null;
		if(accountType.equals("Saving")){
			acc=new SavingAcc("Ashu",5000);
		}
		else if(accountType.equals("Current")){
			acc=new CurrentAcc("Ashu",4000);
		}
		else{
			acc=null;
		}
		return acc;
	}
	
	public static void main(String[] args) {
//		testBankAccountMethod();
//		testSavingAccount();
//		testCurrentAccount();
		
//		BankAccount acc=getBankAccount("Saving");
//		System.out.println("Account name "+acc.getAccountHolderName());
//		System.out.println("Account balance "+acc.getAccountBalance());
//		acc.withdraw(3000);
//		System.out.println("Account balance "+acc.getAccountBalance());
		
		SavingAccVer2 acc=new SavingAccVer2();
		acc.withdraw(400);
		acc.deposit(4000);
		acc.isSalaryAccount();
		acc.getInsuranceName();
		
		CurrentAccVer2 acc2=new CurrentAccVer2();
		acc2.withdraw(400);
		acc2.deposit(4000);
		acc2.isSalaryAccount();
		acc2.getInsuranceName();
	}

}
