package ArraysPractice;


import java.util.Scanner;

//Given 2D array calculate the sum of diagonal elements.
//
//        Example
//
//        myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
//
//        sumDiagonalElements(myArray2D) # 15
 class Diagonal_sum{
     int sum(int[][]arr)
     {
         int sum=0;
         for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr.length;j++){
                 if(i==j){
                     sum+=arr[i][i];
                 }
             }

         }
         return sum;


     }
}
public class two {
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         Diagonal_sum obj = new Diagonal_sum();
         System.out.println("enter the row and column size");
         int row = sc.nextInt();
         int col = sc.nextInt();
         int[][] arr = new int[row][col];
         System.out.println("enter the elements for your 2d array");
         for (int i = 0; i < row; i++) {
             for(int j=0;j<col;j++){
                 arr[i][j]= sc.nextInt();
             }

         }
         System.out.println("the sum is"+obj.sum(arr));
     }


}
