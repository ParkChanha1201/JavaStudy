package ch5;

public class Exam5_1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		String sep = "";
		
		for(int a:arr) {
			if(a % 2 != 0) {
				System.out.print( sep + a );
				sep = ", ";
			}
		}
		
	}
}
