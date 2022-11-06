package com.springcore.collection;

import java.util.*;

public class Emp {

	private String empname;
	private List<String> address;
	private Set<String> phones;
	private Map<String,String> course;
	@Override
	public String toString() {
		return "Emp [empname=" + empname + ", address=" + address + ", phones=" + phones + ", course=" + course + "]";
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Set<String> getPhones() {
		return phones;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Emp(String empname, List<String> address, Set<String> phones, Map<String, String> course) {
		super();
		this.empname = empname;
		this.address = address;
		this.phones = phones;
		this.course = course;
	}
	
	
}
