package com.study.algorithm.algorithm.inflearn.section02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem01 {

  public String solution(int target, String input) {

    return "";
  }

  public ArrayList<Integer> lectureSolution(int count, int [] input) {
    ArrayList<Integer> result = new ArrayList<>();
    result.add(input[0]);
    for(int i = 1; i < input.length; i ++) {
      if(input[i] > input[i - 1]) {
        result.add(input[i]);
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Problem01 problem = new Problem01();
    Scanner kb = new Scanner(System.in);
    int count = kb.nextInt();

    int [] inputArr = new int [count];
    for(int i = 0; i < count; i++) {
      inputArr[i] = kb.nextInt();
    }
    for(int i : problem.lectureSolution(count, inputArr)) {
      System.out.print(i + " ");
    }
  }
}
