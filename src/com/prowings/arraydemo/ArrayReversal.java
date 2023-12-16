package com.prowings.arraydemo;

import java.util.Arrays;

public class ArrayReversal {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6 };

		System.out.println("Original array : " + Arrays.toString(array));

		reverseArray(array);

		System.out.println("Reversed array ; " + Arrays.toString(array));

	}

	public static void reverseArray(int[] array) {

		int first = 0;

		int last = array.length - 1;

		while (first < last) {

			int temp = array[first];

			array[first] = array[last];

			array[last] = temp;

			first++;

			last--;
		}

	}

}
