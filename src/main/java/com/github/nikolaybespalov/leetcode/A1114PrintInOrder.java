package com.github.nikolaybespalov.leetcode;

import java.util.concurrent.CountDownLatch;

/**
 * @see <a href="https://leetcode.com/problems/print-in-order/">1114. Print in Order</a>
 */
public class A1114PrintInOrder {
    CountDownLatch cdl1 = new CountDownLatch(1);
    CountDownLatch cdl2 = new CountDownLatch(1);

    public void first(Runnable printFirst) {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        cdl1.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        cdl1.await();
        printSecond.run();
        cdl2.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        cdl2.await();
        printThird.run();
    }
}
