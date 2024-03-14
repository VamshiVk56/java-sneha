package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class Address {
public Address() {
	System.out.println("Address init");
}
String city,state,country;
public void setCity(String city) {
	this.city = city;
}
public void setState(String state) {
	this.state = state;
}
public void setCountry(String country) {
	this.country = country;
}
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