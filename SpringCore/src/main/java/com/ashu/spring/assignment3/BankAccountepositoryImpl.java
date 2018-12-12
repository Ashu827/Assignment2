package com.ashu.spring.assignment3;

public class BankAccountepositoryImpl implements BankAccountRepository {

	BankUserDAO dao=new BankUserDAO();
	
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
	public double updateBalance(long accountId, double newBalance) {
		
		double updateBalanc=0;
		for(BankAccount index1:dao.list)
		{
			if(index1.getAccountId()==accountId)
			{
				updateBalanc=index1.getAccountBalance()+newBalance;
				
			}
		}
		
		
		return updateBalanc;
	}

}
