package ArraysPractice;

import java.util.Arrays;

//Dutch national flag problem
// input array ={}
//output array={}
public class ten {
    public static String dutchNationalFlagProblem(int[] nums){
        int one=0;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            if(nums[i]==1) {
                one++;
            }
        }
        for(int i=0;i<zero;i++){
            nums[i]=0;
        }
        for(int i=zero;i<zero+one;i++){
            nums[i]=1;
        }
        for(int i=zero+one;i<nums.length;i++){
            nums[i]=2;
        }

        return Arrays.toString(nums);
    }
    public static void main(String[] args) {
        int []arr= {1,2,0,0,2,1,1,0};
        int[]arr2={2,0,2,1,1,0};
        int[]arr3={2,0,1};
        System.out.println(dutchNationalFlagProblem(arr));
        System.out.println(dutchNationalFlagProblem(arr2));
        System.out.println(dutchNationalFlagProblem(arr3));
    }
}
