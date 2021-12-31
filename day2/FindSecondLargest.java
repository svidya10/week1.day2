package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] nums = {3,2,11,4,6,7};
		Arrays.sort(nums);
		
		System.out.println(nums[nums.length-2] +" is the second largest number");

	}

}
