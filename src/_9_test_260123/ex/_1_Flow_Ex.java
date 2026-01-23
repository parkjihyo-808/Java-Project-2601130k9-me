package _9_test_260123.ex;

import javax.swing.*;
import java.awt.*;

public class _1_Flow_Ex {
    public static void main(String[] args) {
        // 컨테이너 생성
        JFrame frame = new JFrame("검색창");

        // 패널 생성 및 FlowLayout 왼쪽 정렬 설정
        // FlowLayout.LEFT를 인자로 주면 왼쪽부터 쌓임
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // 컴포넌트 준비 (라벨, 텍스트필드, 버튼)
        JLabel label = new JLabel("이름: ");
        JTextField textField = new JTextField(8);
        JButton searchBtn = new JButton("검색");
        frame.add(panel);

        // 패널에 순서대로 추가 (추가한 순서대로 왼쪽부터 배치됨)
        panel.add(label);
        panel.add(textField);
        panel.add(searchBtn);

        // 버튼 이벤트 리스너 추가 (람다식 활용)
        searchBtn.addActionListener(e -> {
            // JTextField에 입력된 내용을 가져오는 기능: getText()
            String inputName = textField.getText();

            System.out.println("----- 검색 시작 -----");
            System.out.println("입력된 이름: " + inputName);
            System.out.println("--------------------");
        });

        // 프레임에 패널 얹고 보이기
        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}