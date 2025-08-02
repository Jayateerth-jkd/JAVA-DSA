package dsaarrays;

import java.util.Arrays;

/*
 Move Zeroes

Solution
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 

Follow up: Could you minimize the total number of operations done?
 
 
 */
public class MoveAllZeros {
public static void main(String[] args) {
	

	int a[]= {0,1,0,3,12,7,0,0,34,7,1,0,3,2,0,1};
	int index=0;
	System.out.println("Before Moving Zero's");
	System.out.println(Arrays.toString(a));
	System.out.println();
	System.out.println("Using type 1");
	for(int i=0;i<a.length;i++) {
		if(a[i]!=0) {
			a[index++]=a[i];
		}
	}
	while(index<a.length) {
		a[index++]=0;
	}
	
	System.out.println(Arrays.toString(a));
	System.out.println();
	System.out.println("Using type 2");
	index=0;
	for(int i=0;i<a.length;i++) {
	if(a[i]!=0) {
		int temp =a[i];
		a[i]=a[index];
		a[index++]=temp;
	}
	}
	
		System.out.println(Arrays.toString(a));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}