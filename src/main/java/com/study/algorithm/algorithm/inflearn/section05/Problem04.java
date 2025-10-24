package com.study.algorithm.algorithm.inflearn.section05;

import java.util.Scanner;
import java.util.Stack;

public class Problem04 {

  public int lectureSolution(String sentence) {
    // smae..
    return 0;

  }

  public int solution(String sentence) {
    Stack<Integer> numberStack = new Stack<>();

    for (char c : sentence.toCharArray()) {
      int a, b;
      switch (c) {
        case '+':
          b = numberStack.pop();
          a = numberStack.pop();
          numberStack.push(a + b);
          break;
        case '-':
          b = numberStack.pop();
          a = numberStack.pop();
          numberStack.push(a - b);
          break;
        case '*':
          b = numberStack.pop();
          a = numberStack.pop();
          numberStack.push(a * b);
          break;
        case '/':
          b = numberStack.pop();
          a = numberStack.pop();
          numberStack.push(a / b);
          break;
        default:
          numberStack.add(c - 48);
          break;
      }
    }

    return numberStack.peek();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();
    Problem04 problem04 = new Problem04();
    System.out.println(problem04.solution(sentence));
  }
}
