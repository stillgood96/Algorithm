package com.study.algorithm.algorithm.baekjoon.chapter1;

import java.util.Scanner;

public class problem6_10869 {

    /**
     * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
     *
     * @Input
     * 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
     *
     * @Output
     * 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
     *
     * @imlsw96
     * chapter1에서 풀었던 내용을 한데 모아놓은 문제
     * 특이한점은 output에서의 나누기 부분은 소수점까지 노출하면 문제가 틀린다고 나오다는 것.
     *
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        int minus = a - b;
        int multiply = a * b;
        int divide =  a / b;
        int remainder = a % b;

        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(remainder);

        sc.close();

    }

}
