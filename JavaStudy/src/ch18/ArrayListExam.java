package ch18;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExam {
	public static void main(String[] args) {

		ArrayList<Integer> lotto = new ArrayList<Integer>();

		for (int i = 0; i < 6; i++) {
			lotto.add((int)(Math.random()*45)+ 1);
		}
		
		Iterator<Integer> iter = lotto.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println(lotto);

		String[] arr = new String[3];
		arr[0] = "kim";
		String value = arr[0];

		ArrayList<String> list = new ArrayList<String>();
		list.add("kim");
		String value2 = list.get(0);

	}
}
