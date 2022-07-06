package com.example.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.PriorityQueue;

import static org.assertj.core.api.Assertions.assertThat;

public class KthLargestElementInAStream {

    @Test
    public void test() {
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int n : kthLargest.nums){
            priorityQueue.add(n);
        }
        kthLargest.add(3);
//        assertThat(kthLargest.add(3)).isEqualTo(4);
//        assertThat(kthLargest.add(5)).isEqualTo(5);
//        assertThat(kthLargest.add(10)).isEqualTo(5);
//        assertThat(kthLargest.add(9)).isEqualTo(8);
//        assertThat(kthLargest.add(4)).isEqualTo(8);
    }

//    @Test
//    public void test2() {
//        KthLargest kthLargest = new KthLargest(1, new int[]{});
//        assertThat(kthLargest.add(-3)).isEqualTo(-3);
//        assertThat(kthLargest.add(-2)).isEqualTo(-2);
//        assertThat(kthLargest.add(-4)).isEqualTo(-2);
//        assertThat(kthLargest.add(0)).isEqualTo(0);
//        assertThat(kthLargest.add(4)).isEqualTo(4);
//    }
//
//    @Test
//    public void test3() {
//        KthLargest kthLargest = new KthLargest(2, new int[]{0});
//        assertThat(kthLargest.add(-1)).isEqualTo(-1);
//        assertThat(kthLargest.add(1)).isEqualTo(0);
//        assertThat(kthLargest.add(-2)).isEqualTo(0);
//        assertThat(kthLargest.add(-4)).isEqualTo(0);
//        assertThat(kthLargest.add(3)).isEqualTo(1);
//    }
}


class KthLargest{
    int k;
    int[] nums;

    public KthLargest(int i, int[] ints) {
        this.k = i;
        this.nums = ints;
    }

    public int add(int i) {
        int max = 0;
        nums[nums.length] = i;
        return max;
    }

}