package com.springcore.javaconfig;


public class Students {
	
	private Course course;
	
	public Students(Course course) {
		super();
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Students [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public void study()
	{
		this.course.name();
		System.out.println("Studying............");
	}

}
