//search the element x in the array if it is then return its index value else return -1;
import java.util.Scanner;
public class search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //linear search
        int n = sc.nextInt();
      int[] arr = new int[n];
      int a = sc.nextInt();
      int ans = -1;
      for(int i = 0; i<arr.length;i++){
        arr[i]=sc.nextInt();
        if(arr[i]==a){
       ans = i;
       
        }
      }
      System.out.println(ans);
    }
}