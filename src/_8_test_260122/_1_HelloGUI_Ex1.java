package _8_test_260122;

import javax.swing.*;

public class _1_HelloGUI_Ex1 {
    static void main(String[] args) {
        JFrame frame = new JFrame("Hello GUI");
        // 버튼 추가
        JButton button = new JButton("Click Me!");
        frame.add(button);
        // 라벨 추가
        JLabel label = new JLabel("Hello, Swing!");
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
