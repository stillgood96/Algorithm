package com.study.algorithm.algorithm.inflearn.section02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem08 {

  public ArrayList<Integer> solution(int [] range) {
    ArrayList<Integer> answer = new ArrayList<>();

    for(int i = 0; i < range.length; i++) {
      int rank = 1;
      for(int j = 0; j < range.length; j++) {
        if(range[i] < range[j]) {
          rank ++;
        }
      }

      answer.add(rank);
    }

    return answer;
  }

  public int lectureSolution(int [] range) {
    // 내가 푼 내용이 강의와 동일하게 진행 됨


    return 0;
  }

  public static void main(String[] args) {
    Problem08 problem = new Problem08();
    Scanner kb = new Scanner(System.in);

    int count = kb.nextInt();
    int[] numberArray = new int[count];
    for(int i = 0; i < count; i++) {
      numberArray[i] = kb.nextInt();
    }

    for(int i : problem.solution(numberArray)) {
      System.out.printf(i + " ");
    }
  }
}
