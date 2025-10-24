package com.study.algorithm.algorithm.inflearn.section02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem02 {

  public int solution(int count, int[] input) {

    int maxValue = 0;
    int studentCount = 0;
    for(int i = 0; i < input.length; i++) {
      if(maxValue < input[i]) {
        studentCount++;
        maxValue = input[i];
      }
    }

    return studentCount;
  }

  public int lectureSolution(int count, int [] input) {

    return 0;
  }

  public static void main(String[] args) {
    Problem02 problem = new Problem02();
    Scanner kb = new Scanner(System.in);
    int count = kb.nextInt();

    int [] inputArr = new int [count];
    for(int i = 0; i < count; i++) {
      inputArr[i] = kb.nextInt();
    }
    System.out.println(problem.solution(count, inputArr));
  }
}
