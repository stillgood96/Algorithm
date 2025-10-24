package com.study.algorithm.algorithm.inflearn.section06;

import java.util.Scanner;

public class Problem04 {

  /**
   * 💡 문제 설명
   * 이 프로그램은 LRU(Least Recently Used) 캐시 교체 알고리즘을 시뮬레이션하는 문제의 풀이입니다.
   *
   * 📥 입력
   * - 첫째 줄: 캐시의 크기 S (3 ≤ S ≤ 10) 와 작업의 개수 N (5 ≤ N ≤ 1,000)
   * - 둘째 줄: N개의 작업 번호가 순서대로 주어짐 (작업 번호는 1~100)
   *
   * ⚙️ 처리 규칙
   * - 캐시 메모리는 가장 최근에 사용된 작업을 앞쪽(index 0)에 저장함
   * - 새로운 작업이 들어올 때:
   *   1. 캐시에 이미 존재하면 해당 위치의 작업을 제거 후 맨 앞으로 이동
   *   2. 캐시에 없으면 맨 앞에 추가하고, 가장 오래된 작업(맨 뒤)은 삭제
   * - 즉, 오래 사용하지 않은 작업이 점점 뒤로 밀려나며,
   *   캐시가 가득 찼을 때는 맨 뒤의 작업이 제거됩니다.
   *
   * 📤 출력
   * - 모든 작업을 처리한 후 캐시의 상태를
   *   "가장 최근에 사용된 작업부터" 순서대로 출력합니다.
   *
   * 🧩 예시
   * 입력: 5 9
   *       1 2 3 2 6 2 3 5 7
   * 출력: 7 5 3 2 6
   */
  public void solution(int size,  int [] array) {
    int [] answer = new int [size];
    for(int i = 0; i < array.length; i++) {
      int targetIndex = find(answer, array[i]);
      if(targetIndex > 0) {
        remove(answer, size, targetIndex);
      }
      add(answer, array[i]);
    }

    for(int i = 0; i < answer.length; i++) {
      System.out.printf("%d ", answer[i]);
    }
  }

  public int find(int [] arr, int target) {
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public void remove(int [] arr, int size, int index) {
    for(int i = index; i < size -1; i++) {
      arr[i] = arr[i + 1];
    }
  }

  public void add(int[] arr, int target) {
    for(int i = arr.length -1; i > 0; i--) {
      arr[i] = arr[i-1];
    }
    arr[0] = target;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int tasks = sc.nextInt();
    int[] array = new int[tasks];
    for(int i = 0; i < tasks; i++) {
      array[i] = sc.nextInt();
    }

    Problem04 problem = new Problem04();
    problem.solution(size, array);
  }
}
