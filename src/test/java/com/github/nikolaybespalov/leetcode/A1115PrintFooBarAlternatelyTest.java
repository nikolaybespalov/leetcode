package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

import static org.junit.Assert.assertEquals;

public class A1115PrintFooBarAlternatelyTest {
    @Test
    public void test1() throws InterruptedException {
        A1115PrintFooBarAlternately instance = new A1115PrintFooBarAlternately(2);

        StringBuilder sb = new StringBuilder();

        CountDownLatch cdl = new CountDownLatch(2);

        Thread t1 = new Thread(() -> {
            try {
                cdl.countDown();
                cdl.await();
                instance.foo(() -> sb.append("foo"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                cdl.countDown();
                cdl.await();
                instance.bar(() -> sb.append("bar"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        assertEquals("foobarfoobar", sb.toString());
    }
}