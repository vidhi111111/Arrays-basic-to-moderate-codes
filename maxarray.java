import java.util.Scanner;
public class maxarray{
    static int max(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>mx ){
                mx = arr[i];
            }
        }
        return mx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
   int[] arr = new int[n];
   for(int i = 0; i<n; i++){
    arr[i] = sc.nextInt();
   } 
   System.out.println(max(arr));
    }
}