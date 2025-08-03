import java.util.Scanner;
class hello{
static int fun(int[] arr,int x){
  int count = 0;
    for(int i = 0; i<arr.length; i++){
    if(arr[i] >x){
      count++;
    }
    }
    return count;
}
}
public class countgreater{
  public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      System.out.println("enter size of an array");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("enter " + n + " elements");
      for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
      }
      System.out.println("enter x ");
      int x = sc.nextInt();
      System.out.println("no greater then x is " + hello.fun(arr,x));
  }
}