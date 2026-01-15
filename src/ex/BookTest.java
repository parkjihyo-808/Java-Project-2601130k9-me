package ex;

public class BookTest {
    static void main(String[] args) {
        // 책 3권 (객체 생성)
        Book b1 = new Book("지옥락", 5400, "가쿠 유우지");
        Book b2 = new Book("블리치", 4500, "쿠보 타이토");
        Book b3 = new Book("먼작귀", 20000, "나가노");

        // 소개 기능 호출
        System.out.println("--- 도서 목록 ---");
        b1.introduceBook();
        b2.introduceBook();
        b3.introduceBook();
    }
}
