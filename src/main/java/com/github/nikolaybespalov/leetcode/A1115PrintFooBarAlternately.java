package com.github.nikolaybespalov.leetcode;

import java.util.concurrent.Semaphore;

/**
 * @see <a href="https://leetcode.com/problems/print-foobar-alternately/">1115. Print FooBar Alternately</a>
 */
public class A1115PrintFooBarAlternately {
    private final int n;
    private final Semaphore foo = new Semaphore(1);
    private final Semaphore bar = new Semaphore(0);

    public A1115PrintFooBarAlternately(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            foo.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            bar.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            bar.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            foo.release();
        }
    }
}