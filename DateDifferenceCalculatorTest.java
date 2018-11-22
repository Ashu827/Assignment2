package com.ashu.junit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.ashu.service.DateDifferenceProvider;
import com.ashu.service.supp.MyDate;

public class DateDifferenceCalculatorTest {
	
	DateDifferenceProvider provider=new DateDifferenceProvider();
	long result;
	
	@Test
	public void test1() {
		result=provider.getDateDifference (new MyDate (06,04,2011),new MyDate(06,04,2011));
		assertEquals(0, result);
		
	}
	@Test
	public void test2() {
		result=provider.getDateDifference(new MyDate (06,04,2011),new MyDate(18,04,2011));
		assertEquals(12, result);
		
	}
	@Test
	public void test3() {
		result=provider.getDateDifference(new MyDate (06,04,2011),new MyDate(18,05,2011));
		assertEquals(42, result);
		
	}
	@Test
	public void test4() {
		result=provider.getDateDifference(new MyDate (06,04,2011),new MyDate(18,06,2011));
		assertEquals(73, result);
		
	}
	@Test
	public void test5() {
		result=provider.getDateDifference(new MyDate (06,04,2011),new MyDate(18,12,2011));
		assertEquals(256, result);
		
	}
	@Test
	public void test6() {
		result=provider.getDateDifference(new MyDate (06,04,2011),new MyDate(18,12,2012));
		assertEquals(622, result,2);
		
	}
	@Test
	public void test7() {
		result=provider.getDateDifference(new MyDate (06,04,2011),new MyDate(18,12,2013));
		assertEquals(987, result);
		
	}
	@Test
	public void test8() {
		result=provider.getDateDifference(new MyDate (06,04,2011),new MyDate(18,12,2113));
		assertEquals(37511, result);
		
	}
	@Test
	public void test9() {
		result=provider.getDateDifference(new MyDate (06,04,2011),new MyDate(18,12,2413));
		assertEquals(147084, result);
		
	}
	@Test
	public void test10() {
		result=provider.getDateDifference(new MyDate (06,04,2011),new MyDate(18,12,2813));
		assertEquals(293181, result);
		
	}
	@Test
	public void test11() {
		result=provider.getDateDifference(new MyDate (06,01,2011),new MyDate(06,03,2011));
		assertEquals(59, result);
		
	}
	
	@Test
	public void test12() {
	result=provider.getDateDifference(new MyDate (06,01,2012),new MyDate(06,03,2012));
	assertEquals(60, result);
	}	
	@Test
	public void test13() {
	result=provider.getDateDifference(new MyDate (06,02,2012),new MyDate(06,03,2012));
	assertEquals(29, result);
	}	
	@Test
	public void test14() {
	result=provider.getDateDifference(new MyDate (22,01,2012),new MyDate(15,11,2012));
	assertEquals(298, result);
	}	
	@Ignore
	public void test15() {
	result=provider.getDateDifference(new MyDate (06,02,2012),new MyDate(06,12,2012));
	assertEquals(304, result);
	}	
}
