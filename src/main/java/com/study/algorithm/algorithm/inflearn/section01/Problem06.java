package com.study.algorithm.algorithm.inflearn.section01;

import java.util.Scanner;

public class Problem06 {
  public String solution(String str) {

    String answer = "";
    for(int i = 0; i < str.length(); i++) {
      char indexOfString = str.charAt(i);
      if(str.indexOf(indexOfString) == i) {
        answer += indexOfString;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Problem06 problem = new Problem06();
    Scanner kb = new Scanner(System.in);
    String next = kb.next();
    System.out.println(problem.solution(next));
  }
}
