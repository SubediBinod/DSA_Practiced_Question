package ArraysPractice;

import java.util.Arrays;

//Duplicate Number
//        Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)
//
//        Example
//
//        removeDuplicates({1, 1, 2, 2, 3, 4, 5})
//        Output : [1, 2, 3, 4, 5]
public class five {
    public static int[] removeDuplicates(int[] arr) {
        //   TODO
        int len = arr.length;
        int index = 0;
        int newarr[] = new int[len];
        for (int i = 0; i < len; i++) {
            boolean check = false;
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    check = true;
                    break;
                }

            }
            if (!check) {
                newarr[index] = arr[i];
                index++;
            }
        }
        return Arrays.copyOf(newarr, index);
    }
    public static void main(String[]args){
        int []newarr =removeDuplicates(new int[]{1, 1, 2, 2, 3, 4, 5});
        System.out.println(Arrays.toString(newarr));
    }
}

