package _4_test_260116.ex;

public class _3_ManagerMain_Ex1 {
    static void main(String[] args) {
        // 샘플 Manager 2개
        _3_Manager_Ex1 m1 = new _3_Manager_Ex1("개발팀");
        _3_Manager_Ex1 m2 = new _3_Manager_Ex1("홍보팀");

        // 부서 출력 메서드
        m1.printDept();
        m2.printDept();
    }
}
