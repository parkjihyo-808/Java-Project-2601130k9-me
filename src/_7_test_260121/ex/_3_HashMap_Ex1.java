package _7_test_260121.ex;

import java.util.HashMap;

public class _3_HashMap_Ex1 {
    static void main(String[] args) {
        // 1. HashMap 생성 (메뉴이름: String, 가격: Integer)
        HashMap<String, Integer> menuMap = new HashMap<>();

        // 2. 메뉴, 가격 추가 (add 대신 put을 사용)
        menuMap.put("김밥", 3000);
        menuMap.put("라면", 4500);
        menuMap.put("떡볶이", 5000);

        // 3. "라면" 가격 출력 (get에 '열쇠'를 넣으면 '값'이 나옴)
        System.out.println("라면 가격: " + menuMap.get("라면") + "원");

        // 4. "김밥" 가격 수정 (기존에 있는 키에 다시 put 하면 덮어쓰기가 됨
        menuMap.put("김밥", 3500);
        System.out.println("수정된 김밥 가격: " + menuMap.get("김밥") + "원");

        // 5. "돈까스" 메뉴가 있는지 확인 (containsKey 사용)
        boolean hasDonkas = menuMap.containsKey("돈까스");
        System.out.println("돈까스 메뉴가 있나요? " + hasDonkas);

        // 6. 모든 메뉴와 가격 출력 (entrySet을 이용하면 한 번에 출력 가능)
        System.out.println("--- 메뉴판 ---");
        for (String menuName : menuMap.keySet()) {
            System.out.println("메뉴: " + menuName + ", 가격: " + menuMap.get(menuName) + "원");
        }
    }
}
