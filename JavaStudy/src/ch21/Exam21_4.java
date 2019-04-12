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

		// 선택된 버튼의 좌표 확인 (setName으로 지정된 값)
		String xy = btn.getName();
		System.out.println(xy);

		char x = xy.charAt(0);
		char y = xy.charAt(1);

		int numX = Integer.parseInt(x + "");
		int numY = Integer.parseInt(y + "");
		
		ary[numX][numY] = 1;
		
		/* 가로줄 완성 확인 코드 */
		for (int i = 0; i < 5; i++) {
			if(ary[numX][i] == 0)
				break;
			if(ary[numX][i] != 0 && i == 4)
				System.out.println("가로줄 빙고");
		}
		/* 세로줄 완성 확인 코드 */
		for (int i = 0; i < 5; i++) {
			if(ary[i][numY] == 0)
				break;
			if(ary[i][numY] != 0 && i == 4)
				System.out.println("세로줄 빙고");
		}
		
		/*대각선 확인 코드*/
		if(numX == numY) {
			for(int i =0, j = 0; i < 5;i++,j++) {
				if(ary[i][j] == 0)
					break;
				if(ary[i][j] != 0 && i == 4)
					System.out.println("대각선 빙고");
			}
		}
		//역대각
		if(numX + numY == 4) {
			for(int i =4, j = 0; i >= 0;i--,j++) {
				if(ary[i][j] == 0)
					break;
				if(ary[i][j] != 0 && i == 0)
					System.out.println("역대각선 빙고");
			}
		}
		
		
		
		
	}
}