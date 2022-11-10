package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//    Shirt s=(Shirt) context.getBean("s1");
//    System.out.println(s);
//   
//    Jeans j=(Jeans) context.getBean("j1");
//    System.out.println(j);
    Exampe e=(Exampe)context.getBean("e1");
     System.out.println(e);
    context.registerShutdownHook();
  
 

	}

}
