package com.study.algorithm.algorithm.inflearn.section04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Problem03 {

  public String solution(int n, int k, String[] amount) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < amount.length; i++) {
      boolean isLast = false;
      HashSet<String> result = new HashSet<>();
      for(int j = 0; j < k; j++) {
        if(i + j < amount.length) {
          result.add(amount[i + j]);
        }else {
          isLast = true;
          break;
        }
      }

      if(!isLast) {
        sb.append(result.size() + " ");
      }
    }

    return sb.toString();
  }

  public String lectureSolution(int k, String[] amount) {
    StringBuilder sb = new StringBuilder();
    HashMap<String, Integer> amountMap = new HashMap<>();
    for(int i = 0; i < k; i++) {
      amountMap.put(amount[i], amountMap.getOrDefault(amount[i], 0) + 1);
    }
    sb.append(amountMap.size() + " ");


    for(int i = k; i < amount.length; i++) {
      String left = amount[i - k];
      amountMap.put(left, amountMap.get(left) -1);
      if(amountMap.get(left) == 0) {
        amountMap.remove(left);
      }

      String right = amount[i];
      amountMap.put(right, amountMap.getOrDefault(right, 0) + 1);
      sb.append(amountMap.size() + " ");
    }


    return sb.toString();
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    String[] amount = new String[n];
    for(int i = 0; i < n; i++) {
      amount[i] = sc.next();
    }

    Problem03 problem03 = new Problem03();
    //System.out.println(problem03.solution(n, k, amount));
    System.out.println(problem03.lectureSolution(k, amount));
  }
}
