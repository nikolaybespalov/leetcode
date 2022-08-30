package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A460LFUCacheTest {
    @Test
    public void test1() {
        A460LFUCache instance = new A460LFUCache(2);
        instance.put(1, 1);
        instance.put(2, 2);
        assertEquals(1, instance.get(1));
        instance.put(3, 3);
        assertEquals(-1, instance.get(2));
        assertEquals(3, instance.get(3));
        instance.put(4, 4);
        assertEquals(-1, instance.get(1));
        assertEquals(3, instance.get(3));
        assertEquals(4, instance.get(4));
    }

    @Test
    public void test2() {
        A460LFUCache instance = new A460LFUCache(3);
        instance.put(1, 1);
        instance.put(2, 2);
        instance.put(3, 3);
        assertEquals(-1, instance.get(0));
        assertEquals(3, instance.get(3));
        assertEquals(2, instance.get(2));
        assertEquals(1, instance.get(1));
    }

    @Test
    public void test3() {
        A460LFUCache instance = new A460LFUCache(2);
        instance.put(1, 1);
        instance.put(2, 2);
        assertEquals(1, instance.get(1));
        assertEquals(2, instance.get(2));
        instance.put(3, 3);
        assertEquals(-1, instance.get(1));
        assertEquals(2, instance.get(2));
        assertEquals(3, instance.get(3));
    }

    @Test
    public void test4() {
        A460LFUCache instance = new A460LFUCache(2);
        instance.put(3, 1);
        instance.put(2, 1);
        instance.put(2, 2);
        instance.put(4, 4);
        assertEquals(2, instance.get(2));
    }

    @Test
    public void test5() {
        A460LFUCache instance = new A460LFUCache(0);
        instance.put(0, 0);
        assertEquals(-1, instance.get(0));
    }

    @Test
    public void test6() {
        A460LFUCache instance = new A460LFUCache(2);
        instance.put(2, 1);
        instance.put(2, 2);
        assertEquals(2, instance.get(2));
        instance.put(1, 1);
        instance.put(4, 1);
        assertEquals(2, instance.get(2));
    }

    @Test
    public void test7() {
        A460LFUCache instance = new A460LFUCache(3);
        instance.put(2, 2);
        instance.put(1, 1);
        assertEquals(2, instance.get(2));
        assertEquals(1, instance.get(1));
        assertEquals(2, instance.get(2));
        instance.put(3, 3);
        instance.put(4, 4);
        assertEquals(-1, instance.get(3));
        assertEquals(2, instance.get(2));
        assertEquals(1, instance.get(1));
        assertEquals(4, instance.get(4));
    }

    @Test
    public void test8() {
        A460LFUCache instance = new A460LFUCache(2);
        assertEquals(-1, instance.get(2));
        instance.put(2, 6);
        assertEquals(-1, instance.get(1));
        instance.put(1, 5);
        instance.put(1, 2);
        assertEquals(2, instance.get(1));
        assertEquals(6, instance.get(2));
    }

    @Test
    public void test9() {
        A460LFUCache instance = new A460LFUCache(10);
        instance.put(10, 13);
        instance.put(3, 17);
        instance.put(6, 11);
        instance.put(10, 5);
        instance.put(9, 10);
        assertEquals(-1, instance.get(13));
        instance.put(2, 19);
        assertEquals(19, instance.get(2));
        assertEquals(17, instance.get(3));
        instance.put(5, 25);
        assertEquals(-1, instance.get(8));
        instance.put(9, 22);
        instance.put(5, 5);
        instance.put(1, 30);
        assertEquals(-1, instance.get(11));
        instance.put(9, 12);
        assertEquals(-1, instance.get(7));
        assertEquals(5, instance.get(5));
        assertEquals(-1, instance.get(8));
        assertEquals(12, instance.get(9));
        instance.put(4, 30);
        instance.put(9, 3);
        assertEquals(3, instance.get(9));
        assertEquals(5, instance.get(10));
        assertEquals(5, instance.get(10));
        instance.put(6, 14);
        instance.put(3, 1);
        assertEquals(1, instance.get(3));
        instance.put(10, 11);
        assertEquals(-1, instance.get(8));
        instance.put(2, 14);
        assertEquals(30, instance.get(1));
        assertEquals(5, instance.get(5));
        assertEquals(30, instance.get(4));
        instance.put(11, 4);
        instance.put(12, 24);
        instance.put(5, 18);
        assertEquals(-1, instance.get(13));
        instance.put(7, 23);
        assertEquals(-1, instance.get(8));
        assertEquals(24, instance.get(12));
        instance.put(3, 27);
        instance.put(2, 12);
        assertEquals(18, instance.get(5));
        instance.put(2, 9);
        instance.put(13, 4);
        instance.put(8, 18);
        instance.put(1, 7);
        assertEquals(14, instance.get(6));
        instance.put(9, 29);
        instance.put(8, 21);
        assertEquals(18, instance.get(5));
        instance.put(6, 30);
        instance.put(1, 12);
        assertEquals(11, instance.get(10));
        instance.put(4, 15);
        instance.put(7, 22);
        instance.put(11, 26);
        instance.put(8, 17);
        instance.put(9, 29);
        assertEquals(18, instance.get(5));
        instance.put(3, 4);
        instance.put(11, 30);
        assertEquals(-1, instance.get(12));
        instance.put(4, 29);
        assertEquals(4, instance.get(3));
        assertEquals(29, instance.get(9));
        assertEquals(30, instance.get(6));
        instance.put(3, 4);
        assertEquals(12, instance.get(1));
        assertEquals(11, instance.get(10));
        instance.put(3, 29);
        instance.put(10, 28);
        instance.put(1, 20);
        instance.put(11, 13);
        assertEquals(29, instance.get(3));
        instance.put(3, 12);
        instance.put(3, 8);
        instance.put(10, 9);
        instance.put(3, 26);
        assertEquals(17, instance.get(8));
        assertEquals(-1, instance.get(7));
        assertEquals(18, instance.get(5));
        instance.put(13, 17);
        instance.put(2, 27);
        instance.put(11, 15);
        assertEquals(-1, instance.get(12));
        instance.put(9, 19);
        instance.put(2, 15);
        instance.put(13, 16);
        assertEquals(20, instance.get(1));
        instance.put(12, 17);
        instance.put(9, 1);
        instance.put(6, 19);
        assertEquals(29, instance.get(4));
        assertEquals(18, instance.get(5));
        assertEquals(18, instance.get(5));
        instance.put(8, 1);
        instance.put(11, 7);
        instance.put(5, 2);
        instance.put(9, 28);
        assertEquals(20, instance.get(1));
        instance.put(2, 2);
        instance.put(7, 4);
        instance.put(4, 22);
        instance.put(7, 24);
        instance.put(9, 26);
        instance.put(13, 18);
        instance.put(11, 26);
    }

    @Test
    public void test10() {
        A460LFUCache instance = new A460LFUCache(6);

        instance.put(1, 1);
        instance.put(2, 2);
        instance.put(3, 3);
        instance.put(4, 4);
        instance.put(5, 5);
        instance.put(6, 6);

        assertEquals(1, instance.get(1));
        assertEquals(2, instance.get(2));
        assertEquals(3, instance.get(3));
        assertEquals(4, instance.get(4));
        assertEquals(3, instance.get(3));
        assertEquals(4, instance.get(4));

        int asd = 0;
        int asdf = asd;
    }

    @Test
    public void test11() {
        A460LFUCache instance = new A460LFUCache(6);

        instance.put(3, 3);
        instance.put(2, 2);
        instance.put(1, 1);
        assertEquals(3, instance.get(3));
        assertEquals(3, instance.get(3));
        assertEquals(1, instance.get(1));

        int asd = 0;
        int asdf = asd;
    }
}