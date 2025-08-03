//yeh krna haiiiiii

import java.util.Scanner;

public class secondsmallest {

    static int firstmin(int[] arr) {
        int mn = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mn) {
                mn = arr[i];
            }
        }
        return mn;
    }

    static int secondmin(int[] arr) {
        int mn = firstmin(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mn) {
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int second = firstmin(arr);
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(secondmin(arr));
    }
}