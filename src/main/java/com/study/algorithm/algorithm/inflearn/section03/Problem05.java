package com.study.algorithm.algorithm.inflearn.section03;

import java.util.Scanner;

public class Problem05 {

  public void mySolution(int count01) {
    int sum = 0;
    int answer = 0;
    int max = count01 / 2 + 1;
    int [] array01 = new int[max];

    for(int i = 0; i < array01.length; i++) {
      array01[i] = i +1;
    }


    int lt = 0;
    for(int rt = 0; rt < max; rt++) {
      sum += array01[rt];

      if(sum == count01) {
        answer++;
      }
      while(sum >= count01) {
        sum -= array01[lt++];
        if(sum == count01) answer++;
      }
    }


    System.out.println(answer);
  }

  public void lectureSolution(int n) {
    //smae mysolution
    // 다음 강의에 수학적 요소를 이용해서 푸는 강의가 존재해서
    // 해당 영상의 풀이방법을 작성함
    // cnt == 연속된 자연수의 수
    // 코드에서는 연속된 자연수의 수는 2부터 진행되어야하니까 1을 미리 빼고 시작하는 0
    int answer = 0, cnt = 1;
    n--;
    while(n > 0) {
      cnt++;
      n = n - cnt;
      if(n % cnt == 0) answer++;
    }
  }


  public static void main(String[] args) {
    Problem05 problem01 = new Problem05();
    Scanner sc = new Scanner(System.in);
    int input01 = sc.nextInt();

    //problem01.lectureSolution(input01, input02, inputArray01);
    problem01.mySolution(input01);
  }
}
