package com.study.algorithm.algorithm.inflearn.section05;

import java.util.Scanner;
import java.util.Stack;

public class Problem01 {

  public String solution(String target) {
    Stack<Character> compareTarget = new Stack<>();

    for (char c : target.toCharArray()) {
      if (c == '(') {
        compareTarget.push(c);
      } else {
        if(compareTarget.isEmpty()) {
          return "NO";
        }
        compareTarget.pop();
      }
    }

    if(!compareTarget.isEmpty()) {
      return "NO";
    }

    return "YES";
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Problem01 problem01 = new Problem01();
    System.out.println(problem01.solution(sc.nextLine()));
  }
}
