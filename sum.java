//calculate the sum of an array by taking input
import java.util.Scanner;
public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
      {  int sum = 0;
      for(int i = 0; i<arr.length;i++){
        sum = sum+arr[i];
       
      }
      System.out.println(sum);
      }
    }
}
