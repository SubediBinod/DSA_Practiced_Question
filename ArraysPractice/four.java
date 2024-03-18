package ArraysPractice;
//Missing Number
//        Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.
//
//        Example
//
//        myArray = {1,2,3,4,6}
//        findMissingNumberInArray(myArray, 6) // 5
//        Hint:
//
//        Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.
public  class four {
    public static int findMissingNumberInArray(int[] arr, int n) {
        int expectedSum = (n * (n + 1)) / 2;
        int arrSum = 0;
        for (int x : arr) {
            arrSum += x;
        }
        return expectedSum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int missingValue = findMissingNumberInArray(arr, 7); // Since the range is 1 to 7
        System.out.println(missingValue);
    }

}
