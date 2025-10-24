package com.study.algorithm.algorithm.inflearn.section04;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem04 {


  public int lectureSolution(String message, String target) {
    int result = 0;

    Map<Character, Integer> messageMap = new HashMap<>();
    Map<Character, Integer> targetMap = new HashMap<>();

    for (char c : target.toCharArray()) {
      targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
    }

    for(int i = 0; i < target.length() - 1; i++) {
      messageMap.put(message.charAt(i), messageMap.getOrDefault(message.charAt(i), 0) + 1);
    }

    int left = 0;
    for(int right = target.length() -1; right < message.length(); right++) {
      messageMap.put(message.charAt(right), messageMap.getOrDefault(message.charAt(right), 0) + 1);
      if(messageMap.equals(targetMap)) {
        result++;
      }
      messageMap.put(message.charAt(left), messageMap.get(message.charAt(left)) -1);
      if(messageMap.get(message.charAt(left)) == 0) {
        messageMap.remove(message.charAt(left));
      }
      left++;
    }

    return result;
  }




  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String message = sc.next();
    String target = sc.next();
    Problem04 problem04 = new Problem04();
    System.out.println(problem04.lectureSolution(message, target));
  }
}
