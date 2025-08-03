public class app{
        static void printarray(int[] arr){
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }
    static void changearray(int[] arr){
   for(int i = 0; i< arr.length;i++){
    arr[i] = 0; 
   }

    }
    static void changeval(int a){
   a = 10004;
    }
    public static void main(String[] args) {
        int a = 5;
        changeval(a);
        System.out.println(a);
        int[] arr = new int[3];
        arr[0] = 4;
        arr[1] = 7;
        arr[2] = 8;
        changearray(arr);
        printarray(arr);
    }
}