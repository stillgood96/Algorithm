package com.study.algorithm.algorithm.baekjoon.chapter1;

import java.util.Scanner;

public class problem5_1008 {

    /**
     * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
     *
     * @Input
     * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
     *
     * @Output
     * 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
     *
     * @imlsw96
     * 나는 여기서 Output에서의 내용이 이해가 잘 가지 않았는데 일단 절대오차 그리고 상대오차라는 개념이 없었다.
     * 찾아보니 절대오차는 참값에서 결과값을 뺀 수치의 절댓값을 이야기하고
     * 상대오차는 절대오차 값에 참 값을 나눈 값이라고 한다.
     *
     * 나누기는 소수점이 나온다.
     * 이때 소수점은 경우의 따라 무한할 수 있는데 이때 무한한 값을 표현하기위해서는 한계를 두어야하고 한계를 설정했을때 절대오차가 발생한다고 나는 이해했다.
     * 그리고 무한한 참값을 유한한 절대오차 값으로 나눴을때 나오는 수는 아주 작은 단위의 숫자일 것이다.
     *
     * 이를 여기서 유한한 한정값을 10^-9로 표현하지 않았나 싶다. 그래서 소수점 9자리까지만 노출되도록 설정을해주었다.
     * 추가로 10^-9는 수학적으로 아주 작은 단위의 숫자를 나타내는 지수표기법이라고 한다..!
     *
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();

        double divide = a / b;

        System.out.printf("%.9f\n", divide);

        sc.close();

    }

}
