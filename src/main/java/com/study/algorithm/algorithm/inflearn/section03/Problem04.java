package com.study.algorithm.algorithm.inflearn.section03;

import java.util.Scanner;

public class Problem04 {

  /**
   * 부분수열
   */
  public void mySolution(int count01, int count02,
                         int [] array01) {
    int result = 0;
    for(int i = 0; i < array01.length; i++) {
      int target = array01[i];
      if(target < count02) {
        for(int j = i + 1; j < array01.length; j++) {
          target += array01[j];
          if(target == count02) {
            result++;
            break;
          }else if( target > count02) {
            break;
          }
        }
      }else if(target == count02) {
        result++;
      }
    }

    System.out.println(result);
  }

  public void lectureSolution(int count01, int count02,
                         int [] array01) {
    int answer = 0, sum = 0, lt = 0;
    for(int rt = 0; rt < count01; rt++) {
      sum += array01[rt];
      if(sum == count02) {
        answer++;
      }
      while(sum >= count02) {
        sum -= array01[lt++];
        if(sum == count02) answer++;
      }
    }
    System.out.println(answer);
  }


  public static void main(String[] args) {
    Problem04 problem01 = new Problem04();
    Scanner sc = new Scanner(System.in);
    int input01 = sc.nextInt();
    int input02 = sc.nextInt();
    int [] inputArray01 = new int [input01];
    for(int i = 0; i < input01; i++) {
      inputArray01[i] = sc.nextInt();
    }

    //problem01.lectureSolution(input01, input02, inputArray01);
    problem01.mySolution(input01, input02, inputArray01);
  }
}
