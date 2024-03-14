package com.p2;

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

String name;
address loc;

public void setLoc(address loc) {
	this.loc = loc;
}
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
