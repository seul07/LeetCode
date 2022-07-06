package com.example.leetcode;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.list;

public class LastStoneWeight {
    int[] stones = new int[]{2,7,4,1,8,1};
//    int[] stones = new int[]{1};
//    @Test
//    public void solution() {
//        List<Integer> list= Arrays.stream(stones).boxed().collect(Collectors.toList());
//        list.sort(Comparator.reverseOrder());
//        int result = stones[0];
//        while(list.size()>1){
//            int max = list.get(0);
//            int secMax = list.get(1);
//            list.add(max-secMax);
//            list.remove(0);
//            list.remove(0);
//            list.sort(Comparator.reverseOrder());
//            result = list.get(0);
//        }
//
////        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
////        for(int n : stones){
////            priorityQueue.add(n);
////        }
//
//        assertThat(result).isEqualTo(1);
//    }


    @Test
    public void solution() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int n : stones){
            priorityQueue.add(n);
        }
        int result = stones[0];
        while(priorityQueue.size()>1){
            int max = priorityQueue.poll();
            int secMax = priorityQueue.poll();
            priorityQueue.add(max-secMax);
            result = priorityQueue.peek();
        }



        assertThat(result).isEqualTo(1);
    }

}
