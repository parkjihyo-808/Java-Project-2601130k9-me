package _3_test_260115.ex;

public class StarCoffeeMain {
    static void main(String[] args) {
        // 1. 매개변수 1개 생성자 호출 (메뉴만 선택)
        StarCoffeeMenu order1 = new StarCoffeeMenu("아메리카노");

        // 2. 매개변수 2개 생성자 호출 (메뉴 + 사이즈 선택)
        StarCoffeeMenu order2 = new StarCoffeeMenu("카페 라뗴", "Grande");

        // 3. 매개변수 3개 생성자 호출 (메뉴 + 사이즈 + 핫 여부 선택)
        StarCoffeeMenu order3 = new StarCoffeeMenu("플랫 화이트", "Venti", false);

        // 각각의 주문 내역서 출력
        order1.showMenu();
        order2.showMenu();
        order3.showMenu();
    }
}
