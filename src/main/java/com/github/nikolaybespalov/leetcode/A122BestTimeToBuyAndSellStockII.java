package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/">122. Best Time to Buy and Sell Stock II</a>
 */
public class A122BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int ans = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            ans += Math.max(prices[i + 1] - prices[i], 0);
        }

        return ans;
    }
}
