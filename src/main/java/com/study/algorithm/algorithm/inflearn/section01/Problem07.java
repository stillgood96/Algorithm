package com.study.algorithm.algorithm.inflearn.section01;

import java.util.Scanner;

public class Problem07 {
  public String solution(String str) {
    String answer = "NO";

    /*
    str = str.toUpperCase();
    for(int i = 0 ; i < str.length()/2; i++) {
      if(str.charAt(i) !=  str.charAt(str.length() - i - 1)) {
        return answer = "NO";
      }
    }
     */

    String reverseStr = new StringBuilder(str).reverse().toString();
    if(str.equalsIgnoreCase(reverseStr)) answer = "YES";

    return answer;
  }

  public static void main(String[] args) {
    Problem07 problem = new Problem07();
    Scanner kb = new Scanner(System.in);
    String next = kb.next();
    System.out.println(problem.solution(next));
  }
}
