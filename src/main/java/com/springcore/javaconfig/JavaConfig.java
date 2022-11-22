package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	  
	 @Bean
	 public Course getCourse()
	 {
		 Course course=new Course();
		 return course;
		 
	 }
	
	@Bean(name = {"student","temp"})
	public Students getStudent()
	{
		//creating new student object
		Students student=new Students(getCourse());
		return student;
	}

}
