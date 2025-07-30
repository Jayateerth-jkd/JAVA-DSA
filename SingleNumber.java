package dsaarrays;
/*Given a non-empty array of integers nums, 
 * every element appears twice except for one. 
 * Find that single one.

You must implement a solution with a linear 
runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4
*/

public class SingleNumber {
public static void main(String[] args) {
int arr[]= {2,3,4,2,3,4,1};
Solution s = new Solution();
int result= s.singleNumber(arr);
System.out.println("result:"+result);
}
}
class Solution{
	public int singleNumber(int[] arr) {
		int res=0;
		for(int num:arr) {
			res^=num;
			
		}
		return res;
	}
	
}
