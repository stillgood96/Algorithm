package com.study.algorithm.algorithm.inflearn.section03;

import java.util.Scanner;

public class Problem06 {

  public void mySolution(int count01, int input02, int[] inputArray01) {

    int result = 0;
    int changeCount = 0;
    int changedResult = 0;
    for(int i = 0; i < count01; i++) {
      if(inputArray01[i] == 1) {
        result++;
      }else if (inputArray01[i] == 0 && changeCount < input02) {
        changeCount++;
        result++;
        changedResult = result;
      } else if(inputArray01[i] == 0 && changeCount > input02) {
        changeCount--;
        result -= changedResult;
        changedResult = 0;
        result++;
      }
    }

    System.out.println(result);
  }

  public void lectureSolution(int count01, int input02, int[] inputArray01) {
    //smae mysolution

    int answer = 0;
    int cnt = 0;
    int lt = 0;
    for(int rt = 0; rt < count01; rt++) {
      if(inputArray01[rt] == 0) {
        cnt++;
      }
      while(cnt > input02) {
       if(inputArray01[lt] == 0) cnt--;
       lt++;
      }
      answer = Math.max(answer, rt - lt + 1);
    }
    System.out.println(answer);
  }


  public static void main(String[] args) {
    Problem06 problem01 = new Problem06();
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
