package com.study.algorithm.algorithm.inflearn.section02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem03 {

  public ArrayList<String> solution(int count, int[] input01, int[] input02) {

    ArrayList<String> result = new ArrayList<>();
    for(int i = 0; i < count; i++) {
      if((input01[i] - input02[i]) == 1 || (input01[i] - input02[i]) == -2) {
        result.add("A");
      }else if((input02[i] - input01[i]) == 1 || (input02[i] - input01[i]) == -2) {
        result.add("B");
      }else if(input01[i] == input02[i]){
        result.add("D");
      }
    }

    return result;
  }

  // 1: 가위 2: 바위 3: 보
  public ArrayList<String> lectureSolution(int count, int [] input01, int [] input02) {
    ArrayList<String> result = new ArrayList<>();

    for(int i = 0; i < count; i++) {
      if(input01[i] == input02[i]) {
        result.add("D");
      }else if(input01[i] == 1 && input02[i] == 3) {
        result.add("A");
      }else if(input01[i] == 2 && input02[i] == 1) {
        result.add("A");
      }else if(input01[i] == 3 && input02[i] == 2) {
        result.add("A");
      }else {
        result.add("B");
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Problem03 problem = new Problem03();
    Scanner kb = new Scanner(System.in);
    int count = kb.nextInt();

    int [] inputArr01 = new int [count];
    int [] inputArr02 = new int [count];
    for(int i = 0; i < count; i++) {
      inputArr01[i] = kb.nextInt();
    }
    for(int i = 0; i < count; i++) {
      inputArr02[i] = kb.nextInt();
    }

    for(String s: problem.solution(count, inputArr01, inputArr02)) {
      System.out.println(s);
    }
  }
}
