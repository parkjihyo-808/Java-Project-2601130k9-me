package _7_test_260121.ex;

import java.util.ArrayList;

public class _1_ArrayList_Ex1 {
    static void main(String[] args) {
        // 1. ArrayList 생성
        ArrayList<String> studentlist = new ArrayList<>();

        // 2. 이름 추가(순서대로 0, 1, 2)
        studentlist.add("홍길동");
        studentlist.add("이순신");
        studentlist.add("강감찬");

        // 3. 리스트의 두 번째 사람("이순신")을 출력
        System.out.println("두 번째 사람 (\"이순신\"): " + studentlist.get(1));

        // 4. "강감찬"을 "을지문덕"으로 수정 (강감찬은 현재 2번 인덱스)
        studentlist.set(2, "을지문덕");
        System.out.println("수정 후 2번 인덱스: " + studentlist.get(2));

        // 5. "홍길동" 삭제 (이름으로 직접 삭제하거나 0번 인덱스로 삭제)
        studentlist.remove("홍길동");
        // 삭제 후에는 뒤에 있던 "이순신", "을지문덕"이 앞으로 한 칸씩 당겨짐

        // 6. 크기 출력 및 남은 사람들 출력
        System.out.println("리스트 크기: " + studentlist.size());

        System.out.println("--- 남은 명단 ---");
        for (String name : studentlist) {
            System.out.println("반복문으로 출력: " + name);
        }
    }
}
