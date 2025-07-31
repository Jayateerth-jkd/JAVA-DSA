package dsaarrays;
//Reverse an Array without using another array variable
public class ReverseArray {
public static void main(String[] args) {
	int a[]= {1,2,3,-4,5};
	System.out.println("Before Swapping");
	for(int num : a) {
		System.out.print(num+" ");
	}
	System.out.println();
	int left=0,temp=0;
	int right=a.length-1;
	
	while(left!=right) {
		
		temp=a[left];
		
		a[left]=a[right];
		a[right]=temp;
		left++;
		right--;
		
	}
	System.out.println("After Swapping");
	for(int num : a) {
		System.out.print(num+" ");
	}
}
}
