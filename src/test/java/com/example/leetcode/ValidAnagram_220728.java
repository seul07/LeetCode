package com.example.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidAnagram_220728 {
    String s = "anagram";
    String t = "nagaram";
    @Test
    public void test() {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        assertThat(sChar).isEqualTo(tChar);
    }
}
