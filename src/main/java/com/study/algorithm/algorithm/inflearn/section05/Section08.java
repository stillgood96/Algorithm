package com.study.algorithm.algorithm.inflearn.section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Section08 {
  public int solution(int n, int m, int[] riskArray) {
    Queue<Integer> patientQueue = new LinkedList<>();
    for(int i = 0; i < n; i++) {
      patientQueue.offer(i);
    }

    int order = 1;
    while(!patientQueue.isEmpty()) {
      int patient = patientQueue.poll();
      int patientRisk = riskArray[patient];

      boolean isOk = true;
      for(int i = 0; i < riskArray.length; i++) {
        if(patientRisk < riskArray[i]) {
          patientQueue.offer(patient);
          isOk = false;
          break;
        }
      }

      if(isOk) {
        if(patient == m) {
          return order;
        }else {
          riskArray[patient] = 0;
        }
        order++;
      }
    }

    return 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int [] riskArray = new int[n];
    for(int i = 0; i < n; i++) {
      riskArray[i] = sc.nextInt();
    }

    Section08 test = new Section08();
    System.out.println(test.solution(n, m, riskArray));
  }
}
