package com.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciNumber_509 {
    int n = 2;

    @Test
    public void test() {
        int cur=0,next=1,tmp;
        while(n>0){
            tmp=next+cur;
            next=cur;
            cur=tmp;
            n--;
        }
        System.out.println(cur);
    }
}
