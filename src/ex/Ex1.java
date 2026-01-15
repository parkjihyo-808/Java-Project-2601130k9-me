package ex;

import java.util.Scanner;

public class Ex1 {
    static void main(String[] args) {
        // 스캐너 도구 이용
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("---숫자 입력---");
            System.out.println("정수 입력: ");

            // 사용자가 문자를 입력하면 여기서 바로 catch로 이동
            int number = sc.nextInt();

            System.out.println("입력하신 숫자는 " + number + "입니다.");

        } catch (Exception e) {
            System.out.println("[오류 발생] 숫자가 아닌 값을 입력하셨습니다.");
            System.out.println("오류 메시지: " + e.getMessage());

        } finally {
            System.out.println("프로그램을 안전하게 종료합니다.");
            sc.close();
        }
    }
}
