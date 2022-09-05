package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A3LongestSubstringWithoutRepeatingCharactersTest {
    A3LongestSubstringWithoutRepeatingCharacters instance = new A3LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void test1() {
        assertEquals(3, instance.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test2() {
        assertEquals(1, instance.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test3() {
        assertEquals(3, instance.lengthOfLongestSubstring("pwwkew"));
    }
}