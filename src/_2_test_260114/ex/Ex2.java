package _2_test_260114.ex;

import java.util.Scanner;

public class Ex2 {
    static void main(String[] args) {

        // 실습 1 1~100까지의 합 출력
        int Sum = 0; // 합계 담을 바구니
        for (int i = 1; i <= 100; i++) {
            Sum += i; // Sum = Sum + i; 와 같음
        }
        System.out.println("1~100까지의 합: " + Sum);


        // 실습 2 양수만 입력받고 음수 입력 시 종료 (do-while)

        // 스캐너 소환!
        Scanner scanner = new Scanner(System.in);
        // 2. 입력 받기
        System.out.println("숫자를 입력하세요(숫자만),음수를 입력시 종료됩니다.: ");

        // 3. 스캐너 가져오기
        do {
            int number = scanner.nextInt();
            if(number <0) {
                System.out.println("음수를 입력시 종료합니다.");
                break;
            } else {
                System.out.println("입력한 값은: " + number);
                System.out.println("숫자를 입력하세요(숫자만),음수를 입력시 종료됩니다.: ");
            }
        } while (true);


        // 실습 3 1~50 사이 7의 배수 출력, 30 넘으면 종료
        for (int i = 1; i <= 50; i++) {
            if (i >30) {
                System.out.println("30초과시 종료합니다.");
                break; // for 문 탈출
            } else if(i % 7 != 0) { // 7의 배수가 아닌 경우, 다음 반복으로 진행.
                System.out.println("7의 배수가 아닙니다. " + i);
                continue;
            }
            // 30보다 작고, 7의 배수인경우.
            System.out.println("출력 값: " + i);
        }
    }
}
