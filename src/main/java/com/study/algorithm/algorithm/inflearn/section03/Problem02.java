package com.study.algorithm.algorithm.inflearn.section03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem02 {

  // 두개의 배열을 오름차순 정렬을 우선적으로 진행해야한다.


  public void lectureSolution(int count01, int count02,
                         int [] array01, int [] array02) {

    ArrayList<Integer> answer = new ArrayList<>();
    Arrays.sort(array01);
    Arrays.sort(array02);

    int p1 = 0, p2 = 0;
    while(p1 < count01 && p2 < count02) {
      if(array01[p1] == array02[p2]) {
        answer.add(array01[p1]);
        p1++;
        p2++;
      }else if(array01[p1] < array02[p2]) {
        p1++;
      }else {
        p2++;
      }
    }

    answer.forEach(item -> System.out.printf(item + " "));
  }

  public static void main(String[] args) {
    Problem02 problem01 = new Problem02();
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
    problem01.lectureSolution(input01, input02, inputArray01, inputArray02);
  }
}
