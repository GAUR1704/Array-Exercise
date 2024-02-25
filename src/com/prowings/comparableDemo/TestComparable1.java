package com.prowings.comparableDemo;

import java.util.Arrays;

public class TestComparable1 {

	public static void main(String[] args) {
		
		Student1 s1 = new Student1(30, "Ram");
		Student1 s2 = new Student1(20, "Sham");
		Student1 s3 = new Student1(10, "Gaurav");
		
		Student1[]student1 = {s1,s2,s3};
		
		Arrays.sort(student1);
		
		System.out.println(Arrays.toString(student1));

	}

}
