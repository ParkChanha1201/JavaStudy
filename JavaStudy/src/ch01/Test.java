package ch01;

public class Test {
	public static void main(String[] args) {
		// Unix Time
		System.out.println(System.currentTimeMillis());
		// Random 0.0 <= x < 1.0
		System.out.println(Math.random());
		
		System.out.println(Math.random() * 6);
		System.out.println((int)(Math.random() * 6) + 1);
	}
}
