package com.ashu.service;

import com.ashu.service.supp.MyDate;

public class DateDifferenceProvider {
	
	static final int JAN=31;
	static final int FEB=28;
	static final int MAR=31;
	static final int APR=30;
	static final int MAY=31;
	static final int JUN=30;
	static final int JUL=31;
	static final int AUG=31;
	static final int SEPT=30;
	static final int OCT=31;
	static final int NOV=30;
	static final int DEC=31;
	
	int months[]={JAN,FEB,MAR,APR,MAY,JUN,JUL,JUL,AUG,SEPT,OCT,NOV,DEC};

	public  int getDateDifference(MyDate startdate,MyDate enddate){
		
		if((sameDate(startdate,enddate)) && (sameMonth(startdate,enddate)) && (sameYear(startdate,enddate))){
		return 0;
		}
		else if(sameMonth(startdate, enddate) && sameYear(startdate, enddate)){
			return enddate.getDd()-startdate.getDd();
		}
		
		else if(sameYear(startdate, enddate)){
			return remainingDaysOfMonth(startdate)+ daysInIntervingMonth(startdate, enddate)+ enddate.getDd();
		}
		return 0;
	}
	private boolean sameDate(MyDate startdate,MyDate enddate){
		 
		 return  enddate.getDd()==startdate.getDd();
		 }
	private boolean sameMonth(MyDate startdate,MyDate enddate){
		 
		 return  enddate.getMm()==startdate.getMm();
		 }
	private boolean sameYear(MyDate startdate,MyDate enddate){
		 
		 return  enddate.getYyyy()==startdate.getYyyy();
		 }
	private int remainingDaysOfMonth(MyDate date) {
		return months[date.getMm() - 1] - date.getDd();
	}

	private int daysInIntervingMonth(MyDate startDate, MyDate endDate) {
		int totalDays = 0;
		for (int index = startDate.getMm()+1 ; index < endDate.getMm(); index++) {
			totalDays += months[index - 1];
		}
		return totalDays;

	}
	
}
