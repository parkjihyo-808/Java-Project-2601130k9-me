package _6_test_260120;

public abstract class _1_MemberBase_Ex1 {
    protected String name;
    protected String email;
    protected int age;
    protected String password; // 4번 실습: 패스워드 추가

    public _1_MemberBase_Ex1(String name, String email, int age, String password) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
    }

    // Joinable 인터페이스의 메서드 재정의
    public abstract void join();

    public abstract void showInfo(); // 정보 출력용 추상 메서드

    // 로그인 비교를 위해 필요한 것들
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    // 260120_실습4_풀이_업그레이드_임시저장파일_추가, 순서2-1
    // 생성시, 우클릭 -> 생성 -> Getter -> 각각, 하나씩, name, age 선택.
    public String getName() {
        return name;
    }

    // 260120_실습4_풀이_업그레이드_임시저장파일_추가, 순서2-2
    public int getAge() {
        return age;
    }
}
