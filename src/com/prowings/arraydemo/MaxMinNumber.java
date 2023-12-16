package com.prowings.arraydemo;

public class MaxMinNumber {

	public static void main(String[] args) {

		int[] nums = { 5, 20, 20, 12, 10, 50 };

		int max = maxNumber(nums);

		int min = minNumber(nums);

		System.out.println("The maximum number of given array is : " + max);

		System.out.println("The minimum number of given array is : " + min);

	}

	public static int maxNumber(int[] nums) {
		
        if (nums.length == 0) {
        	
            throw new IllegalArgumentException("Array is empty");
        }

        int max = nums[0];

        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }

    public static int minNumber(int[] nums) {
    	
        if (nums.length == 0) {
        	
            throw new IllegalArgumentException("Array is empty");
        }

        int min = nums[0];

        for (int n : nums) {
            if (n < min) {
                min = n;
            }
        }

        return min;
    }


}
