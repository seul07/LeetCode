package com.example.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoSum {

    public void main(String[] args) {
        int [] nums = new int[]{3,3};
//        int [] nums = new int[]{-3,4,3,90};
        int target = 6;
        twoSum(nums,target);

    }

    public void twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0 ; i<nums.length-1 ; i++) {
            for(int j=i+1; j<nums.length;j++){
                int tmp = nums[i]+nums[j];
                if(tmp == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        assertThat(result).containsExactly(6);
    }


}
