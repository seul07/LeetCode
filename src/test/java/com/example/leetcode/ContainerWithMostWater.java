package com.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContainerWithMostWater {
//    int[] height = new int[]{1,8,6,2,5,4,8,3,7};
//    int[] height = new int[]{1,1};
    int[] height = new int[]{2,3,4,5,18,17,6};

    // 두개의 for 문을 돌면서 x 값과 y 값 곱하기의 최댓값

    @Test
    public void mostWater() {
        int max = 0;
        int left =0;
        int right =height.length-1;
        while(left < right){
            int tmp = Math.min(height[left], height[right]);
            int mul = tmp * (right-left);
            max = Math.max(max, mul);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }


//        }
        assertThat(max).isEqualTo(17);
    }
}


/**

 int max = 0;
 for(int i=0;i<height.length;i++){
 int left = i;
 int right = height.length-1;
 if(left<right){
 int tmp = Math.min(height[left],height[right]);
 int mul = tmp*(right-left);
 if(max<mul) {
 max = mul;
 }
 }
 }


 */