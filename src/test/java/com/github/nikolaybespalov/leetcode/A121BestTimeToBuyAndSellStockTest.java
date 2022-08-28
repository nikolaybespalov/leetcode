package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A121BestTimeToBuyAndSellStockTest {
    A121BestTimeToBuyAndSellStock instance = new A121BestTimeToBuyAndSellStock();

    @Test
    public void test1() {
        assertEquals(5, instance.maxProfit(new int[]{
                7, 1, 5, 3, 6, 4
        }));
    }

    @Test
    public void test2() {
        assertEquals(0, instance.maxProfit(new int[]{
                7, 6, 4, 3, 1
        }));
    }

    @Test
    public void test3() {
        assertEquals(1, instance.maxProfit(new int[]{
                1, 2
        }));
    }

    @Test
    public void test4() {
        assertEquals(2, instance.maxProfit(new int[]{
                2, 4, 1
        }));
    }

    @Test
    public void test5() {
        assertEquals(4, instance.maxProfit(new int[]{
                3, 2, 6, 5, 0, 3
        }));
    }

    @Test
    public void test6() {
        assertEquals(2, instance.maxProfit(new int[]{
                7, 2, 4, 1
        }));
    }

    @Test
    public void test7() {
        assertEquals(2, instance.maxProfit(new int[]{
                2, 1, 2, 1, 0, 1, 2
        }));
    }

}