import java.util.Scanner;
public class pairsum{
    static int pair(int[] arr,int k){ 
    int n = arr.length;
    int ans = 0;
    for(int i = 0; i<arr.length;i++){  //first number
     for(int j = i+1;j<n;j++){   //second number
    if(arr[i]+arr[j]==k){
        ans++;
    }
     }
    }
return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + "  elements");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    
System.out.println("enter K ");
int k = sc.nextInt();
System.out.println(pair(arr,k));
   
    }
}