package ch21;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SwingExam8 {
	public static void main(String[] args) {
		//윈도우 생성하는 부분
		JFrame frm = new JFrame("JLabel & JTextField");
		frm.setBounds(120, 120, 180, 80);
		frm.setLayout(new GridLayout(2, 2));
		
		//텍스트랑 에딧창 설정하는 부분
		JLabel idLabel = new JLabel("ID : ", SwingConstants.RIGHT);
		JTextField idText = new JTextField(10);
		JLabel pwLabel = new JLabel("Password : ", SwingConstants.RIGHT);
		//Default로 글자가 가려져서 나옴
		JPasswordField pwText = new JPasswordField(10);
		//Password필드 글자 뭐로 출력할지 정하는 메소드
		pwText.setEchoChar('#');
		//이벤트 핸들러 등록
		pwText.addActionListener(new PWHandler(idText, pwText));
		
		
		//JFrame에 추가
		frm.add(idLabel);
		frm.add(idText);
		frm.add(pwLabel);
		frm.add(pwText);

		frm.setVisible(true);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}