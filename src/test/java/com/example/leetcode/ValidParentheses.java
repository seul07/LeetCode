package com.example.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidParentheses {
    String s = ")(){}";

    @Test
    public void test() {
        boolean result = false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
               stack.push(s.charAt(i));
           }else{
               if(!stack.isEmpty()){
                   char tmp = stack.pop();
                   if(s.charAt(i)==')' && tmp=='(' || s.charAt(i)=='}' && tmp=='{' || s.charAt(i)==']' && tmp =='['){
                       result = true;
                   }else{
                       result = false;
                   }
               }else{
                   result = false;
               }
           }
        }

        if(!stack.isEmpty())result = false;

        assertThat(result).isEqualTo(false);
    }

}
