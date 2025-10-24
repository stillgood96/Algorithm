package com.study.algorithm.algorithm.inflearn.section01;

import java.util.Scanner;

public class Problem12 {

  public String solution(String str) {
    StringBuilder sb = new StringBuilder();
    StringBuilder result = new StringBuilder();

    for(int i = 0; i < str.length() -1; i++) {
      if(str.charAt(i) == '#') {
        sb.append(1);
      }else {
        sb.append(0);
      }

      if((i + 1) % 7 == 0 ) {
        result.append(
            (char) Integer.parseInt(sb.toString(), 2)
        );

        sb = new StringBuilder();
      }
    }
    return result.toString();
  }

  public String lectureSolution(int count, String input) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i  < count; i ++) {
      String replaced = input.substring(0, 7).replace("#", "1").replace("*", "0");
      sb.append((char) Integer.parseInt(replaced, 2));
      input = input.substring(7);
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Problem12 problem = new Problem12();
    Scanner kb = new Scanner(System.in);
    int count = kb.nextInt();
    String encodeString = kb.next();
    System.out.println(problem.lectureSolution(count, encodeString));
  }
}
