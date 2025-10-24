package com.study.algorithm.algorithm.inflearn.section02;

import java.util.Scanner;

public class Problem12 {

  public int solution(int studentCount, int examCount, int [][] report) {
    int answer = 0;
    for(int i = 1; i <= studentCount; i++) {
      for(int j = 1; j <= studentCount; j++) {
        int cnt = 0;
        for(int k = 0; k < examCount; k++) {
          int pi = 0;
          int pj = 0;
          for(int s = 0; s < studentCount; s++) {
            if(report[k][s] == i) {
              pi = s;
            }else if(report[k][s] == j) {
              pj =s;
            }
          }

          if(pi < pj) {
            cnt++;
          }
        }

        if(cnt == examCount) {
          answer++;
        }
      }
    }

    return answer;
  }

  public int lectureSolution(int count, int [][] report) {

    return 0;
  }

  public static void main(String[] args) {
    Problem12 problem = new Problem12();
    Scanner kb = new Scanner(System.in);
    int studentCount = kb.nextInt();
    int examCount = kb.nextInt();
    int[][] report = new int[examCount][studentCount];
    for(int i = 0; i < examCount; i++) {
      for(int j = 0; j < studentCount; j++) {
        report[i][j] = kb.nextInt();
      }
    }
    System.out.println(problem.solution(studentCount, examCount, report));

  }
}
