package _4_test_260116.ex;

public class _3_Manager_Ex1 extends _3_Employee_Ex1 {
    // 부모 클래스 상속 받기, 생성자 구성
    public  _3_Manager_Ex1(String department) {
        // * 자식 생성자에서 부모 생성자를 반드시 먼저 호출
        super(department); } // 부모의 Employee(String department)를 호출

        // 메서드: 부모로부터 상속 받은 department 필드 출력
        public void printDept() {
            System.out.println("소속 부서: " + department); }
    }