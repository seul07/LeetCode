package com.example.leetcode;

import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
        int target = 6;
        reverseString(s);
        assertThat(s).containsExactly('o', 'l', 'l', 'e', 'h');

    }


    public static void reverseString(char[] s) {
        int lf = 0;
        int rt = s.length-1;
        while(lf<rt){
            char tmp = s[rt];
            s[rt] = s[lf];
            s[lf] = tmp;
            lf++;
            rt--;
        }
    }

}
