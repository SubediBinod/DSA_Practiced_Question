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
        if (len < 2)
            return 0; // Cannot make a profit with less than 2 prices
        
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < len; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int currentProfit = prices[i] - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;
    }
    public static void main(String[]args){
        int profit =maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(profit);
    }
    
}
