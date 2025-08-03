import java.util.Scanner;
public class reverse{
    static int main(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        //traverse original array in reverse direction
        int j =0;
        for(int i=n-1; i<=0;i--){
            ans[j++] = arr[i];
        }
    }
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] arr = new int[n];
   int[] ans = main(arr);
   for(int i = 0; i<n;i++){
    arr[i] = sc.nextInt();}
    

   

    }
}