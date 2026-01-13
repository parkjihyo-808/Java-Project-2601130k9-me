package _1_test_260113;

import java.util.Scanner;

public class _5_Test_Operator_Ex {
    static void main(String[] args) {
        // 스캐너 도구 사용
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        System.out.println("정수 1 : ");
        //스캐너 받기
        int a = scanner.nextInt();

        // 입력받기
        System.out.println("정수 2 : ");
        //스캐너 받기
        int b = scanner.nextInt();
        System.out.println("몫(/) : " + (a/b));
        System.out.println("나머지(%) : " + (a%b));
    }
}
