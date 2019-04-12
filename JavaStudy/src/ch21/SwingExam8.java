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
		//������ �����ϴ� �κ�
		JFrame frm = new JFrame("JLabel & JTextField");
		frm.setBounds(120, 120, 180, 80);
		frm.setLayout(new GridLayout(2, 2));
		
		//�ؽ�Ʈ�� ����â �����ϴ� �κ�
		JLabel idLabel = new JLabel("ID : ", SwingConstants.RIGHT);
		JTextField idText = new JTextField(10);
		JLabel pwLabel = new JLabel("Password : ", SwingConstants.RIGHT);
		//Default�� ���ڰ� �������� ����
		JPasswordField pwText = new JPasswordField(10);
		//Password�ʵ� ���� ���� ������� ���ϴ� �޼ҵ�
		pwText.setEchoChar('#');
		//�̺�Ʈ �ڵ鷯 ���
		pwText.addActionListener(new PWHandler(idText, pwText));
		
		
		//JFrame�� �߰�
		frm.add(idLabel);
		frm.add(idText);
		frm.add(pwLabel);
		frm.add(pwText);

		frm.setVisible(true);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}