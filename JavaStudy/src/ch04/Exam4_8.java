package ch04;

public class Exam4_8 {
	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {
			int n1, n2, n3;
			n1 = i % 10;
			n2 = (i / 10) % 10;
			n3 = (i / 100) % 10;

			if (n1 == 3 || n2 == 3 || n3 == 3) {
				System.out.println(i + " : 3Æ÷ ÇÔ");
			}
		}

	}
}
