package com.prowings.arraydemo;

import java.util.Arrays;

public class DuplicateElement {

	public static void main(String[] args) {
		
		int[] array = { 9, 5, 6, 2, 8, 9, 6, 2, 6, 6, 6, 6, 3, 8, 4, 9 };
		
		System.out.println("Given array : " + Arrays.toString(array));
		
		int[] newArray = findDuplicates(array);

		System.out.println("Duplicate elements in given array : " + Arrays.toString(newArray));
	}

	public static int[] findDuplicates(int[] array) {
		
		Arrays.sort(array);
		
		int[] newArray = new int[array.length];

		int memory = 0;

		for (int i = 1; i < array.length; i++) {
			
			if (array[i] == array[i - 1]) {
				
				newArray[memory] = array[i];
				
				memory++;
				
				while (i < array.length - 1 && array[i] == array[i + 1]) {
					
					i++;
				}
			}
		}
		return Arrays.copyOf(newArray, memory);
	}

}
