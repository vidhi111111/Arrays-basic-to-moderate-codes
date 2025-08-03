// import java.util.Scanner;
// public class inputarray{
//     static void printarray(int[] arr){
//         for(int i = 0; i< arr.length;i++){
//             System.out.print(arr[i] + " " );
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//      int n = sc.nextInt();
//      int[] arr = new int[n];
//      System.out.println("enter " + n + "number");
//      for(int i = 0; i<arr.length;i++){
//         arr[i] = sc.nextInt();
//      }
//      printarray(arr);
//     //  for(int i = 0; i<arr.length;i++){
//     //     System.out.println(arr[i]+" " );
//     //  }
//     // trying to copy arr to arr2
//      int[] arr2 = arr;
//    printarray(arr2);
//     }
// }

import java.util.Scanner;
public class inputarray{
    static void printarray(int[] arr){
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
     int[] arr = new int[4];
    arr[0] = 4;
    arr[1]= 2;
    arr[2] = 34;
    arr[3] = 323;


    //  System.out.println("enter " + n + "number");
    //  for(int i = 0; i<arr.length;i++){
    //     arr[i] = sc.nextInt();
    //  }
    System.out.println("original array");
     printarray(arr);
    //  for(int i = 0; i<arr.length;i++){
    //     System.out.println(arr[i]+" " );
    //  }
    // trying to copy arr to arr2
     int[] arr2 = arr;
     System.out.println("copied array");
   printarray(arr2);
//changing some value of arr2;
arr2[0]=12;
arr2[2]=45;

System.out.println("original array after changing values in arr2");
printarray(arr);
System.out.println("copied arr2 after changing values");
   printarray(arr2);
    }
}