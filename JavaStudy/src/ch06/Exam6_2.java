package ch06;

public class Exam6_2 {

	
	public static int sum(int n) {
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int n = 100;
		int total = sum(n);
		System.out.println("1~"+n+"까지의 합"+total);
		
		
	}
}
