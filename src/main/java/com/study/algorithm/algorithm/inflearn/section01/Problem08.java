package com.study.algorithm.algorithm.inflearn.section01;

import java.util.Scanner;

public class Problem08 {
  public String solution(String str) {
    String answer = "NO";
    String replacedSymbol = str.replaceAll("[^A-Za-z]", "").toUpperCase();
    String reversedString = new StringBuilder(replacedSymbol).reverse().toString();
    if(replacedSymbol.equals(reversedString)) {
      answer = "YES";
    }
    return answer;
  }

  public static void main(String[] args) {
    Problem08 problem = new Problem08();
    Scanner kb = new Scanner(System.in);
    String next = kb.nextLine();
    System.out.println(problem.solution(next));
  }
}
