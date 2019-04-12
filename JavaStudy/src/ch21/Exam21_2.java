package ch21;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Exam21_2 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("모양만 계산기");
		frm.setBounds(100, 100, 220, 300); // 윈도우 크기 지정
		frm.setLayout(new BorderLayout()); // 정렬방식
		
		

		JLabel label = new JLabel();
		label.setText("");
		/* 오른쪽 정렬 */
		label.setHorizontalAlignment(SwingConstants.CENTER);
		frm.add(label, BorderLayout.NORTH);

		
MouseListener ml = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				JButton b = (JButton)e.getComponent();
				String text = b.getText();
				label.setText( label.getText() +  text);
			}
		};
		
		/* JPanel1 추가 */
		JPanel j1 = new JPanel();
		j1.setLayout(new GridLayout(3, 3));
		for (Integer i = 9; i > 0; i--) {
			JButton jb = new JButton(i.toString());
			jb.addMouseListener(ml);
			j1.add(jb);
		}
		frm.add(j1, BorderLayout.CENTER);

		/* JPanel2 추가 */

		JPanel j2 = new JPanel();
		j2.setLayout(new GridLayout(1, 4));

		j2.add(new JButton("+"));
		j2.add(new JButton("-"));
		j2.add(new JButton("x"));
		j2.add(new JButton("/"));

		frm.add(j2, BorderLayout.SOUTH);

		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
