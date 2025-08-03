// import java.util.Scanner;
// public class triplesum{
//     static int triple(int[] arr , int target){
// int n = arr.length;
// int ans = 0;
// for(int i = 0; i<n;i++){//first number
//     for(int j = i+1;j<n;j++){//second number
//         for(int k = j+1;k<n;k++){//third number
//           if(arr[i]+arr[j]+arr[k] == target){
//             ans++;
//           }  
//         }
//     }
// }
// return ans;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("enter target");
//         int target = sc.nextInt();
//         System.out.println(triple(arr,target));
//     }


// }
import java.util.Scanner;
public class triplesum{
    static int triple(int[] arr,int target){
        int n = arr.length;
        int ans = 0;
        for(int i =0; i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if(arr[i]+arr[j] +arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target");
        int target = sc.nextInt();
        System.out.println(triple(arr,target));

    }
}

