package ch12;

public class Exam12_2_new {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		String msg = "Cyqw amkc, cyqw em";

		/* �ݺ����� �̿��Ͽ� ���ڿ��κ��� ���� �������� */
		for (int i = 0; i < msg.length(); i++) {

			if (msg.charAt(i) >= ASCII_A && msg.charAt(i) <= ASCII_Z) {

				if (msg.charAt(i) >= 'X' && msg.charAt(i) <= 'Z') {
					System.out.print((char) (msg.charAt(i) - 24));
					continue;
				} else {
					System.out.print((char) (msg.charAt(i) + 2));
					continue;
				}
			}
			if (msg.charAt(i) >= ASCII_a && msg.charAt(i) <= ASCII_z) {

				if (msg.charAt(i) >= 'x' && msg.charAt(i) <= 'z') {
					System.out.print((char) (msg.charAt(i) - 24));
					continue;
				} else {
					System.out.print((char) (msg.charAt(i) + 2));
					continue;
				}
			}
			System.out.print((char) (msg.charAt(i)));
		}
	}
	/* A ~ Z, a ~ z ������ �����̸� �ƽ�Ű �ڵ带 2 ������Ų �� ��� */
	/* ��, X / x / Z / z �� ��� 2 ���� �� */
	/* ���ĺ� ������ ����� �ʵ��� ó�� */
	/* A ~ Z, a ~ z ������ ���ڰ� �ƴϸ� �״�� ��� */
}