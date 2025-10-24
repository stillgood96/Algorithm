package com.study.algorithm.algorithm.inflearn.section06;

import java.util.Scanner;

public class Problem02 {

  public void solution(int [] array) {
    for(int i = 0; i < array.length; i++) {
      for(int j = 0; j < array.length - 1; j++) {
        int current = array[j];
        int next = array[j + 1];

        if(current > next) {
          array[j + 1] = current;
          array[j] = next;
        }
      }
    }
    for(int i = 0; i < array.length; i++) {
      System.out.printf(array[i] + " ");
    }
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int [] array = new int[length];
    for(int i = 0; i < length; i++) {
      array[i] = sc.nextInt();
    }
    Problem02 problem02 = new Problem02();
    problem02.solution(array);
  }
}


