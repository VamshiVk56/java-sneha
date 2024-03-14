package com.p1;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp4 {

	public static void main(String[] args) {

		
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean2.xml");
	//generic init  singleton object 
	employee a=(employee) ctx.getBean("e1");
	
	a.show();
	employee b=(employee) ctx.getBean("e1");
	System.out.println(a);
	System.out.println(b);

		

	}

}