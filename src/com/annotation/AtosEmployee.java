package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")

public class AtosEmployee {
	
int eid;
//setter injection 
public void setEid(int eid) {
	this.eid = eid;
	System.out.println("setter is called "+eid);
}
public void setName(String name) {
	this.name = name;
	System.out.println("setter is called "+name);
}

String name;
@Autowired
Address loc;

public void setLoc(Address loc) {
	this.loc = loc;
}
public AtosEmployee() {
	System.out.println("Employee init");
}
//BL 
void show()
{
	System.out.println(eid);
	System.out.println(name);
	System.out.println(loc);
}

}