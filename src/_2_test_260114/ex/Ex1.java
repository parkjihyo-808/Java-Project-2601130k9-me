package _2_test_260114.ex;

import java.util.Scanner;

public class Ex1 {
    static void main(String[] args) {
        // 스캐너 소환!
        Scanner scanner = new Scanner(System.in);


        // 실습 1: 나이 판별 (if문)
        System.out.println("나이를 입력하세요: ");

        // 스캐너 가져오기
        int age = scanner.nextInt();

        if (age >= 65) {
            System.out.println("노년층");
        }


        //실습 2: 메뉴 선택 (switch문)
        System.out.println("1. 김밥 / 2. 국밥 / 3. 칼국수 / 4. 국수 / 5. 떡볶이");
        System.out.print("원하는 메뉴 번호를 선택하세요: ");

        int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                System.out.println("김밥을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("국밥을 선택하셨습니다.");
                break;
            case 3:
                System.out.println("칼국수를 선택하셨습니다.");
                break;
            case 4:
                System.out.println("국수를 선택하셨습니다.");
                break;
            case 5:
                System.out.println("떡볶이를 선택하셨습니다.");
        }


        // 실습 3: 등급 출력 (if-else if-else)
        System.out.print("점수를 입력하세요(0~100): ");

        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("등급: A");
        } else if (score >= 80) {
            System.out.println("등급: B");
        } else if (score >= 70) {
            System.out.println("등급: C");
        } else if (score >= 60) {
            System.out.println("등급: D");
        } else {
            System.out.println("등급: F");
        }

        scanner.close();
    }
}
