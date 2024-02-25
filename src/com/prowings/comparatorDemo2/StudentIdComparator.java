package com.prowings.comparatorDemo2;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student> {

	public int compare(Student s1, Student s4) {

		if(s1.getId()==s4.getId())
		{
			return 0;
		}
		else if(s1.getId()>s4.getId())
		{
			return 5;
		}
		else
		{
			return -5;
		}
	}

}
