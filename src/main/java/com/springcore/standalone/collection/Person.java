package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> friends;
	private Map<String, Integer> feestruct;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeestruct() {
		return feestruct;
	}

	public void setFeestruct(Map<String, Integer> feestruct) {
		this.feestruct = feestruct;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Person(List<String> friends, Map<String, Integer> feestruct) {
		super();
		this.friends = friends;
		this.feestruct = feestruct;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feestruct=" + feestruct + "]";
	}
	
	
	
}
