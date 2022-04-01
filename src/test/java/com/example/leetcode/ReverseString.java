package com.example.leetcode;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
//        int [] nums = new int[]{-3,4,3,90};
        int target = 6;
        reverseString(s);
    }


    public static void reverseString(char[] s) {
        int lf = 0;
        int rf = s.length-1;
        while(lf<rf){
            char lfTmp = s[lf];
            char rfTmp = s[rf];
            char tmp = ' ';
            tmp = rfTmp;
            s[rf] = lfTmp;
            s[lf] = tmp;
            lf++;
            rf--;
        }

        System.out.println(Arrays.toString(s));
    }

}
