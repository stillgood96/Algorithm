package com.study.algorithm.algorithm.inflearn.section01;

import java.util.Scanner;

public class Problem01 {

  public int solution(String str, char c) {
    int answer = 0;
    str = str.toUpperCase();
    c = Character.toUpperCase(c);

    /*
    for(int i = 0; i < str.length(); i++) {
      char compare = str.charAt(i);
      if(compare == c ){
        answer++;
      }
    }
     */

    for (char test :str.toCharArray()) {
      if(test == c) answer++;
      System.out.println("TEST");
    }

    return answer;
  }

  public static void main(String[] args) {
    Problem01 problem01 = new Problem01();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    char c = kb.next().charAt(0);
    System.out.println(problem01.solution(str, c));

  }
}
