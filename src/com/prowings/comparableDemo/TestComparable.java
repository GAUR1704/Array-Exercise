package com.prowings.comparableDemo;

import java.util.Arrays;

public class TestComparable {

	public static void main(String[] args) {
	
		
		Student s1 = new Student(40, "AAA");
		Student s2 = new Student(30, "BBB");
		Student s3 = new Student(20, "CCC");
		Student s4 = new Student(10, "DDD");

		Student[] student = { s1, s2, s3, s4 };
		Arrays.sort(student);
		System.out.println(Arrays.toString(student));

	}

}
