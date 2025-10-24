package com.study.algorithm.algorithm.inflearn.section01;

import java.util.Scanner;

public class Problem03 {

  public String solution(String str) {
    /*
    String answer = "";
    int maxLength = Integer.MIN_VALUE;
    for(String s : str.split(" ")) {
      if(s.length() > maxLength) {
        answer = s;
        maxLength = s.length();
      }
    }

     */

    // Index Up & substring
    String answer2 = "";
    int pos;
    int maxLength2 = Integer.MIN_VALUE;
    while((pos = str.indexOf(" ")) != -1) {
      String temp = str.substring(0, pos);
      if(temp.length() > maxLength2) {
        answer2 = temp;
        maxLength2 = temp.length();
      }
      str = str.substring(pos + 1);
    }

    if(str.length() > maxLength2) {
      answer2 = str;
    }

    return answer2;
  }

  public static void main(String[] args) {
    Problem03 problem = new Problem03();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    System.out.println(problem.solution(str));

  }
}
