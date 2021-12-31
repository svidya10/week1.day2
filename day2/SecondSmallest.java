package week1.day2;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] nums = {23,45,67,32,89,22};
		Arrays.sort(nums);
		
		System.out.println(nums[1] + " is the second smallest number");

	}

}
