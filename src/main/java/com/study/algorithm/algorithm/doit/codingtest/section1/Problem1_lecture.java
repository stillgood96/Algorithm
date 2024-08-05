package com.study.algorithm.algorithm.doit.codingtest.section1;

import java.util.Scanner;

public class Problem1_lecture {

  /**
   * @title
   * [배열과 리스트 실전 문제] 숫자의 합 구하기 (백준11720)
   *
   * @problem
   * N개의 숫자가 공백 없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.
   *
   * @input
   * 1번째 줄에 숫자의 개수 N(1 <= N <= 100), 2번째 줄에 숫자 N개가 공백 없이 주어진다.
   *
   * @output
   * 입력으로 주어진 숫자 N개의 합을 출력한다.
   *
   * @link
   * https://www.youtube.com/watch?v=0uhy851SDng&t=29s
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    String target = sc.next();

    char[] targetArray = target.toCharArray();
    int sum = 0;
    for(int i = 0; i < targetArray.length; i++) {
      sum += targetArray[i] - '0';
    }
    System.out.println(sum);
  }
}
