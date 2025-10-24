package com.study.algorithm.algorithm.inflearn.section02;

import java.util.Scanner;

public class Problem05 {

  public int solution(int range) {
    int count = 1;

    int [] forCheckPrimeNumber = new int [range + 1];

    for(int i = 2; i < range; i++) {
      if(forCheckPrimeNumber[i] == 0) {
        for(int j = i + i; j < forCheckPrimeNumber.length; j += i) {
          forCheckPrimeNumber[j] = 1;
        }
      }
    }

    for(int i = 3; i < range; i ++) {
      if(forCheckPrimeNumber[i] == 0) count ++;
    }

    return count;
  }

  public int lectureSolution(int range) {
    int [] check = new int [range + 1];
    int count = 0;
    for(int i = 2; i <= range; i++) {
      if(check[i] == 0) {
        count++;
        for(int j = i; j <= range; j += i) {
          check[j] = 1;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Problem05 problem = new Problem05();
    Scanner kb = new Scanner(System.in);
    int count = kb.nextInt();
    //System.out.println(problem.solution(count));
    System.out.println(problem.lectureSolution(count));
  }
}
