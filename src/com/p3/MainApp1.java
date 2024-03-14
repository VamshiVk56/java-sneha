package com.p3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("CollBean.xml");
		CollectionDemo c=ctx.getBean(CollectionDemo.class);
		System.out.println(c.getAddressSet());
		System.out.println(c.getAddresList());
		System.out.println(c.getAddressMap());
		System.out.println(c.getAddressProp());

	}

}