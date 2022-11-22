package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/standalone/collection/aloneconfig.xml");
		 Person a=(Person) context.getBean("Person1");
		 System.out.println(a);
		 System.out.println(a.getFriends().getClass());
		 System.out.println(a.getFeestruct());
		 System.out.println(a.getFeestruct().getClass().getTypeName());
	}

}
