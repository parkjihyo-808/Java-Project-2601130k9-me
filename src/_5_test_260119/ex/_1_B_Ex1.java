package _5_test_260119.ex;

public class _1_B_Ex1 extends _1_A_Ex1 {
    // 자식 클래스
    public _1_B_Ex1() {
        // super(); 가 숨겨져 있어서 A의 생성자가 먼저 실행됨
        System.out.println("2. 자식 클래스 B의 생성자 호출");
        // super() 주석을 해제 후 ctrl 누른 상태에서 클릭 시, 부모 클래스로 이동
    }

    @Override
    public void show() {
        System.out.println("자식 show 기능입니다.");
    }
}
