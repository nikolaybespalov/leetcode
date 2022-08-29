package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A122BestTimeToBuyAndSellStockIITest {
    A122BestTimeToBuyAndSellStockII instance = new A122BestTimeToBuyAndSellStockII();

    @Test
    public void test1() {
        assertEquals(7, instance.maxProfit(new int[]{
                7, 1, 5, 3, 6, 4
        }));
    }

    @Test
    public void test2() {
        assertEquals(4, instance.maxProfit(new int[]{
                1, 2, 3, 4, 5
        }));
    }

    @Test
    public void test3() {
        assertEquals(0, instance.maxProfit(new int[]{
                7, 6, 4, 3, 1
        }));
    }
}