package _5_test_260119.ex;

public interface _2_Main_Ex2 {
    static void main(String[] args) {
        // 1) Animal 타입 배열 생성 (3개의 공간)
        _2_Animal_Ex2[] aniList = new _2_Animal_Ex2[3];

        // 2) 부모 타입 배열에 자식 객체들을 담기 (업캐스팅 발생)
        aniList[0] = new _2_Dog_Ex2();
        aniList[1] = new _2_Cat_Ex2();
        aniList[2] = new _2_Animal_Ex2();

        // 3) 반복문과 instanceof를 이용해 타입 확인 및 호출
        for(_2_Animal_Ex2 ani : aniList) {
            // 공통 기능 호출 (오버라이딩 덕분에 실제 객체의 move가 호출됨)
            ani.move();

            // 상세 타입 확인 후 전용 기능 호출
            if (ani instanceof _2_Dog_Ex2) {
                _2_Dog_Ex2 d = (_2_Dog_Ex2) ani; // 다운캐스팅
                d.bark();
            } else if (ani instanceof _2_Cat_Ex2) {
                _2_Cat_Ex2 c = (_2_Cat_Ex2) ani; // 다운캐스팅
                c.meow();
            } else {
                System.out.println("기본 동물 타입입니다.");
            }
        }
    }
}