package _5_test_260119.ex;

public abstract class _4_MemberBase_Ex4 {
    protected String name;
    protected String email;
    protected int age;
    protected String password; // 4번 실습: 패스워드 추가

    public _4_MemberBase_Ex4(String name, String email, int age, String password) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
    }
    // 로그인 비교를 위해 필요한 것들
    public String getEmail() {return email;}
    public String getPassword() {return password;}

    public abstract void showInfo();
}
