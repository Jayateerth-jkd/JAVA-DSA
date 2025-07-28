
import java.util.Arrays;
import java.util.Scanner;

class EvenOddInArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        Calculate Calculator = new Calculate();
        System.out.println("Enter the size of an array");
        n = sc.nextInt();

        int arr[]= new int[n];
        System.out.println("Enter the marks:");
        for (int i =0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
      
      System.out.println(Arrays.toString(Calculator.verify(n,arr)));

    }
}
class Calculate{
    int[] verify(int a, int arr[]){
        int evencount=0;
        int oddcount=0;
        for (int i = 0; i < arr.length; i++) {
        if (arr[i]%2==0) {
             evencount+=1;
        }
        else{

            oddcount+=1;
        }
        
        }
        return new int[]{oddcount,evencount};
    }

}