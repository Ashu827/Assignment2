package com.ashu.service;

import java.security.Provider;

import com.ashu.service.supp.MyDate;
import com.ashu.service.supp.MyTestRecord;

public class TestDateDifferenceProvider {
	

	public static void main(String[] args) {
		DateDifferenceProvider provider=new DateDifferenceProvider();
		MyTestRecord[] myTestrecord=new MyTestRecord[3];
		myTestrecord[0]=new MyTestRecord(new MyDate (20,11,2018),new MyDate(20,11,2018),0);
		myTestrecord[1]=new MyTestRecord(new MyDate (20,11,2018),new MyDate(30,11,2018),10);
		myTestrecord[2]=new MyTestRecord(new MyDate (06,04,2011),new MyDate(18,05,2011),42);
		
		
		
		
	
//	for(MyTestRecord testRecord:myTestrecord){
//	int calculatordiff=provider.getDateDifference(testRecord.getStartdate(), testRecord.getEnddate());
//					if(calculatordiff==testRecord.getActualdifference())
//					System.out.println("test case pass");
//					else
//					System.out.println("Test Case failed"+" Actual =" + myTestrecord[index].getActualdifference()+ 
//							" calculated ="+ calculatordiff);}
			
		for (int index=0; index < myTestrecord.length; index++) {
			int calculatedDiff = provider.getDateDifference(myTestrecord[index].getStartdate(),
					myTestrecord[index].getEnddate());
			if (calculatedDiff == myTestrecord[index].getActualdifference()) {
				System.out.println("Test Case passed");
			} else {
				System.err.println("Test Case failed"+" Actual =" + myTestrecord[index].getActualdifference()+ " calculated ="+ calculatedDiff);
			}
		}
			}
}