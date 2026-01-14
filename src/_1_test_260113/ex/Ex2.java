package _1_test_260113.ex;

import java.util.Scanner; // 스캐너 소환!

public class Ex2 {
    static void main(String[] args) {
        // 실습 1: 저녁 메뉴
        // 스케너 도구 사용(1~3번 전체 적용)
        Scanner scanner = new Scanner(System.in);

        System.out.println("오늘 저녁 먹고 싶은 메뉴?");
        // 스캐너로 가져오기
        String dinnerMenu = scanner.nextLine();

        System.out.print("어디서 먹을까요? ");
        String dinnerLoc = scanner.nextLine();

        System.out.print("저녁 가격은 얼마 예상하나요?");
        int dinnerPri = scanner.nextInt();

        System.out.println("오늘은 ["+ dinnerMenu +"][" + dinnerLoc +"][" + dinnerPri + "] 원입니다." );


        // 실습 2: 두 수의 합과 평균

        System.out.print("정수1 입력: ");
        int x = scanner.nextInt(); // 첫 번째 숫자 입력

        System.out.print("정수2 입력: ");
        int y = scanner.nextInt(); // 두 번째 숫자 입력

        System.out.println("합 : " + (x+y));
        System.out.println("평균 : " + (x+y) / 2);


        // 실습 3: 성별 입력
        System.out.println("성별(M/F) :");

        // 스캐너 이용해서 가져오기
       // next() 한단어를 가져오기 : car
      // charAt(0) : c
        char gender = scanner.next().charAt(0);

        System.out.println("입력한 성별 : " + gender);
    }
}
