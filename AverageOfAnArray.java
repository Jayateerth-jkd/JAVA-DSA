
import java.util.Arrays;
import java.util.Scanner;

class AverageOfAnArray{
    public static void main(String[] args) {
        System.out.println("enter the number of elements in an array");
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.err.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.err.println("Array is:");
    System.out.println(Arrays.toString(arr));
    AverageOfAnArray obj = new AverageOfAnArray();
    obj.findAverage(arr,n);
    }
    void findAverage(int[]arr,int n){
         double sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        
        System.out.print("The average of the Array is :"+sum/n);
    }
}