package com.prowings.comparatorDemo;

public class Candidate{
	
	private int roll;
	private String name;

	public Candidate() {
		super();
	}

	public Candidate(int roll, String name) {
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
	public String toString() {
		return "Candidate [roll=" + roll + ", name=" + name + "]";
	}
	
	
	

}
