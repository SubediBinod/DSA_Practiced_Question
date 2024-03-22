package ArraysPractice;

import java.util.Arrays;

//example array ={40,30,-1,3,-2,40,0}
//Place all negative elements to the end of the array and replace negative number with  zero
// output array: {40,30,3,40,0,0,0}
public class eight {
    public static String removeNegative(int[]arr){
        int pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                int temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
                pos++;
            }
            else{
                arr[i]=0;
            }

        }
        return Arrays.toString(arr);

    }
    public static void main(String[] args) {
        int[] arr= {40,30,-1,3,-2,40,0};
        String arrs=removeNegative(arr);
        System.out.println(arrs);
    }
}
