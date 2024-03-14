package com.p1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp2 {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("Bean1.xml");
		BeanFactory br=new XmlBeanFactory(res);
		Address a=(Address) br.getBean("a1");
		System.out.println(a);
		
		Address b=(Address) br.getBean("a2");
		System.out.println(b);
		
		Address c=(Address) br.getBean("a3");
		System.out.println(c);
		

	}

}
