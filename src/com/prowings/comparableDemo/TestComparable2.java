package com.prowings.comparableDemo;

import java.util.Arrays;

public class TestComparable2 {

	public static void main(String[] args) {

		Student2 s1 = new Student2(40,"DDDD");

		Student2 s2 = new Student2(30,"SSSS");

		Student2 s3 = new Student2(20,"AAAA");
		
		Student2[] student = {s1,s2,s3};
		
		Arrays.sort(student);
		
		System.out.println(Arrays.toString(student));
		
		
		

	}

}
