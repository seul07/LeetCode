package com.example.leetcode;

public class TwoSum {

    public static void main(String[] args) {
        int [] nums = new int[]{3,3};
//        int [] nums = new int[]{-3,4,3,90};
        int target = 6;
        int[] result = twoSum(nums,target);
        for(int n : result){
            System.out.println(n);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
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
        return result;
    }


}
