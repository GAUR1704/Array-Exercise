package com.prowings.arraydemo;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {

		int[] array1 = { 1, 9, 3, 4, 5 };
		int[] array2 = { 6, 4, 8, 9, 5 };

		int[] res = uniqueElement(mergeArray(array1, array2));

		System.out.println("Merge array is :" + Arrays.toString(res));
	}


	public static int[] mergeArray(int[] array1, int[] array2) {
		int[] result = new int[array1.length + array2.length];

		int memory = 0;

		for (int i = 0; i < array1.length; i++) {
			result[memory] = array1[i];

			memory++;
		}
		for (int j = 0; j < array2.length; j++) {
			result[memory] = array2[j];

			memory++;
		}
		Arrays.parallelSort(result);

		return result;
	}

	public static int[] uniqueElement(int[] mergeArray) {
		int n = mergeArray.length;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = i + 1; j < n; j++) {
				if (mergeArray[i] == mergeArray[j]) {
					mergeArray[j] = mergeArray[n - 1];
					n--;
					j--;
				}
			}
		}
		
		return Arrays.copyOf(mergeArray, n);
	}
}
