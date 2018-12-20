package com.springRest.RestAssignment3.pojo;

public class ZipcodeInfo {
private String state;
private String city;

private String country;
private int  zipcode;

public ZipcodeInfo(String state, String city, String country, int i) {
	super();
	this.state = state;
	this.city = city;
	this.country = country;
	this.setZipcode(i);
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public int getZipcode() {
	return zipcode;
}

public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}


}
