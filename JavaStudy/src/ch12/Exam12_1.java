package ch12;

import java.util.Scanner;

public class Exam12_1 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		System.out.print("���̵� �Է����ּ���. => ");
		Scanner s = new Scanner(System.in);
		String id = s.nextLine();

		boolean isUpper = false;
		boolean isLower = false;

		/* �ݺ����� �̿��Ͽ� ���ڿ��κ��� ���� �������� */
		/* ASCII_A �� �̸� ���ǵǾ� �ִ� �ƽ�Ű �ڵ� ����� �̿��Ͽ� */
		/* �빮�ڿ� �ҹ��� �Է� ���� Ȯ�� */
		for (int i = 0; i < id.length(); i++) {
			
			if(id.charAt(i) >= ASCII_A && id.charAt(i) <= ASCII_Z)
				isUpper = true;
			if(id.charAt(i) >= ASCII_a && id.charAt(i) <= ASCII_z)
				isLower = true;
		}
		/* �빮�ڿ� �ҹ��� �Է� ���ο� ���� ��� ��� */
		
		if(isUpper && isLower)
			System.out.println("�Է��Ͻ� ���̵��" + id + "�Դϴ�\n���� ���ԵǾ����ϴ�");
		else
			System.out.println("���̵� Ȯ�����ּ���.");

		s.close();
	}
}