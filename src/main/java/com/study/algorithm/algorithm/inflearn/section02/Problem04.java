package com.study.algorithm.algorithm.inflearn.section02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem04 {

  public String solution(int count) {
    StringBuilder sb = new StringBuilder();

    int before = 0;
    int next = 0;
    for(int i = 1; i <= count; i++) {
      if(i == 1) {
        before = i;
        next += i;
        sb.append(i + " ");
      }else {
        sb.append(next + " ");
        int temp = next;
        next += before;
        before = temp;
      }
    }
    return sb.toString().substring(0,sb.toString().length()-1);
  }

  public int [] lectureSolution(int count) {
    int [] result = new int [count];
    result[0] = 1;
    result[1] = 1;
    for(int i = 2; i < count; i++) {
      result[i] = result[i - 2] + result[i-1];
    }

    return result;
  }

  public void lectureSolution02(int count) {
    int a = 1;
    int b = 1;
    int c = 0;

    System.out.printf(a + " " + b);
    for(int i = 2; i < count; i++) {
      c = a + b;
      System.out.printf(" " + c);
      a = b;
      b = c;
    }
  }

  public static void main(String[] args) {
    Problem04 problem = new Problem04();
    Scanner kb = new Scanner(System.in);
    int count = kb.nextInt();

    //System.out.println(problem.solution(count));
    /*
    for(int i : problem.lectureSolution(count)) {
      System.out.print(i + " ");
    }
     */
    problem.lectureSolution02(count);
  }
}
