package _4_test_260116;

public class _5_Child_Ex extends _5_Parent_Ex {
    // 아무런 변수 없음
    // 메서드도 본인 것 없음, 부모 것을 재사용 중
    @Override // 재정의, 부모의 기능을 변경해서 사용했다고 알려주는 어노테이션
    public void hello() {
        System.out.println("순서1, 자식 hello() 호출");
        // 부모 메서드 사용
        System.out.println("순서2,  부모 super.hello() 호출 전");
        super.hello();
        System.out.println("순서5,  부모 super.hello() 호출 완료");
        System.out.println("순서6,  자식 hello() 내용 호출");
        System.out.println("안녕, 자식입니다.");
        System.out.println("순서7,  자식 hello() 내용 호출 완료");
    }
}
