package ch07;

import java.awt.Color;
import java.awt.Event;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	public static void main(String[] args) {
		JFrame frame = new JFrame("������");

		frame.setSize(600, 400);
		//frame.setResizable(false);
		
		frame.setTitle("�ʹ� �ų��� �ڹ����α׷���...");
		
		
		JButton b = new JButton();
		b.setText("��ư�Ӵϴ�");
		b.setBounds(10, 10, 100, 25);
		b.setSize(100, 25);
		b.setBackground(Color.red);
		
		frame.add(b);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}