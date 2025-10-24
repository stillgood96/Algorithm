package com.study.algorithm.algorithm.inflearn.section05;

import java.util.Scanner;
import java.util.Stack;

public class Problem02 {

  public String solution(String target) {
    StringBuilder sb = new StringBuilder();

    for (char c : target.toCharArray()) {
      if(c == ')') {
        char peek = sb.charAt(sb.length() -1);
        while(peek != '(') {
          sb.deleteCharAt(sb.length() -1);
          peek = sb.charAt(sb.length() -1);
        }

        if(peek == '(') {
          sb.deleteCharAt(sb.length() -1);
        }
      }else {
        sb.append(c);
      }
    }


    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Problem02 problem02 = new Problem02();

    System.out.println(problem02.solution(sc.nextLine()));
  }
}
