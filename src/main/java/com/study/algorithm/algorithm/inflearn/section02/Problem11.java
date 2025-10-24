package com.study.algorithm.algorithm.inflearn.section02;

import java.util.Scanner;

public class Problem11 {

  public int solution(int count, int [][] range) {

    int[] result = new int[count];
    for(int i = 0; i < 5; i++) { //학년
      for(int j = 0; j < count; j++) {
        int currentStudent = range[j][i];
        for(int k = 0; k < count; k++) {
          if(!(j == k) && currentStudent == range[k][i]) {
            result[j] += 1;
            break;
          }
        }
      }
    }

    int maxStudent = 0;
    int maxCount = 0;
    for(int i = 0; i < count; i++) {
      if(result[i] > maxCount) {
        maxCount = result[i];
        maxStudent = i;
      }
    }

    return maxStudent + 1;
  }

  public int lectureSolution(int count, int [][] range) {
    int answer = 0; int max = Integer.MIN_VALUE;

    for(int i = 1; i <= count; i++) {
      int cnt = 0;
      for(int j = 1; j <= count; j++) {
        for(int k = 1; k <= 5; k++) {
          if(range[i][k] == range[j][k]) {
            cnt++;
            break;
          }
        }
      }

      if(cnt > max) {
        max = cnt;
        answer = i;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Problem11 problem = new Problem11();
    Scanner kb = new Scanner(System.in);
    int count = kb.nextInt();
    /*
    int[][] students = new int[count][5];
    for(int i = 0; i < count; i++) {
      for(int j = 0; j < 5; j++) {
        students[i][j] = kb.nextInt();
      }
    }
    System.out.println(problem.solution(count, students));
     */

    int [][] students = new int [count + 1][6];
    for(int i = 1; i <= count; i++) {
      for(int j = 1; j <= 5; j++) {
        students[i][j] = kb.nextInt();
      }
    }
    System.out.println(problem.lectureSolution(count, students));
  }
}
