package ch15;

public class ExceptionExam1 {

	static void a() {
		b();
	}
	
	static void b() {
		String numStr = " 123";
		int num2 = Integer.parseInt(numStr); // NumberFormatException
	}
	
	public static void main(String[] args) {
		
			a();

		
		
	}
}