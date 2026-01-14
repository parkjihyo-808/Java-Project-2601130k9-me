package _2_test_260114.ex;

import java.util.Scanner;

public class Ex4 {
    static void main(String[] args) {
        // 스캐너 도구 이용
        Scanner scanner = new Scanner(System.in);

        // 실습 1: 1차원 배열 & 누적 연산의 합계와 평균 구하기
        int[] nums = new int[5];
        int sum = 0;

        System.out.println("정수 5개를 입력하세요:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
            sum += nums[i]; // 입력받음과 동시에 합계에 누적
        }

        double avg = (double) sum / nums.length; // 소수점까지 구하기 위해 형변환

        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
        scanner.close();


        // 실습 2: 2차원 배열 & 조건문 대각선 줄 긋기
        int[][] matrix = new int[4][4];

        // 값 저장하기
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    matrix[i][j] = 1; // 대각선 위치
                } else {
                    matrix[i][j] = 0; // 그 외 위치
                }
            }
        }

        // 출력하기
        System.out.println("4x4 대각선 배열:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println(); // 한 행이 끝나면 줄바꿈
        }


        // 실습 3: 메서드 & 최대값 찾기
        // 테스트용 샘플 배열
        int[] numbers = {100, 200, 300, 50, 450};

        // 메서드 호출
        int max = getMaxValue(numbers);

        System.out.println("배열 중 가장 큰 수: " + max);
    }

    // 최대값을 찾아 반환하는 메서드 (main 바깥에 작성)
    public static int getMaxValue(int[] arr) {
        // 1. 첫 번째 값을 기준(최대값)으로 일단 설정
        int maxVal = arr[0];

        // 2. 배열을 돌며 더 큰 숫자가 있는지 확인
        for (int num : arr) {
            if (num > maxVal) {
                maxVal = num; // 더 큰 숫자를 발견하면 기준값 교체
            }
        }

        // 3. 최종 결과 반환
        return maxVal;
    }
}
