package com.p1;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp1 {

	public static void main(String[] args) {
//		Resource res=new ClassPathResource("Bean1.xml");
//		BeanFactory br=new XmlBeanFactory(res);
		System.out.println("Container init");
		//Lazy init
//		Employee e=(Employee) br.getBean("e1");
//		e.show();
		
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean1.xml");
	//eager init 
		

	}

}