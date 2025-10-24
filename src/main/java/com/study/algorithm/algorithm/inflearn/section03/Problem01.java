package com.study.algorithm.algorithm.inflearn.section03;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem01 {

  public void solution(int count01, int count02,
                         int [] array01, int [] array02) {

    ArrayList<Integer> answer = new ArrayList<>();
    int p1 = 0, p2 = 0;
    while(p1 < count01 && p2 < count02) {
      if(array01[p1] < array02[p2]) {
        answer.add(array01[p1++]);
      }else {
        answer.add(array02[p2++]);
      }
    }

    while(p1 < count01) {
      answer.add(array01[p1++]);
    }

    while(p2 < count02) {
      answer.add(array02[p2++]);
    }

    answer.forEach(id -> {
      System.out.printf(id + " ");
    });
  }

  public static void main(String[] args) {
    Problem01 problem01 = new Problem01();
    Scanner sc = new Scanner(System.in);
    int input01 = sc.nextInt();
    int [] inputArray01 = new int [input01];
    for(int i = 0; i < input01; i++) {
      inputArray01[i] = sc.nextInt();
    }
    int input02 = sc.nextInt();
    int [] inputArray02 = new int [input02];
    for(int i = 0; i < input02; i++) {
      inputArray02[i] = sc.nextInt();
    }

    problem01.solution(input01, input02, inputArray01, inputArray02);
  }
}
