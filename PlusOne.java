package dsaarrays;

import java.util.Arrays;
import java.util.Scanner;

/*
	Plus One

	Solution
	You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

	Increment the large integer by one and return the resulting array of digits.

	 

	Example 1:

	Input: digits = [1,2,3]
	Output: [1,2,4]
	Explanation: The array represents the integer 123.
	Incrementing by one gives 123 + 1 = 124.
	Thus, the result should be [1,2,4].
	Example 2:

	Input: digits = [4,3,2,1]
	Output: [4,3,2,2]
	Explanation: The array represents the integer 4321.
	Incrementing by one gives 4321 + 1 = 4322.
	Thus, the result should be [4,3,2,2].
	Example 3:

	Input: digits = [9]
	Output: [1,0]
	Explanation: The array represents the integer 9.
	Incrementing by one gives 9 + 1 = 10.
	Thus, the result should be [1,0].
	 

	Constraints:

	1 <= digits.length <= 100
	0 <= digits[i] <= 9
	digits does not contain any leading 0's.
*/

public class PlusOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		System.out.println();
		int n = sc.nextInt();
		int numbers[]= new int[n];
		String s="";

		for(int i=0;i<n;i++) {
			System.out.print("Enter array element :"+(i+1)+": ");
			numbers[i]=sc.nextInt();
			System.out.println();
		}
		System.out.println("Array elements are:");
		System.out.println(Arrays.toString(numbers));
		
		//Converting the int[] to string 
		for(int i=0;i<numbers.length;i++) {
		s+= numbers[i];
		}
		
		int num = Integer.parseInt(s);
		num=num+1;
		s=Integer.toString(num);
		
		numbers= new int[s.length()];
		for(int i=0;i<s.length();i++) {
			numbers[i]=s.charAt(i)-'0';
		}
		System.out.println();
		System.out.println(Arrays.toString(numbers));
				
}
  }

/* Easy and perfect method
 
 class Solution {
    public int[] plusOne(int[] digits) {
       for(int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
    }

    int[] result = new int[digits.length + 1];
    result[0] = 1;
    return result;
        
    }
}

 
 
 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
