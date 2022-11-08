package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Jeans implements InitializingBean,DisposableBean {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("seting jeans");
		this.price = price;
	}

	public Jeans() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Taking jeans: Init");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy Jeans");
	}

	@Override
	public String toString() {
		return "Jeans [price=" + price + "]";
	}
	
	
	

}
