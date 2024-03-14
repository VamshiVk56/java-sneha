package com.p1;

public class employee {
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
public void setLoc(String loc) {
	this.loc = loc;
	System.out.println("setter is called "+loc);
}
String name,loc;
public employee() {
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
