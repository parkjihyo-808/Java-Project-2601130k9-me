package _6_test_260120;

public class _1_NormalMember_Ex1 extends _1_MemberBase_Ex1 {
    public _1_NormalMember_Ex1(String name, String email, int age, String password) {
        super(name, email, age, password); // 부모 생성자에 비번까지 전달
    }
    // Joinable 인터페이스의 메서드를 재정의
    @Override
    public void join() {
        System.out.println(name + "님 회원가입 완료.");
    }

    // 추상 클래스의 추상 메서드를 반드시 구현
    @Override
    public void showInfo() {
        System.out.println("이름 : " +name);
        System.out.println("이메일 : " +email);
        System.out.println("나이 : " +age);
    }
}
