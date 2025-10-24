package com.study.algorithm.algorithm.inflearn.section05;

import java.util.Scanner;
import java.util.Stack;

public class Problem05 {

  public int solution(String input) {

    Stack<Character> inputLine = new Stack<>();

    int answer = 0;
    char[] chars = input.toCharArray();
    for(int i = 0; i < chars.length; i++) {
      if(chars[i] == '(') {
        inputLine.push(chars[i]);
      }else {
        if(chars[i -1] == '(') {
          inputLine.pop();
          answer += inputLine.size();
        }else {
          inputLine.pop();
          answer += 1;
        }
      }
    }

    return answer;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Problem05 problem05 = new Problem05();

    System.out.println(problem05.solution(sc.nextLine()));
  }
}
