package com.study.algorithm.algorithm.inflearn.section04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem02 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String first = sc.next();
    String second = sc.next();

    Map<Character, Integer> firstMap = new HashMap<>();
    Map<Character, Integer> secondMap = new HashMap<>();

    for(int i = 0; i < first.length(); i++ ) {
      firstMap.put(first.charAt(i), firstMap.getOrDefault(first.charAt(i),0) + 1);
      secondMap.put(second.charAt(i), secondMap.getOrDefault(second.charAt(i),0) + 1);
      break;
    }

    String result = "YES";
    for(int i = 0; i < first.length(); i++ ) {
      if(firstMap.get(first.charAt(i)) != secondMap.get(first.charAt(i))) {
        result = "NO";
      }
    }

    System.out.println(result);
  }
}
