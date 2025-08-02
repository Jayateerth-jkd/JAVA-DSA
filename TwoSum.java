package dsaarrays;
import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {
public static void main(String[] args) {
	Sum s = new Sum();
	int n[]= {1,3,5,7,11,8};
	int target =8;
	int[] res= s.twoSum(n, target);
	System.out.println(Arrays.toString(res));
}}
	class Sum {
		int[] twoSum(int[] n, int target) {
			HashMap<Integer,Integer> map = new HashMap<>();
			for(int i=0;i<n.length;i++) {
				int complement=target-n[i];
				if(map.containsKey(complement)) {
					return new int [] {map.get(complement),i};
				}
				else {
					map.put(n[i],i);
				}
				
			}
			return new int[] {-1,-1};
		}
	}


