package com.study.algorithm.algorithm.inflearn.section04;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem05 {

  public int lectureSolution(int [] arr, int n, int k) {
    int answer = -1;
    TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

    for(int i = 0; i < arr.length; i++) {
      for(int j = i + 1; j < arr.length; j++) {
        for(int l = j +1; l < arr.length; l++) {
          treeSet.add(arr[i] + arr[j] + arr[l]);
        }
      }
    }

    int count = 0;
    for (Integer sum : treeSet) {
      count++;
      if(count == k) {
        answer = sum;
        break;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int [] arr = new int[n];

    for(int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }


    Problem05 problem05 = new Problem05();
    System.out.println(problem05.lectureSolution(arr, n , k));
  }
}
