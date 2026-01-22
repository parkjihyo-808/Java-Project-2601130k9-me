package _8_test_260122.ex;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _2_Guid_Ex2 {
    static void main(String[] args) {
        // 1. UI 준비
        JFrame frame = new JFrame("간단한 메모장");
        JTextArea textArea = new JTextArea(10,30);
        JButton saveBtn = new JButton("저장");
        JPanel panel = new JPanel();

        // 2. UI 조립
        // 패널에 스크롤 기능의 UI(JScrollPane) 넣기
        panel.add(new JScrollPane(textArea));
        panel.add(saveBtn);
        frame.add(panel);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // 3. 이벤트 리스너 붙이기(중요!!)
        saveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textArea.getText());
            }
        });
    }
}