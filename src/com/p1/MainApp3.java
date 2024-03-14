package com.p1;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp3 {

	public static void main(String[] args) {

		
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean2.xml");
	//generic init  singleton object 
	employee e=ctx.getBean(employee.class);
	e.show();

		

	}

}
