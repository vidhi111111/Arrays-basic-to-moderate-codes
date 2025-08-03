//in this array we need to print smallest and largest numberint array and in form of array

import java.util.Arrays;
import java.util.Scanner;
public class largesmallarray{
    static int[] element(int[] arr){
        Arrays.sort(arr);
      int[] ans = {arr[0], arr[arr.length-1]};
      return ans;
        
        // for(int i = 0; i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
       int[] ans =  element(arr);
       System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}