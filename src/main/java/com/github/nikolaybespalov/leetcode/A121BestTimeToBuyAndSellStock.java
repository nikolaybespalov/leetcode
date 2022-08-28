package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">121. Best Time to Buy and Sell Stock</a>
 */
public class A121BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = 0;

        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price - min > ans) {
                ans = price - min;
            }
        }

        return ans;
    }
}
