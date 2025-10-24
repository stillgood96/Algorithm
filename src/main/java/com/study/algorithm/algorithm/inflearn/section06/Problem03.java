package com.study.algorithm.algorithm.inflearn.section06;

import java.util.Scanner;

public class Problem03 {

  public void solution(int [] array) {
    for(int i = 1; i < array.length; i++) {
      for(int j = i; j > 0; j--) {
        int temp = array[j];
        if(temp < array[j - 1]) {
         array[j] = array[j - 1];
         array[j - 1] = temp;
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
    Problem03 problem03 = new Problem03();
    problem03.solution(array);
  }
}


