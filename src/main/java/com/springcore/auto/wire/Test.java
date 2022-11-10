package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ApplicationContext context=   new ClassPathXmlApplicationContext("com/springcore/auto/wire/autowireconfig.xml");
           Employ emp= context.getBean("emp1",Employ.class);
           Address a=context.getBean("address1",Address.class);
           System.out.println(a);
          System.out.println(emp);
           
	}

}
