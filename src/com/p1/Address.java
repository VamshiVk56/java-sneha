package com.p1;

public class Address {
public Address() {
	System.out.println("Address init");
}
String city,state,country;
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
}
public Address(String city, String state, String country) {
	super();
	this.city = city;
	this.state = state;
	this.country = country;
}
public Address(String city, String state) {
	super();
	this.city = city;
	this.state = state;
}

}