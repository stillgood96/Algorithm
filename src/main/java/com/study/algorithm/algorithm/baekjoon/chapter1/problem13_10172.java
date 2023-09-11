package com.study.algorithm.algorithm.baekjoon.chapter1;

import java.util.Scanner;

public class problem13_10172 {


  /**
   *
   * 아래 예제와 같이 개를 출력하시오.
   *
   * |\_/|
   * |q p|   /}
   * ( 0 )"""\
   * |"^"`    |
   * ||_/=\\__|
   *
   */
  public static void main(String[] args) {

    StringBuffer sb = new StringBuffer();


    sb.append("|\\_/|");
    sb.append("\n");
    sb.append("|q p|   /}");
    sb.append("\n");
    sb.append("( 0 )\"\"\"\\");
    sb.append("\n");
    sb.append("|\"^\"`    |");
    sb.append("\n");
    sb.append("||_/=\\\\__|\n");

    System.out.println(sb.toString());

  }
}
