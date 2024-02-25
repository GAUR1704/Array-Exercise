package com.prowings.comparableDemo;

public class Student1 implements Comparable<Object>{
	
	private int roll;
	private String name;
	
	public Student1() {
		super();
	}

	public Student1(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object obj) {
		
		Student1 std = (Student1) obj;
		
//		if(this.getRoll() == std.getRoll()) 
//		{	
//		return 0;
//		}
//		
//		else if(this.getRoll()>std.getRoll())
//		{
//			return 5;
//		}
//		else
//		{
//			return -5;
//		}
		
		return std.getRoll()-this.getRoll();
		
	}

	@Override
	public String toString() {
		return "Student1 [roll=" + roll + ", name=" + name + "]";
	}
	
	

}
