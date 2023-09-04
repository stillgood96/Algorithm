package com.study.algorithm.algorithm.baekjoon.chapter1;

import java.util.Scanner;

public class problem10_2588 {


    /**
     *
     * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
     * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
     *
     * @input
     * 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
     *
     *
     * @Output
     * 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
     */

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int first = Integer.parseInt(sc.nextLine());
        String second = sc.nextLine();

        for(int i = 0; i < second.length(); i++) {

            int digits = Integer.parseInt(String.valueOf(second.charAt(second.length() - i - 1)));
            System.out.println(first * digits);

        }


        System.out.println(first * Integer.parseInt(second));

    }
}
