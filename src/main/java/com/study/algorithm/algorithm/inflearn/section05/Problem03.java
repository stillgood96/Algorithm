package com.study.algorithm.algorithm.inflearn.section05;

import java.util.Scanner;
import java.util.Stack;

public class Problem03 {
  public int lectureSolution(int size, int [][] dolls, int[] moves) {
    // same as the my solution
    return 0;
  }

  public int solution(int size, int [][] dolls, int[] moves) {
    Stack<Integer> basket = new Stack<>();
    int answer = 0;
    for(int i = 0; i < moves.length; i++) {
      int basketPeek = !basket.isEmpty() ? basket.peek(): -1;

      int line = moves[i] - 1;
      for(int j = 0; j < dolls[line].length; j++) {
        int removeTarget = dolls[j][line];
        if(removeTarget != 0 && basketPeek != removeTarget) {
          basket.push(removeTarget);
          dolls[j][line] = 0;
          break;
        }else if(basketPeek == removeTarget) {
          dolls[j][line] = 0;
          basket.pop();
          answer += 2;
          break;
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();
    int[][] dolls = new int[size][size];

    for(int i = 0; i < size; i++) {
      for(int j = 0; j < size; j++) {
        dolls[i][j] = sc.nextInt();
      }
    }

    int movesCount = sc.nextInt();
    int [] moves = new int[movesCount];
    for(int i = 0; i < movesCount; i++) {
      moves[i] = sc.nextInt();
    }

    Problem03 problem03 = new Problem03();
    System.out.println(problem03.solution(size, dolls, moves));
  }
}
