package com.study.algorithm.algorithm.inflearn.section04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int voteCount = scanner.nextInt();
    scanner.nextLine();
    String target = scanner.nextLine();

    HashMap<String, Integer> votes = new HashMap<>();
    for(int i = 0; i < target.length(); i++) {
      String who = String.valueOf(target.charAt(i));
      votes.compute(who, (key, value) -> value == null ? 1 : value + 1);
    }

    String president = "";
    Integer score = Integer.MIN_VALUE;
    for (Map.Entry<String, Integer> candidate : votes.entrySet()) {
      if(candidate.getValue() > score) {
        president = candidate.getKey();
        score = candidate.getValue();
      }
    }

    System.out.println(president);
  }
}

