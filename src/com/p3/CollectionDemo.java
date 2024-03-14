package com.p3;
import java.util.*;
public class CollectionDemo {
	
List addresList;
//business method 
public List getAddresList() {
	return addresList;
}
//setter injection 
public void setAddresList(List addresList) {
	this.addresList = addresList;
}

public Set getAddressSet() {
	return addressSet;
}

public void setAddressSet(Set addressSet) {
	this.addressSet = addressSet;
}

public Map getAddressMap() {
	return addressMap;
}

public void setAddressMap(Map addressMap) {
	this.addressMap = addressMap;
}

public Properties getAddressProp() {
	return addressProp;
}

public void setAddressProp(Properties addressProp) {
	this.addressProp = addressProp;
}

Set addressSet;
Map addressMap;
Properties addressProp;

public CollectionDemo() {
	System.out.println("Collection demo Inti");
}
}