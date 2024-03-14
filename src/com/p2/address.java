package com.p2;

public class address {
public address() {
	System.out.println("Address init");
}
String city,state,country;
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
}
//constr
/*
public Address(String city, String state, String country) {
	super();
	this.city = city;
	this.state = state;
	this.country = country;
}*/
public address(String city, String state) {
	super();
	System.out.println("Address init");
	this.city = city;
	this.state = state;
}

}