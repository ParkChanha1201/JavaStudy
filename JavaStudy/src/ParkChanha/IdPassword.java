package ParkChanha;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class IdPassword {

	static int count = 5;
	static String id = "ai";
	static String pw = "1234";

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(330, 130);
		frame.setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));

		JButton button = new JButton("�α���");

		// �ؽ�Ʈ�� ����â �����ϴ� �κ�
		JLabel idLabel = new JLabel("ID : ", SwingConstants.RIGHT);
		JTextField idText = new JTextField(10);
		JLabel pwLabel = new JLabel("Password : ", SwingConstants.RIGHT);
		// Default�� ���ڰ� �������� ����
		JPasswordField pwText = new JPasswordField(10);
		// Password�ʵ� ���� ���� ������� ���ϴ� �޼ҵ�
		pwText.setEchoChar('@');

		MouseListener mi = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (count > 0) {
					String INID = idText.getText();
					String INPW = new String(pwText.getPassword());
					
					boolean idCorrect = false;
					boolean pwCorrect = false;
					
					for(int i = 0;i<INID.length();i++) {
						if(INID.charAt(i) != id.charAt(i))
							break;
						else if(INID.charAt(i) == id.charAt(i) && i == INID.length()-1)
							idCorrect = true;
					}
					
					for(int i = 0;i<INPW.length();i++) {
						if(INPW.charAt(i) != pw.charAt(i))
							break;
						else if(INPW.charAt(i) == pw.charAt(i) && i == INPW.length()-1)
							pwCorrect = true;
					}
					
					if(!idCorrect)
						System.out.println("ID�� "+ INID +" Ʋ�Ƚ��ϴ�");
					else if(!pwCorrect)
						System.out.println("PW�� "+ INPW +" Ʋ�Ƚ��ϴ�");
					
					
					if (INID.equals("ai") && INPW.equals("1234")) {
						System.out.println("�α��� ����");
					} else {
						count--;
						System.out.println("���̵�� ��й�ȣ�� �ٽ� Ȯ�����ֽʽÿ�. \n����Ƚ��:" + count);
					}
				}
				else {
					System.out.println("�ʹ� ���� Ʋ�Ƚ��ϴ�.\n�� �̻� �õ��� �� �����ϴ�");
				}
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

		};

		button.addMouseListener(mi);

		panel.add(idLabel);
		panel.add(idText);
		panel.add(pwLabel);
		panel.add(pwText);

		frame.add(panel, BorderLayout.CENTER);
		frame.add(button, BorderLayout.EAST);

		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
