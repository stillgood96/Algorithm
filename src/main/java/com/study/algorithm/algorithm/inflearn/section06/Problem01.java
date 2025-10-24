package com.study.algorithm.algorithm.inflearn.section06;

import java.util.Scanner;

public class Problem01 {

  public void solution(int [] array) {
    for(int i = 0; i < array.length; i++) {
      int current = i;

      for(int j = i + 1; j < array.length; j++) {
        if(array[current] > array[j]) {
          current = j;
        }
      }

      int temp = array[i];
      array[i] = array[current];
      array[current] = temp;
    }

    for(int i = 0; i < array.length; i++){
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
    Problem01 problem01 = new Problem01();
    problem01.solution(array);
  }
}


