package com.ashu.bank;

public class CurrentAccVer2 extends CurrentAcc implements Insurance{

	@Override
	public String getInsuranceName() {
		
		return "Bima";
	}

	@Override
	public double getInsuranceAmount() {
		
		return 300000;
	}

	public void isSalaryAccount() {
		// TODO Auto-generated method stub
		
	}
	
	

}
