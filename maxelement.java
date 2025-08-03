//maximum element in the array

import java.util.Scanner;
public class maxelement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
       arr[0]=sc.nextInt();
        int ans = arr[0];
   
        for(int i = 1; i<arr.length;i++){
           arr[i]=sc.nextInt();
            if(arr[i] > ans){
                ans = arr[i];
            }
          

        }
        System.out.println(ans);
    }
}