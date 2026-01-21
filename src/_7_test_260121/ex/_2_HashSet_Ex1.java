package _7_test_260121.ex;

import java.util.HashSet; // [필수] HashSet을 쓰기 위해 불러오기

public class _2_HashSet_Ex1 {
    static void main(String[] args) {
        // 1. HashSet 생성
        HashSet<Integer> lottoSet = new HashSet<>();

        // 2. 숫자 추가 (중복된 숫자 5와 12가 있음)
        lottoSet.add(5);
        lottoSet.add(12);
        lottoSet.add(5);  // 중복, 들어가지 않음
        lottoSet.add(20);
        lottoSet.add(12); // 중복, 들어가지 않음
        lottoSet.add(7);

        // 3. 크기(개수) 출력 (5, 12, 20, 7 만 저장되어 4가 출력됨)
        System.out.println("저장 된 숫자: " + lottoSet.size());

        // 4. 숫자 20 삭제
        lottoSet.remove(20);
        System.out.println("숫자 `20`을 삭제함");

        // 5. 숫자 5가 포함되어 있는지 확인 (true/false)
        System.out.println("숫자 `5`가 세트 안에 포함되어 있는지? "+ lottoSet.contains(5));

        // 6. 전체 숫자 출력 (순서는 넣은 순서와 다를 수 O)
        System.out.println("--- 전체 출력 ---");
        for (int num : lottoSet) {
            System.out.println("반복문 이용 출력: " + num);
        }
    }
}
