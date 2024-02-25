package com.prowings.comparatorDemo;

import java.util.Arrays;

public class TestComparator{

	public static void main(String[] args) {
		
		Candidate c1 = new Candidate(40,"Ram");
		Candidate c2 = new Candidate(30, "Sham");
		Candidate c3 = new Candidate(20,"Gaurav");
		Candidate c4 = new Candidate(10, "Rohan");
		
		Candidate[] candidate = {c1,c2,c3,c4};
		
		Arrays.sort(candidate,new CandidateNameComparator());
		
		System.out.println(Arrays.toString(candidate));
		

	}

}
