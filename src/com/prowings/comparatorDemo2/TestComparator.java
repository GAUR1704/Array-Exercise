package com.prowings.comparatorDemo2;

import java.util.Arrays;

public class TestComparator {

	public static void main(String[] args) {

		Student s1 = new Student(10, "AAA");
		Student s2 = new Student(20, "GGG");
		Student s3 = new Student(30, "XXX");
		Student s4 = new Student(40, "DDD");

		Student[] student = { s1, s2, s3, s4 };

		Arrays.sort(student, new StudentIdComparator());

		System.out.println(Arrays.toString(student));

	}

}
