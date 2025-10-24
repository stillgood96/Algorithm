package com.study.algorithm.algorithm.inflearn.section01;

import java.util.Scanner;

public class Problem02 {

  public String solution(String str) {
    String answer = "";
    for(char c : str.toCharArray()) {
      if(Character.isUpperCase(c)) {
        answer += Character.toLowerCase(c);
      }else {
        answer += Character.toUpperCase(c);
      }
    }

    // 아스키 코드 대문자는 65~90 소문자는 97 ~ 122
    String answer2 = "";
    for(char c : str.toCharArray()) {
      if(c >= 65 && c<= 90) {
        answer2 += (char) (c + 32);
      }else {
        answer2 += (char) (c - 32);
      }
    }

    return answer2;
  }

  public static void main(String[] args) {
    Problem02 problem = new Problem02();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.println(problem.solution(str));

  }
}
