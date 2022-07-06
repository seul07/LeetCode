package com.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeNumber {
    int x = 121;
    @Test
    public void solution() {
        String t = x+"";
        int lt = 0;
        int rt = t.length()-1;
        boolean result = true;
        while(lt<rt){
            if(t.charAt(lt)!=t.charAt(rt)) result = false;
            lt++;
            rt--;
        }



        assertThat(result);
    }
}
