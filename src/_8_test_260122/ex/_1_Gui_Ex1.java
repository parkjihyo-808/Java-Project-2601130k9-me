package _8_test_260122.ex;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _1_Gui_Ex1 {
    static void main(String[] args) {
        // 1. 창 만들기
        JFrame frame = new JFrame("Hello GUI");

        // 2. 패널 추가
        JPanel panel = new JPanel();

        // 3. 버튼 추가
        JButton button = new JButton("메뉴");
        frame.add(button);
        // 3-2. 버튼 추가(나가기)
        JButton exitBtn = new JButton("나가기");
        // 패널에 나가기 버튼 추가
        panel.add(exitBtn);

        // 4. 라벨 추가
        JLabel label = new JLabel("오늘 점심은 치킨버터카레");
        frame.add(label);
        // 이름 입력 라벨, 텍스트 필드 입력창 만들기.
        JLabel nameLabel = new JLabel("이름 입력: ");
        JTextField nameTextField = new JTextField(10);

        // 5. 조립하기
        // 프레임에 패널 추가
        frame.add(panel);
        // 패널에 라벨, 버튼 추가 (패널에 담기)
        panel.add(label);
        panel.add(button);

        // 6. 패널에 나가기 버튼 추가
        panel.add(exitBtn);

        // 7. 패널에 라벨, 텍스트필드 추가
        panel.add(nameLabel);
        panel.add(nameTextField);

        // 8. 간단한 이벤트 처리 맛보기
        exitBtn.addActionListener(new ActionListener() { // 익명클래스 구현
            @Override
            public void actionPerformed(ActionEvent e) {
                // 클릭시 동작할 기능 넣기. 창닫기.
                frame.dispose();
            }
        });

        // 9. 창크기, 닫기 설정, 눈에 보이기 작업.
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
