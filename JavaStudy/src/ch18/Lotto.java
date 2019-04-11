package ch18;

import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		TreeSet<Integer> my = new TreeSet<Integer>();

		lotto.add(10);
		lotto.add(16);
		lotto.add(20);
		lotto.add(30);
		lotto.add(40);
		lotto.add(44);

		long count = 0;

		while (true) {
			my.clear();
			while (true) {
				my.add((int) (Math.random() * 45) + 1);
				if (my.size() == 6)
					break;
			}
			count++;
			System.out.println(count);
			if (lotto.containsAll(my))
				break;
		}
		System.out.println("맞추는데 걸린 횟수: " + count);
		System.out.println(my);
	}
}
