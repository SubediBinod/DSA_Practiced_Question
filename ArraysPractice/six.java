package ArraysPractice;
//Remove Duplicates from Sorted Array - LeetCode 26
//        Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length. Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.
//        Example:
//
//        Input: nums = [1, 1, 2]
//        Output: 2
public class six {
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int index = 0;

        for (int i = 0; i < len - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i];
            }
        }

        // Include the last element in the modified array
        if (len > 0) {
            nums[index++] = nums[len - 1];
        }

        return index;
    }
    public static void main(String[]args){
        int new_len =removeDuplicates(new int[]{1, 1, 2, 2, 3, 4, 5});
        System.out.println(new_len);
    }
}
