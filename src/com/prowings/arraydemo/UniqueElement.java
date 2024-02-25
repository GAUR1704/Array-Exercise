package com.prowings.arraydemo;

import java.util.Arrays;

public class UniqueElement {

	public static void main(String[] args) {

		int[] array = { 1, 2, 5, 5, 2, 4,8,9,9,8,7,7,5};

		System.out.println("Given array is : " + Arrays.toString(array));
		
		//uniqueElements(array);

	//	System.out.println("Unique element is : " + Arrays.toString(array));
			System.out.println("Unique element is : " + Arrays.toString(MergeTwoArray.uniqueElement(array)));

	}
}

//	public static void uniqueElements(int[] array) {
//
//		int n = array.length;
//
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//
//				if (array[i] == array[j]) {
//
//					array[j] = array[n - 1];
//
//					n--;
//					j--;
//
//				}
//			}
//		}
//
//		int[] result = Arrays.copyOf(array, n);
//		
//		Arrays.sort(result);
//		
//		System.out.println("Unique elements " + Arrays.toString(result));
//
//	}
//	
//
//}
