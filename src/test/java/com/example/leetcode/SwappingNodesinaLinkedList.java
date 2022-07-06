package com.example.leetcode;

import com.tistory.shanepark.leetcode.ListNode;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class SwappingNodesinaLinkedList {
   int[] arr = new int[]{1,2,3,4,5};
   ListNode head = new ListNode();

   int k = 2;

    @Test
    public void test() {
        ListNode result = testArray(ListNode.of(arr),2);

    }

    private ListNode testArray(ListNode head, int n) {
//        head.print();
//        ListNode tmp = head.next;
//        System.out.println("======================");
//        tmp.print();
        ListNode list = head;
        Map<Integer,ListNode> map = new HashMap<>();
        int index = 1;
        while(list!=null){
            map.put(index, list);
            index++;
            list = list.next;
        }
        int tmp = map.get(k).val;
        map.get(k).val = map.get(index - k ).val;
        map.get(index - k ).val = tmp;
        return head;
    }



}
