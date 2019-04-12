package ch21;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingExam1 {
	public static void main(String[] args) {
		JFrame frm = new JFrame();
		frm.setTitle("First Swing");

		frm.setBounds(120, 120, 400, 100);
		frm.setLayout(new FlowLayout());

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1 = new JButton("My Button");
		JButton btn2 = new JButton("Your Button");
		JButton btn3 = new JButton("Out Button");

		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}
}