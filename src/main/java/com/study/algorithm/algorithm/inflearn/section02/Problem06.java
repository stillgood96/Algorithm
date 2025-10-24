package com.study.algorithm.algorithm.inflearn.section02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem06 {

  public String solution(String [] range) {
    StringBuilder sb = new StringBuilder();

    int max = 0;
    for(String temp : range) {
      int number = Integer.parseInt(temp);
      if(max < number) {
        max = number;
      }
    }

    int [] maxNumberArray = new int [max + 1];
    maxNumberArray[0] = 1;
    maxNumberArray[1] = 1;

    for(int i = 2; i < max; i++) {
      if(maxNumberArray[i] == 0) {
        for(int j = i + i; j < max; j += i) {
          maxNumberArray[j] = 1;
        }
      }
    }

    for(String temp : range) {
      String reverse = "";

      for(int i = temp.length() -1 ; i >= 0; i--) {
        reverse += temp.charAt(i);
      }

      int target = Integer.parseInt(reverse);
      if(maxNumberArray[target] == 0) {
        sb.append(target + " ");
      }
    }
    return sb.toString().substring(0, sb.toString().length() -1);
  }

  public ArrayList<Integer> lectureSolution(int [] range) {
    ArrayList<Integer> answer = new ArrayList<>();

    for(int i = 0; i < range.length; i++) {
      int temp = range[i];
      int res = 0;
      while(temp > 0) {
        int t = temp % 10;
        res = res * 10 + t;
        temp = temp / 10;
      }

      if(res != 1) {

        int isPrime = 1;
        for(int j = 2; j < res; j++) {
          if(res % j == 0) {
            isPrime = 0;
            break;
          }
        }

        if(isPrime == 1) {
          answer.add(res);
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Problem06 problem = new Problem06();
    Scanner kb = new Scanner(System.in);

    /*
    int count = kb.nextInt();
    kb.nextLine();

    String[] inputArray = new String[count];
    for(int i = 0; i < count; i ++) {
      inputArray[i] = kb.next();
    }
    System.out.println(problem.solution(inputArray));
     */

    int count = kb.nextInt();
    int[] numberArray = new int[count];
    for(int i = 0; i < count; i++) {
      numberArray[i] = kb.nextInt();
    }

    for(int i : problem.lectureSolution(numberArray)) {
      System.out.printf(i + " ");
    }
  }
}
