package com.springRest.RestAssignment3.dao;

import java.util.ArrayList;

import com.springRest.RestAssignment3.pojo.ZipcodeInfo;

public class ZipcodeDAA {
public static ArrayList<ZipcodeInfo> getZCDao(){
	ZipcodeInfo z1=new ZipcodeInfo("karnataka", "Bengaluru", "India",123456);
	ZipcodeInfo z2=new ZipcodeInfo("karnataka1", "Bengaluru1", "India1",123457);
	ZipcodeInfo z3=new ZipcodeInfo("karnataka2", "Bengaluru2", "India2",123458);
	ArrayList<ZipcodeInfo> al=new ArrayList<ZipcodeInfo>();
	al.add(z1);
	al.add(z2);
	al.add(z3);
	
	return al;
	
	
}
}
