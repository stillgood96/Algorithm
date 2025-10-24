package com.study.algorithm.algorithm.inflearn.section03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem03 {

  /**
   * 강의 내용과 방향성은 일치하다
   * 강의에서는 SlidingWindow로 표현하던데
   * 배열의 반복문 속 구하고자 하는 특정 연속일이 이상이라면
   * 현재 인덱스에서 연속일을 뺀 인덱스의 값을 amount에서 빼주는 것
   * 빼준 후 max와의 비교해서 연속일중 최댓 값을 구한다.
   * @param count01
   * @param count02
   * @param array01
   */
  public void mySolution(int count01, int count02,
                         int [] array01) {
    int max = 0;
    int amount = 0;
    for(int i = 0; i < array01.length; i++) {
      amount += array01[i];
      if(count02 <= i) {
        amount -= array01[i - count02];
      }

      max = Math.max(amount, max);
    }

    System.out.println(max);
  }

  public void lectureSolution(int count01, int count02,
                         int [] array01) {

    int answer, sum = 0;
    for(int i = 0; i < count02; i++) sum += array01[i];
    answer = sum;

    for(int i = count02; i < count01; i++) {
        sum += (array01[i] - array01[i-count02]);
        answer = Math.max(answer, sum);
    }
    System.out.println(answer);
  }

  public static void main(String[] args) {
    Problem03 problem01 = new Problem03();
    Scanner sc = new Scanner(System.in);
    int input01 = sc.nextInt();
    int input02 = sc.nextInt();
    int [] inputArray01 = new int [input01];
    for(int i = 0; i < input01; i++) {
      inputArray01[i] = sc.nextInt();
    }

    problem01.lectureSolution(input01, input02, inputArray01);
//    problem01.mySolution(input01, input02, inputArray01);
  }
}
