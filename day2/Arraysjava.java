package week1.day2;

import java.util.Arrays;

public class Arraysjava {

	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 15;
		nums[4] = 21;
		
		//int[] nums = {10,50,20,80,40}; //data saved with indices
		//System.out.println(nums.length);// no. of data in an array
		//System.out.println(nums[0]);
		//System.out.println(nums.length-1);// lastIndex
		Arrays.sort(nums);
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
