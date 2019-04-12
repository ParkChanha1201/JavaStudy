package ch21;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Exam21_4 {
	public static void main(String[] args) {
		Bingo b = new Bingo();
		b.display();
	}
}

class BtnHandler implements ActionListener {
	
	static int[][] ary = new int[5][5];
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.LIGHT_GRAY);

		// ���õ� ��ư�� ��ǥ Ȯ�� (setName���� ������ ��)
		String xy = btn.getName();
		System.out.println(xy);

		char x = xy.charAt(0);
		char y = xy.charAt(1);

		int numX = Integer.parseInt(x + "");
		int numY = Integer.parseInt(y + "");
		
		ary[numX][numY] = 1;
		
		/* ������ �ϼ� Ȯ�� �ڵ� */
		for (int i = 0; i < 5; i++) {
			if(ary[numX][i] == 0)
				break;
			if(ary[numX][i] != 0 && i == 4)
				System.out.println("������ ����");
		}
		/* ������ �ϼ� Ȯ�� �ڵ� */
		for (int i = 0; i < 5; i++) {
			if(ary[i][numY] == 0)
				break;
			if(ary[i][numY] != 0 && i == 4)
				System.out.println("������ ����");
		}
		
		/*�밢�� Ȯ�� �ڵ�*/
		if(numX == numY) {
			for(int i =0, j = 0; i < 5;i++,j++) {
				if(ary[i][j] == 0)
					break;
				if(ary[i][j] != 0 && i == 4)
					System.out.println("�밢�� ����");
			}
		}
		//���밢
		if(numX + numY == 4) {
			for(int i =4, j = 0; i >= 0;i--,j++) {
				if(ary[i][j] == 0)
					break;
				if(ary[i][j] != 0 && i == 0)
					System.out.println("���밢�� ����");
			}
		}
		
		
		
		
	}
}