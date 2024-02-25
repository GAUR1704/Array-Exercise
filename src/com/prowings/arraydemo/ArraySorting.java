package com.prowings.arraydemo;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		int[] array = { 5, 8, 10, 19, 18, 3, 25 };

		System.out.println("Given array is : " + Arrays.toString(array));

		arraySort(array);

		System.out.println("Sorted array is : " + Arrays.toString(array));

	}

	public static void arraySort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {

					int temp = array[j];

					array[j] = array[j + 1];

					array[j + 1] = temp;
				}
			}

		}

	}
}
