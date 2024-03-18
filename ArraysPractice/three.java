package ArraysPractice;

import java.util.Arrays;
import java.util.Scanner;

//Best Score
//        Given an array, write a function to get first, second best scores from the array and return it in new array.
//
//        Array may contain duplicates.
class bestValue{
    int[] bestvalues(int[]arr){
        int a=arr[0];
        int b= arr[0];
        int i;
        for(i=0;i<arr.length;i++){
            if(a<arr[i])
            {
                a= arr[i];

            }
        }
        for(i=0;i<arr.length;i++){
            if((b<arr[i])&& (a!=arr[i]))
            {
                b= arr[i];

            }
        }

      System.out.println(a +" " +b);
        return new int[]{a,b};


    }
}

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bestValue obj = new bestValue();
        System.out.println("enter the size of your array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter your array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(obj.bestvalues(arr)));

    }
}
