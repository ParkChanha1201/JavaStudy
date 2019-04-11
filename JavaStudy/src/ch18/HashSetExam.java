package ch18;

import java.util.ArrayList;
import java.util.TreeSet;

public class HashSetExam {
	public static void main(String[] args) {

//		HashSet<Integer> lotto = new HashSet<Integer>();
		TreeSet<Integer> lotto = new TreeSet<Integer>();

		while(true) {
			
			lotto.add((int)(Math.random()*45)+ 1);
			
			if(lotto.size() == 6)
				break;
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
