package com.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
// indexOf 특정 문자/문자열 앞에서부터 처음 발견되는 인덱스 반환 , 없으면 -1 반환
public class LongestCommonPrefix {
    String[] strs = {"flower","flow","flight"};
//    String[] strs = {"dog","racecar","car"};
//    String[] strs = {"aaa","aa","aaa"};
    @Test
    public void test() {
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }

//        assertThat(prefix).isEqualTo("aa");
    }
}
