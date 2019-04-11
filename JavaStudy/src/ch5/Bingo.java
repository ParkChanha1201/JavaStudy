package ch5;

import java.util.Random;

public class Bingo {
	public static void main(String[] args) {

		int[] bingo = new int[25];

		Random r = new Random();

		int temp = 0;

		for (int i = 0; i < 25; i++) {
			bingo[i] = i + 1;
		}

		for (int i = 0; i < 10000; i++) {
			int random = (int) (Math.random() * 25);
			temp = bingo[0];
			bingo[0] = bingo[random];
			bingo[random] = temp;
		}

		for (int i = 1; i <= 25; i++) {
			System.out.print(bingo[i - 1] + "\t");
			if (i % 5 == 0) {
				System.out.println();
			}
		}

	}
}
