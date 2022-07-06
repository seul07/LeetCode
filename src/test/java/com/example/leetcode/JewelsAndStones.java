package com.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JewelsAndStones {
    String jewels = "aA";
    String stones = "aAAbbb";
    @Test
    public void test() {
        int cnt = 0;
        for(int i=0; i<jewels.length();i++){
            for(int j=0; j<stones.length();j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    cnt++;
                }

            }
        }


        assertThat(cnt).isEqualTo(3);
    }
}
