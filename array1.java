
// class array{
//     void demo(){
//      int[] ages = new int[3];
//      float[] weights = new float[4];
//      String[] names = new String[5];
//      ages[0] = 34;
//     weights[3] = 5;
//     names[2] = "hello";        
//  System.out.println(ages[0]);
//     }}
//     public class array1{
//     public static void main(String[] args) {
//         array obj = new array();
//         obj.demo();
//        int[][] arr={{1,2},{2,3}};
//        String[] names = {"hello","me","hi"};
// System.out.println(names[1]);
//     }
// }


public class array1{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{2,3,4},{4,5,6}};
        for(int i = 0; i<3;i++){
            for(int j = 0; j<3;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}