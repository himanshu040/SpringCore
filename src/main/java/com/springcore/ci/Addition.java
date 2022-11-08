package com.springcore.ci;

public class Addition {
  private int a;
  private int b;
  private int c;
public Addition(int a, int b) 
{
	this.a = a;
	this.b = b;
	this.c=this.a+this.b;
	System.out.println("Constructot int");
	
}
public Addition(double a, double b) 
{
	this.a =(int)Math.round(a);
	this.b = (int)Math.round(b);
	this.c=this.a+this.b;
	System.out.println("Constructot double");
}
//public Addition(String a, String b) 
//{
//	this.a =Integer.parseInt(a);
//	this.b = Integer.parseInt(b);
//	this.c=this.a+this.b;
//	System.out.println("Constructot String");
//}
@Override
public String toString() {
	return "Addition [a=" + a + ", b=" + b + ", c=" + c + "]";
}


  
  
}
