package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@ComponentScan("com.annotation")
public class MainApp1 {

	public static void main(String[] args) {
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("AnnoBean.xml");
	System.out.println("container inti");
//AtosEmployee a=(AtosEmployee) ctx.getBean("atosEmployee");
//a.setEid(101);
//a.setName("MAnisha");
//a.setLoc("Pune");
//	a.show();
//	
//	AtosEmployee b=(AtosEmployee) ctx.getBean("atosEmployee");
//	b.show();
//	System.out.println(a==b);
	
	Address a=(Address) ctx.getBean("address");
	a.setCity("Mumbai");
	a.setState("Maharashtra");
	a.setCountry("India");
	
	AtosEmployee b=(AtosEmployee) ctx.getBean("atosEmployee");
	b.setEid(101);
	b.setName("MAnisha");
	//b.setLoc(a);
	b.show();

	}

}