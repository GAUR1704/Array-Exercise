package com.prowings.arraydemo;

public class Array {public static void main(String[] args) {

	int[] arr = { 12, 20, 4, 9, 2, 20, 9 };
	int n = arr.length;

	findUnique(arr, n);

}

public static void findUnique(int[] arr, int n) {
	for (int i = 0; i < n; i++) {

		int j;
		for (j = 0; j < i; j++) {
			if (arr[i] == arr[j])
				break;

		}
		if (i == j)
			System.out.println(arr[i]);
	}

}
	
	

}
