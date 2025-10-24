package com.study.algorithm.algorithm.inflearn.section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem06 {
  public int solution(int peopleCount, int excludeNumber) {
    Queue<Integer> people = new LinkedList<>();

    for(int i = 1; i <= peopleCount; i++) {
      people.add(i);
    }

    while (people.size() > 1) {
      for (int i = 1; i < excludeNumber; i++) {
        people.add(people.poll());
      }
      people.poll();
    }
    return people.peek();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int peopleCount = sc.nextInt();
    int excludeNumber = sc.nextInt();

    Problem06 problem06 = new Problem06();
    System.out.println(problem06.solution(peopleCount, excludeNumber));

  }
}
