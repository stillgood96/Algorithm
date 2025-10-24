package com.study.algorithm.algorithm.inflearn.section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem07 {

  public String solution(String a, String b) {
    Queue<Character> tempA = new LinkedList<>();
    for (char c : a.toCharArray()) {
      tempA.add(c);
    }

    for (char c : b.toCharArray()) {
      if(!tempA.isEmpty() &&c == tempA.peek()) {
        tempA.poll();
      }
    }
    if(tempA.size() == 0) {
      return "YES";
    }else {
      return "NO";
    }
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String a = sc.nextLine();
    String b = sc.nextLine();

    Problem07 problem07 = new Problem07();
    System.out.println(problem07.solution(a,b));
  }

}
