import java.util.Scanner;
import java.util.Arrays;
public class kthelementlarge{
    static int element(int[] arr,int k){
        Arrays.sort(arr);
        int ans=1;
   for(int i = arr.length-1; i>=k; i--){ // agar largest krna hai toh  
        ans=arr[i];
   }
   return ans;

    }
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
int[] arr =new int[n];
for(int i = 0; i<arr.length;i++){
    arr[i] = sc.nextInt();

}
int k=sc.nextInt();

System.out.println("2nd smallest"+element(arr,k));

    }
}
