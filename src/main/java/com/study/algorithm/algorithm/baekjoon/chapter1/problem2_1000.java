package com.study.algorithm.algorithm.baekjoon.chapter1;

import java.util.Scanner;

public class problem2_1000 {

    /**
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println(sum);

        sc.close();

    }

}
