package ch15;

import java.io.File;
import java.io.IOException;

public class ExceptionExam3 {
	public static void main(String[] args) throws NumberFormatException, ClassCastException {
//		String numStr = " 123";
//		int num = Integer.parseInt(numStr);

//		Object obj = new String("a");
//		int a = (Integer) obj;
		
		try {
			new File("").createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}