package com.study.algorithm.algorithm.inflearn.section01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Problem05 {

  // MySolution
  /**/
  public String solution(String str) {

    char[] strArray = str.toCharArray();
    int lt = 0;
    int rt = str.length() - 1;

    while(lt < rt) {
      //정규표현식
      /*
      if(!Pattern.matches("^[a-zA-Z]*$", String.valueOf(strArray[lt]))) {
        lt++;
      }else if(!Pattern.matches("^[a-zA-Z]*$", String.valueOf(strArray[rt]))) {
        rt--;
      }else {
        char temp = strArray[lt];
        strArray[lt] = strArray[rt];
        strArray[rt] = temp;
        lt++;
        rt--;
      }
       */

      //메서드 사용
      if(!Character.isAlphabetic(strArray[lt])) {
        lt++;
      }else if(!Character.isAlphabetic(strArray[rt])) {
        rt--;
      }else {
        char temp = strArray[lt];
        strArray[lt] = strArray[rt];
        strArray[rt] = temp;
        lt++;
        rt--;
      }
    }
    return String.valueOf(strArray);
  }



  /*
  public String solution() {
    return null;
  }

   */

  public static void main(String[] args) {
    Problem05 problem = new Problem05();
    Scanner kb = new Scanner(System.in);


    System.out.println(problem.solution(kb.next()));
  }
}
