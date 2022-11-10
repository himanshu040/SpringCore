package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Exampe {
    private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Exampe [subject=" + subject + "]";
	}

	public Exampe() {
		super();
		// TODO Auto-generated constructor stub
	}
	@PostConstruct
    public void init()
    {
    	System.out.println("Enter init");
    	
    }
    
	@PreDestroy
    public void destroy()
    {
    	System.out.println("Enter destroy");
    }
    
	
}
