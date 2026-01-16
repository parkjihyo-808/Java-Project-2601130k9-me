package _3_test_260115.ex;

public class Book {
    // 멤버 변수 (상태)
    String name;
    int price;
    String writer;

    // 생성자 (매개변수가 있는 버전 - 책 만들 때 바로 정보 입력)
    public Book(String name, int price, String writer) {
        this.name = name;
        this.price = price;
        this.writer = writer;
    }

    // 메서드 (기능)
    void introduceBook() {
        System.out.println("제목: " + name + " | 가격: " + price + "원 | 저자: " + writer);
    }
}