package ArraysPractice;
//Best Time to Buy and Sell Stock - LeetCode 121
//        You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//        Example:
//
//        Input: prices = [7, 1, 5, 3, 6, 4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
public class seven {
    public static int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 0)
            return 0; // No profit if prices array is empty

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_index = 0;
        int max_index = 0;

        // Finding the minimum price and its index
        for (int i = 0; i < len; i++) {
            if (prices[i] < min) {
                min = prices[i];
                min_index = i;
            }
        }

        // Finding the maximum price and its index after the minimum price index
        for (int i = min_index; i < len; i++) {
            if (prices[i] > max) {
                max = prices[i];
                max_index = i;
            }
        }

        int profit = prices[max_index] - prices[min_index];
        return profit;
    }
    public static void main(String[]args){
        int profit =maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(profit);
    }
    
}
