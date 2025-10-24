package com.study.algorithm.algorithm.inflearn.section01;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem10 {
  public String solution(String str) {
    String[] splitedInput = str.split(" ");
    char compare00 = splitedInput[1].charAt(0);

    String answer = "";
    for(int i = 0 ; i < splitedInput[0].length(); i++) {
      char compare01 = splitedInput[0].charAt(i);

      ArrayList<Integer> arrayIntegerList = new ArrayList<>();
      if(compare01 == compare00) {
       answer += 0;
      }else {
        for(int j = 0; j < splitedInput[0].length(); j++) {
          char compare02 = splitedInput[0].charAt(j);
          if(compare02 == compare00) {
            if(i < j) {
              arrayIntegerList.add(j-i);
            }else {
              arrayIntegerList.add(i-j);
            }
          }
        }

        int min = arrayIntegerList.get(0);
        for (Integer integer : arrayIntegerList) {
          if(min > integer) {
            min = integer;
          }
        }

        answer += min;
      }
    }
    return String.join(" ", answer.split(""));
  }

  public String solution2(String target) {
    String[] targets = target.split(" ");

    char[] chars = targets[0].toCharArray();
    int [] lengthArray = new int[chars.length];

    int distance = 1000;
    for(int i = 0; i < chars.length; i++) {
      if(chars[i] == targets[1].charAt(0)) {
        distance = 0;
        lengthArray[i] = distance;
      }else {
        distance++;
        lengthArray[i] = distance;
      }
    }
    distance = 1000;
    for(int i = chars.length -1 ; i >= 0; i--) {
      if(chars[i] == targets[1].charAt(0)) {
        distance = 0;
        lengthArray[i] = distance;
      }else {
        distance++;
        lengthArray[i] = Math.min(lengthArray[i], distance);
      }
    }

    System.out.println(lengthArray);
    return null;
  }

  public static void main(String[] args) {
    Problem10 problem = new Problem10();
    Scanner kb = new Scanner(System.in);
    String next = kb.nextLine();
    System.out.println(problem.solution2(next));
  }
}
