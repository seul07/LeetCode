package com.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanToInteger {
    String s = "MCMXCIV";
    int I = 1;
    int V = 5;
    int X = 10;
    int L = 50;
    int C = 100;
    int D = 500;
    int M = 1000;

    @Test
    public void test() {
        char[] arr = s.toCharArray();
        // I V  4
        // I X  9
        // X L  40
        // X C  90
        // C D  400
        // C M  900
        int answer=0;
        int last=0;
        for (int i = 0; i < s.length(); i++) {
            int now=0;
            switch (s.charAt(i)){
                case 'I':
                    now = 1;
                    break;
                case 'V':
                    now = 5;
                    break;
                case 'X':
                    now = 10;
                    break;
                case 'L':
                    now = 50;
                    break;
                case 'C':
                    now = 100;
                    break;
                case 'D':
                    now = 500;
                    break;
                case 'M':
                    now = 1000;
                    break;
            }
            answer = (last <now) ? (answer - last*2 +now) : (answer + now);
            last = now;
        }


        /**
         * ans = 0 < 10000  => 0 - 0 *2 + 1000  //  last = 1000
         * ans = 1000 < 100  =>  1000 + 100   //   last = 100
         * ans = 100 < 1000  => 1100 - 100*2 + 1000 = 1900   // last = 1000
         * ans = 1000 < 10  => 1900 + 10 = 1910  //  last = 10
         * ans = 10 < 100
         *
         */



        assertThat(true);
    }

}
