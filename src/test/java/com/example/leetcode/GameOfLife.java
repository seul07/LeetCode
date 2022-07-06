package com.example.leetcode;

import com.tistory.shanepark.STool;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameOfLife {
    int[][] board = new int[][]{
            {0,1,0},{0,0,1},{1,1,1},{0,0,0}
    };

    // target =    (1,1)
    // 위      =   (0,1)  -1 0
    // 왼위 대각선 = (0,0) -1 -1
    // 왼쪽    =    (1,0)  0 -1
    // 왼아 대각선 = (0,2)  -1 +1
    // 아래    =    (1,2)   0 +1
    // 오아 대각선 =  (2,2)  +1 +1
    // 오위 대각선 =  (2,0)  +1 -1
    // 오른쪽     =  (2,1)  +1 0


    @Test
    public void test() {
        int[][] board = STool.convertToIntArray("[[0,1,0],[0,0,1],[1,1,1],[0,0,0]]");
        int n= board.length;
        int m= board[0].length;
        int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0},{1,1},{-1,1},{-1,-1},{1,-1}};

        for(int i=0; i<n ; i++){
            for(int j=0; j<m ; j++){
               int liveCnt = 0;
               for(int[] d : dir){
                   int x = i+d[0];
                   int y = j+d[1];
                   if(x>=0 && x<board.length && y >= 0 && y<board[0].length && Math.abs(board[x][y])==1){
                       liveCnt++;
                   }
               }
               if(board[i][j]==0){
                   if(liveCnt ==3 ) board[i][j] = 1;
               }else{
                   if(liveCnt <2 || liveCnt >3 ) board[i][j] = 0;
               }

            }
        }

        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j] == 0) board[i][j] = 0;
                if(board[i][j] == 1) board[i][j] = 1;
            }
        }

        assertThat(board).isDeepEqualTo(STool.convertToIntArray("[[0,0,0],[1,0,1],[0,1,1],[0,1,0]]"));
    }
}
