package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A387FirstUniqueCharacterInAStringTest {
    A387FirstUniqueCharacterInAString instance = new A387FirstUniqueCharacterInAString();

    @Test
    public void test1() {
        assertEquals(0, instance.firstUniqChar("leetcode"));
    }

    @Test
    public void test2() {
        assertEquals(2, instance.firstUniqChar("loveleetcode"));
    }

    @Test
    public void test3() {
        assertEquals(-1, instance.firstUniqChar("aabb"));
    }
}