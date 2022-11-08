package com.springcore.lifecycle;

public class Shirt {
       public Shirt() {
		super();
		// TODO Auto-generated constructor stub
	}

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Shirt [price=" + price + "]";
	}

	public Shirt(double price) {
		super();
		this.price = price;
	}
	public void init()
	{
		
		System.out.println(" init Shirt");
	}
	public void destroy()
	{
		
		System.out.println("Destroy shirt");
	}
}
