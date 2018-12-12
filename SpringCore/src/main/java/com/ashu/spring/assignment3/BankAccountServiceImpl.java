package com.ashu.spring.assignment3;

public class BankAccountServiceImpl implements BankAccountService{

	
	BankUserDAO dao=new BankUserDAO();
	
	@Override
	public double withdraw(long accountId, double balance) {
		double withdraw=0;
		for(BankAccount index:dao.list)
		{
			if(index.getAccountBalance()>=balance)
			{
				if(index.getAccountId()==accountId)
				{
				withdraw=index.getAccountBalance()-balance;
				}
				
			}
		
		}
		return withdraw;
	}

	@Override
	public double deposit(long accountId, double balance) {
		
		double deposit=0;
		for(BankAccount index:dao.list)
			if(index.getAccountId()==accountId)
			{
				deposit=index.getAccountBalance()+deposit;
			}
		return deposit;
	}

	@Override
	public double getBalance(long accountId) {
	
		double balance=0;
		for(BankAccount index:dao.list)
		{
			if(index.getAccountId()==accountId)
			{
				balance=index.getAccountBalance();
			}
		}
		return balance;
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		
		
		
		return false;
	}

}
