package com.study.algorithm.algorithm.inflearn.section02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem07 {

  public int solution(int [] range) {
    int score = 1;
    int cummulativeScore = 0;
    for(int i = 0; i < range.length;i ++) {
      if(range[i] == 1) {
        cummulativeScore += score;
        score++;
      }else {
        score = 1;
      }
    }

    return cummulativeScore;
  }

  public int lectureSolution(int [] range) {


    return 0;
  }

  public static void main(String[] args) {
    Problem07 problem = new Problem07();
    Scanner kb = new Scanner(System.in);


    int count = kb.nextInt();
    int[] numberArray = new int[count];
    for(int i = 0; i < count; i++) {
      numberArray[i] = kb.nextInt();
    }

    System.out.println(problem.solution(numberArray));
    //System.out.println(problem.lectureSolution(numberArray));

  }
}
