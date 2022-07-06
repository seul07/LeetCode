package com.example.leetcode;

import com.tistory.shanepark.leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchInBinarySearchTree {
    Integer[] m = new Integer[]{4,2,7,1,3};
    int val = 2;
    @Test
    public void test() {
        TreeNode root = new TreeNode(m);
        while (root != null && root.val != val){
            if(val<root.val){
                root = root.left;
            }else{
                root = root.right;
            }
        }
//            root = val < root.val ? root.left : root.right;

        assertThat(root).isEqualTo(new TreeNode(new Integer[]{2, 1, 3}));
    }
}
