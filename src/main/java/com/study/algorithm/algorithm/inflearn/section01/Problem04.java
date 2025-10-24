package com.study.algorithm.algorithm.inflearn.section01;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem04 {
  public ArrayList<String> solution(String[] str) {
    ArrayList<String> answerList = new ArrayList<>();

    // StringBuilder 활용한 방식
    /*
    for(String test : str) {
      String temp = new StringBuilder(test).reverse().toString();
      answerList.add(temp);
    }
     */

    // 직접 Index에 접근하여 변경하도록 작업
    for(String x : str) {
      char[] chars = x.toCharArray();
      int lt = 0;
      int rt = x.length() - 1;

      while(lt < rt) {
        char temp = chars[lt];
        chars[lt] = chars[rt];
        chars[rt] = temp;
        lt++;
        rt--;
      }

      String addItem = String.valueOf(chars);
      answerList.add(addItem);
    }

    return answerList;
  }

  public static void main(String[] args) {
    Problem04 problem = new Problem04();
    Scanner kb = new Scanner(System.in);

    int n = kb.nextInt();
    String [] stringArray = new String [n];
    for(int i = 0; i < stringArray.length; i++) {
      stringArray[i] = kb.next();
    }

    for(String x : problem.solution(stringArray)) {
      System.out.println(x);
    }

  }
}
