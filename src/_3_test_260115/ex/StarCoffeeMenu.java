package _3_test_260115.ex;

public class StarCoffeeMenu {
    // 멤버 변수 (상태)
    String menuName;
    String size;
    boolean isHot;

    // 1) 생성자: 메뉴만 정할 때 (사이즈: Tall, 핫: true 기본값)
    public StarCoffeeMenu(String menuName) {
        this.menuName = menuName;
        this.size = "Tall";
        this.isHot = true;
    }

    // 2) 생성자: 메뉴, 사이즈 정할 때 (핫: true 기본값)
    public StarCoffeeMenu(String menuName, String size) {
        this.menuName = menuName;
        this.size = size;
        this.isHot = true;
    }

    // 3) 생성자: 메뉴, 사이즈, 핫 모두 정할 때
    public StarCoffeeMenu(String menuName, String size, boolean isHot) {
        this.menuName = menuName;
        this.size = size;
        this.isHot = isHot;
    }

    // 메서드 (기능): 주문 내역서 출력
    void showMenu() {
        System.out.println("----주문 내역서----");
        System.out.println("주문한 메뉴: " + menuName);
        System.out.println("사이즈: " + size);
        System.out.println("핫 여부: " + isHot);
    }
}
