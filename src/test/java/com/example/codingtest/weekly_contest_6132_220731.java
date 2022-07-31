package com.example.codingtest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class weekly_contest_6132_220731 {
    int[] nums = {1, 5,0,3,5};
//    int[] nums = {10};
    int cnt=0;
    int min = Integer.MAX_VALUE;

    @Test
    public void makeArrayZeroBySubtracting() {
        while(Arrays.stream(nums).sum()!=0){
            min = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]!=0){
                    min = Math.min(min,nums[i]);
                }
            }
            subtracting(nums,min);

        }
        assertThat(cnt).isEqualTo(3);
    }

    private void subtracting(int[] nums,int x) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (nums[i]-x<0?0:nums[i]-x);
        }
        cnt++;
    }
}
