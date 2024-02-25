package com.prowings.comparableDemo;

public class Student2 implements Comparable<Object> {
	
	private int pin;
	private String address;
	
	public Student2() {
		super();
	}

	public Student2(int pin, String address) {
		super();
		this.pin = pin;
		this.address = address;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student2 [pin=" + pin + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Object obj) {
	
	Student2 std = (Student2) obj;
		if(this.getPin() == std.getPin()){
		
			return 0;
		}
		
		else if (this.getPin()> std.getPin()) {
			
			return 3;
		}
		
		else
			return -3;
//		For String Sorting
//		return this.getAddress().compareTo(std.getAddress());
		
	}
	
	

}
