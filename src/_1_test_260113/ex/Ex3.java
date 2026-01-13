package _1_test_260113.ex;

import java.util.Scanner;

public class Ex3 {
    static void main(String[] args) {
        // 스캐너 도구 사용
        Scanner scanner = new Scanner(System.in);

        // 실습 1 성인 여부 판별 (비교 연산자)
        System.out.print("나이 입력: ");
        int age = scanner.nextInt();

        // 19세 이상인지 비교 (결과는 true or false)
        boolean isAdult = (age >= 19);

        System.out.println("성인입니까? " + isAdult);


        // 실습 2 합격/불합격 판별 (삼항 연산자)
        System.out.print("점수 입력: ");
        int score = scanner.nextInt();

        // (조건식) ? "참일 때" : "거짓일 때"
        String result = (score >= 60) ? "합격" : "불합격";

        System.out.println(result + " 입니다.");

        scanner.close();
    }
}
