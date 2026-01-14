package _2_test_260114.ex;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // 스캐너 도구 이용
        Scanner scanner = new Scanner(System.in);

        // 실습 1: 정수 5개를 입력받고 역순 출력
        // 배열 생성 (5칸)
        int[] arr = new int[5];
        System.out.println("숫자를 5개 입력해주세요: ");
        // 스캐너를 이용해서 입력받은 정수 배열에 담기, 반복문 활용
        // arr[0] = scanner.nextInt();
        // arr[1] = scanner.nextInt();
        // arr[2] = scanner.nextInt();
        // arr[3] = scanner.nextInt();
        // arr[4] = scanner.nextInt();

        // 스캐너로 입력받아 배열에 담기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        // 배열에서 꺼내서 출력
        // System.out.println("배열에서 요소 꺼내기 : " + arr[0]);
        // System.out.println("배열에서 요소 꺼내기 : " + arr[1]);
        // System.out.println("배열에서 요소 꺼내기 : " + arr[2]);
        // System.out.println("배열에서 요소 꺼내기 : " + arr[3]);
        // System.out.println("배열에서 요소 꺼내기 : " + arr[4]);

        // 3. 역순 출력 (4번 인덱스부터 0번까지)
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("역순 요소: " + arr[i]);
        }


        // 실습 2: 3x3 행렬 채우기 및 출력(2차원 배열)
        // 3x3 배열 생성
        int[][] grid = new int[3][3];
        int number = 1;

        // 값 대입 (이중 for문)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = number++; // 1부터 9까지 순차 증가
            }
        }

        // 출력 (향상된 for문 활용)
        System.out.println("3x3 배열 출력:");
        for (int[] row : grid) {      // 한 줄(행)을 통째로 꺼냄
            for (int val : row) {     // 그 줄 안의 숫자(열)를 하나씩 꺼냄
                System.out.print(val + " ");
            }
            System.out.println();     // 한 행이 끝나면 줄바꿈
        }


        // 실습 3: 가장 긴 문자열 찾기(매서드 활용)
        // 메서드 호출 부분
        String[] array = {"apple", "banana", "kiwi"};
        String result = getLongest(array); // 메서드에 배열을 던져주고 결과를 받음
        System.out.println("가장 긴 문자열은? " + result);
    }

    // 메서드 정의 부분
    public static String getLongest(String[] words) {
        String longest = ""; // 가장 긴 단어를 보관할 임시 저장소

        for (String word : words) {
            // 현재 단어의 길이가 저장된 단어보다 길면 교체
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest; // 최종 1등을 반환
    }
}