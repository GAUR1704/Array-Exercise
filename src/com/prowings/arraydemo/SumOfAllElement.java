package com.prowings.arraydemo;

public class SumOfAllElement {

	public static void main(String[] args) {

		int[] nums = { 10, 20, 30, 40, 50 };

		int sum = findSum(nums);

		System.out.println("The sum of all elements is : " + sum);

	}

	public static int findSum(int[] nums) {

		int sum = 0;

		for (int i = 0; i < nums.length; i++)

			sum += nums[i];

		return sum;
	}

}
