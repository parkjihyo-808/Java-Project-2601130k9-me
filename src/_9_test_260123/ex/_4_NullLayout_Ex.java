package _9_test_260123.ex;

import javax.swing.*;

public class _4_NullLayout_Ex {
    public static void main(String[] args) {
        // 컨테이너 생성
        JFrame frame = new JFrame("실습 4");
        frame.setLayout(null);
        // 이름 라벨, 입력란
        JLabel nameLabel = new JLabel("이름");
        nameLabel.setBounds(15,15,50,25);
        JTextField nameField = new JTextField();
        nameField.setBounds(70,15,100,25);

        // 나이 라벨, 입력란
        JLabel ageLabel = new JLabel("나이");
        ageLabel.setBounds(15,50,50,25);
        JTextField ageField = new JTextField();
        ageField.setBounds(70,50,100,25);

        // 확인 버튼
        JButton btn = new JButton("확인");
        btn.setBounds(110, 90, 80,30);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(btn);

        frame.setSize(220,180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
