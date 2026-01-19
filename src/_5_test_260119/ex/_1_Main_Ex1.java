package _5_test_260119.ex;

public class _1_Main_Ex1 {
    static void main(String[] args) {
        _1_B_Ex1 b = new _1_B_Ex1(); // 자식 객체를 생성하면 부모 부터 순서대로 출력됨

        // 업캐스팅
        // [부모 타입] [참조형 변수 : p1] = new [자식 타입] ();
        _1_A_Ex1 p1 = new _1_B_Ex1();
        p1.show();
        // 부모 클래스 타입으로 객체의 show 메서드 호출 시, 자식 클래스의 메서드로 호출: 가상 메서드 호출

        // 다운 캐스팅
        // if( p1 instanceof 자식타입)
        // { [자식 타입] [참조형 변수 : c1] = (자식타입) p1   }
        if(p1 instanceof _1_B_Ex1 ) {
            _1_B_Ex1 c1 = (_1_B_Ex1)p1;
            c1.show(); // 다운 캐스팅 후 기능 호출
        }
    }
}
