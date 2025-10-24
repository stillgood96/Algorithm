package com.study.algorithm.algorithm.inflearn.section01;

import java.util.Scanner;

public class Problem09 {
  public int solution(String str) {
    //return Integer.parseInt(str.replaceAll("[^0-9]", ""));
    char[] chars = str.toCharArray();
    int answer = 0;
    for(char c : chars) {
      if(c >= 48 && c <= 57) {
        answer = answer * 10 + (c-48);
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Problem09 problem = new Problem09();
    Scanner kb = new Scanner(System.in);
    String next = kb.next();
    System.out.println(problem.solution(next));
  }
}
