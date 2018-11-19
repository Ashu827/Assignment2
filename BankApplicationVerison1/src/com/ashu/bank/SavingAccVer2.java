package com.ashu.bank;

public class SavingAccVer2 extends SavingAcc implements Insurance{
	
	@Override
	public String getInsuranceName() {
		
		return"Jivan Bima";
	}
	@Override
	public double getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 5_00_000;
	}

}
