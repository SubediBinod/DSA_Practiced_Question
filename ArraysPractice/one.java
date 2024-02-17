package ArraysPractice;

import java.util.Arrays;
import java.util.Scanner;

//Middle Function
//        Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.
//
//        myArray = [1, 2, 3, 4]
//        middle(myArray)  # [2,3]
class Middle{
    int [] ReturnNewArray(int []arr){
        int []newarr= new int[arr.length-2];
        int i,j=0;
        for(i=1;i<(arr.length-1);i++){
            newarr[j]=arr[i];
            j++;
        }
        return newarr;
    }
}
public class one {
    public static void main(String[]args){
        Middle obj = new Middle();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of your array");
        int n= sc.nextInt();
        int []arr= new int[n];
        System.out.println("enter your array elements");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(obj.ReturnNewArray(arr)));
    }

}
