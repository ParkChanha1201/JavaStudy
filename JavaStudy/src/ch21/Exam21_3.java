package ch21;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyMOUSE implements MouseListener{

	private JTextField text;
	private JTextArea area;
	
	MyMOUSE(JTextField text, JTextArea area){
		this.text = text;
		this.area = area;
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		area.append(text.getText());
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


public class Exam21_3 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("��縸 ä��â");
		frame.setLayout(new FlowLayout());
		JTextArea area = new JTextArea(10, 20); // ��*�� 10*20
		area.setEditable(false); // ���� �Ұ�
		area.setFocusable(false); // ��Ŀ�� �Ұ�
		frame.add(area);
		
		
		
		/* JPanel ���� */
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(1,2));
		
		
		
		/* JTextField ���� */
		
		JTextField field = new JTextField(18);
		
		/* JButton ���� */
		
		MyMOUSE MM = new MyMOUSE(field, area);
		
		/* JTextField �� JButton�� JPanel�� �߰� */

		MouseListener ml = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				area.append(field.getText());
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
		
		JButton btn = new JButton("����");
		btn.addMouseListener(MM);
		
		panel.add(field,BorderLayout.CENTER);
		panel.add(btn,BorderLayout.EAST);
		
		frame.add(panel);
		frame.setSize(300, 280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		/* JButton Ŭ�� �� �Էµ� ���ڸ� JTextArea�� ��� */
	}
}