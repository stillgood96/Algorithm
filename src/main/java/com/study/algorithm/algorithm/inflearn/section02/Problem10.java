package com.study.algorithm.algorithm.inflearn.section02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem10 {

  public int solution(int count, int [][] range) {
    int peaksCount = 0;
    for(int i = 1; i <= count; i++) {
      for(int j = 1 ; j <= count; j++) {
        int current = range[i][j];
        int top = 0, bottom = 0, left = 0, right = 0;
        top = range[i-1][j];
        bottom = range[i + 1][j];
        left = range[i][j-1];
        right = range[i][j+1];

        if(current > top && current > bottom && current > left && current > right) {
          peaksCount++;
        }
      }
    }

    return peaksCount;
  }

  public int lectureSolution(int count, int [][] range) {
    int [] dx = {-1, 0, 1, 0};
    int [] dy = {0, 1, 0, -1};

    int peaksCount = 0;
    for(int i = 0; i < count; i++) {
      for(int j = 0; j < count; j++) {
        int current = range[i][j];
        boolean isPeaks = true;
        for(int k = 0; k < 4; k++) {
          int nx = i + dx[k];
          int ny = j + dy[k];
          if(nx >= 0 && nx < count && ny >= 0 && ny < count) {
            if(current <= range[nx][ny]) {
              isPeaks = false;
              break;
            }
          }
        }
        if(isPeaks) {
          peaksCount++;
        }
      }
    }

    return peaksCount;
  }

  public static void main(String[] args) {
    Problem10 problem = new Problem10();
    Scanner kb = new Scanner(System.in);

    int count = kb.nextInt();
    /*
    int[][] numberArray = new int[count + 2][count + 2];

    for(int i = 1; i <= count; i++) {
      for(int j = 1; j <= count; j++) {
        numberArray[i][j] = kb.nextInt();
      }
    }
    System.out.println(problem.solution(count, numberArray));
     */

    int[][] numberArray = new int[count][count];
    for(int i = 0; i < count; i++) {
      for(int j = 0; j < count; j++) {
        numberArray[i][j] = kb.nextInt();
      }
    }
    System.out.println(problem.lectureSolution(count, numberArray));
  }
}
