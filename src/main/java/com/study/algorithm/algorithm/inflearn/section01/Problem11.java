package com.study.algorithm.algorithm.inflearn.section01;

import java.util.Scanner;

public class Problem11 {

  public String solution(String str) {
    char[] chars = str.toCharArray();

    StringBuilder sb = new StringBuilder();
    char beforeChar = chars[0];
    int count = 0;


    for(int i = 0; i < chars.length; i++) {
      if(beforeChar == chars[i]) {
        count++;
      }else {
        sb.append(beforeChar);
        if(count > 1) {
          sb.append(count);
        }
        beforeChar = chars[i];
        count = 1;
      }

      if(i == chars.length - 1) {
        sb.append(beforeChar);
        if(count > 1) {
          sb.append(count);
        }
      }
    }

    return sb.toString();
  }

  public String lectureSolution(String input) {
   StringBuilder sb = new StringBuilder();
   input += " ";
   int count = 1;
   for(int i = 0 ; i < input.length() - 1; i++) {
     if(input.charAt(i) == input.charAt(i + 1)) {
       count++;
     }else {
       sb.append(input.charAt(i));
       if(count > 1) {
         sb.append(count);
       }
       count = 1;
     }
   }
   return sb.toString();
  }

  public static void main(String[] args) {
    Problem11 problem = new Problem11();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    System.out.println(problem.lectureSolution(str));

  }
}
