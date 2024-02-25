package com.prowings.comparatorDemo;

import java.util.Comparator;

public class CandidateNameComparator implements Comparator<Candidate>{

	public int compare(Candidate c3,Candidate c4)
	{
//		return c3.getName().compareTo(c4.getName());
		
		if(c3.getRoll()==c4.getRoll())
		{
			return 0;
		}
		else if(c3.getRoll()>c4.getRoll())
		{
			return 5;
		}
		else
		{
			return -5;
		}

	}

}
