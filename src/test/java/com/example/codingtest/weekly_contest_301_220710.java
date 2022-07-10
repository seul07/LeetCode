package com.example.codingtest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class weekly_contest_301_220710 {

    int[] arr = {5,4,4};

    @Test
    public void test() {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            answer = Math.max(arr[i],answer);
            sum += arr[i];
        }
        answer = Math.max(answer, (sum+1)/2);
        assertThat(answer).isEqualTo(7);
    }

}
