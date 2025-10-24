package com.study.algorithm.algorithm.inflearn.section02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem09 {

  public int solution(int count, int [][] range) {
    ArrayList<Integer> answer = new ArrayList<>();

    int max = 0;
    int diagonal01 = 0;
    int diagonal02 = 0;
    for(int i = 0; i < count; i++) {
      int x = 0, y = 0;
      for(int j = 0; j < count; j++) {
        x += range[i][j];
        y += range[j][i];
      }

      max = Integer.max(max, x);
      max = Integer.max(max, y);



      diagonal01 += range[i][i];
      diagonal02 += range[i][count - i - 1];
      max = Integer.max(max, diagonal01);
      max = Integer.max(max, diagonal02);
    }

    return max;
  }

  public int lectureSolution(int [] range) {
    // 내가 푼 내용이 강의와 동일하게 진행 됨


    return 0;
  }

  public static void main(String[] args) {
    Problem09 problem = new Problem09();
    Scanner kb = new Scanner(System.in);

    int count = kb.nextInt();
    int[][] numberArray = new int[count][count];

    for(int i = 0; i < count; i++) {
      for(int j = 0; j < count; j++) {
        numberArray[i][j] = kb.nextInt();
      }
    }

    System.out.println(problem.solution(count, numberArray));
  }
}
