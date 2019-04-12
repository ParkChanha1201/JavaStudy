package ch21;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingExam2 {
	public static void main(String[] args) {
		JFrame frm = new JFrame();
		frm.setTitle("First Swing");

		frm.setBounds(120, 120, 400, 100);
		frm.setLayout(new FlowLayout());

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MouseListener ml = new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent e) {
					JButton b = (JButton) e.getSource();
					System.out.println(b.getText());
				}
				@Override
				public void mouseEntered(MouseEvent e) {
				}
				@Override
				public void mouseExited(MouseEvent e) {
				}
				@Override
				public void mousePressed(MouseEvent e) {
				}
				@Override
				public void mouseReleased(MouseEvent e) {
				}
			};
		

		JButton btn1 = new JButton("My Button");
		btn1.addMouseListener(ml);
		JButton btn2 = new JButton("Your Button");
		btn2.addMouseListener(ml);
		JButton btn3 = new JButton("Out Button");
		btn3.addMouseListener(ml);
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}
}