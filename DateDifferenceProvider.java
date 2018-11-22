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
	private static final int DAY_IN_A_LEAP_YEAR = 366;
	private static final int DAY_IN_A_NON_LEAP_YEAR = 365;
	
	static int months[]={JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEPT,OCT,NOV,DEC};

	public static long getDateDifference (MyDate startDate, MyDate endDate)
	{
		if (sameDate(startDate, endDate)&&
				sameMonth(startDate, endDate)&&
				sameYear(startDate, endDate))
		{
			return 0;
		}
		else if(sameYear(startDate, endDate)&& 
				sameMonth(startDate, endDate))
		{
			return endDate.getDd()- startDate.getDd(); 
		}
			
		else if(sameYear(startDate, endDate) &&
				!sameMonth(startDate, endDate))
		{	
			return remainingDaysInMonth(startDate)+
					daysInIntervingMonth(startDate, endDate)+
					leadingMonth(endDate)+ sameLeapYear(startDate, endDate);
		}
		else
		{
			return remainingDaysInYear(startDate)+
					leadingYear(endDate)+
					daysInInterveningYear(startDate, endDate)+sameLeapYear(startDate, endDate);
		}
		
	}
	
	private static boolean sameYear(MyDate date1, MyDate date2){
		
		return(date1.getYyyy()==date2.getYyyy());
	}
	
	private static boolean sameMonth(MyDate date1, MyDate date2){
		
		return(date1.getMm()==date2.getMm());
	}
	
	private static boolean sameDate(MyDate date1, MyDate date2){
		
		return(date1.getDd()==date2.getDd());
	}
	
	private static long remainingDaysInMonth(MyDate date){
		int remainingDays;
		int month=date.getMm();
		remainingDays= months[month-1]-date.getDd();
		if(isLeapYear(date)&& isFebruary(date))
			remainingDays++;
		return remainingDays;
	}
	
	private static long leadingMonth(MyDate date)
	{
		return date.getDd();
	}
	
	private static boolean isFebruary(MyDate date) {
		int month=date.getMm();
		if(month==FEB){
			return true;
		}
		return false;
	}

	private static boolean isLeapYear(MyDate date) {
		int year=date.getYyyy();
		if((year%400) ==0 || year%4==0 && year%100!=0)
		return true;
		else
		return false;
	}
	

	private static long daysInIntervingMonth(MyDate startDate, MyDate endDate){
		int startMonth=startDate.getMm();
		int endMonth=endDate.getMm();
		int days=0;
			
		for(int month=startMonth+1; month <endMonth; month++)
		{
			if(isLeapYear(startDate)&& month==FEB){
				++days;
				
			}
			days=days+months[month-1];
		}
	
		return days;
	}
	
	private static int daysInInterveningYear(MyDate startDate, MyDate endDate) {
		
		int remainingdays =0;
		
		for(int year = startDate.getYyyy()+1; year<endDate.getYyyy(); year++)
		{
			if(isLeapYear(new MyDate(1,1,year)))
				remainingdays = remainingdays + DAY_IN_A_LEAP_YEAR;
			else
				remainingdays = remainingdays + DAY_IN_A_NON_LEAP_YEAR;
		}		
		
		return remainingdays;
	}
	
	private static long remainingDaysInYear(MyDate startDate) {
		
		int daysRemaining =0;
		
		for(int month = startDate.getMm()+1; month <= 12; month++)
		{
			daysRemaining = daysRemaining + months[month-1];
		}
		
		daysRemaining = daysRemaining + (months[startDate.getMm()-1]-startDate.getDd());
		
		if(isLeapYear(startDate) && startDate.getMm()==FEB)
			daysRemaining++;
		
		return daysRemaining;
		
	}


	private static long leadingYear(MyDate endDate) {
		
		int daysRemaining =0;
		
		for(int month = 1; month < endDate.getMm(); month++)
		{
			daysRemaining = daysRemaining + months[month-1];
		}
		
		daysRemaining = daysRemaining + endDate.getDd();
		
		if(isLeapYear(endDate) && endDate.getMm()>=FEB)
			daysRemaining++;
		
		return daysRemaining;
	}
	
	private static  long sameLeapYear(MyDate Startdate, MyDate endDate){
		int leapDays=0;
		int year=Startdate.getYyyy();
		int lastYear=endDate.getYyyy();
		int month=Startdate.getMm();
		for(int index=year; index<=lastYear;index++){
		if(((year%400) ==0 || year%4==0 && year%100!=0)){
			leapDays++;
			
		}
		}
		return leapDays ;
		
	}
	
}

