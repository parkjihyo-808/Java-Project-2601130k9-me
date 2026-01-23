package _9_test_260123.ex;

import javax.swing.*;
import java.awt.*;

public class _2_BorderLayout_Ex {
    static void main(String[] args) {
        // 컨테이너 생성
        JFrame frame = new JFrame("BorderLayout 구역 연습");

        // 패널 생성 및 BorderLayout 설정
        JPanel panel = new JPanel(new BorderLayout());

        // 컴포넌트 생성
        JLabel northLabel = new JLabel("상단 헤더 구역", JLabel.CENTER); // 글자 중앙 정렬
        JButton southBtn = new JButton("확인 버튼");
        JTextField eastField = new JTextField("입력", 5);
        JCheckBox westCheck = new JCheckBox("선택");
        JTextArea centerArea = new JTextArea(4, 12);

        // 영역 지정하여 패널에 추가 (BorderLayout의 핵심!)
        panel.add(northLabel, BorderLayout.NORTH); // 북쪽
        panel.add(southBtn, BorderLayout.SOUTH);   // 남쪽
        panel.add(eastField, BorderLayout.EAST);   // 동쪽
        panel.add(westCheck, BorderLayout.WEST);   // 서쪽
        panel.add(centerArea, BorderLayout.CENTER); // 중앙

        // 프레임에 패널 얹고 보이기
        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
