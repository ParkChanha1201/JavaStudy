package ch5;

public class Exam5_3 {
	public static void main(String[] args) {
		
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		
		for (int i = 0; i < 100; i++) {
			char tmp = nums[0];
			
			int random = (int) (Math.random() * 7);
			
			nums[0] = nums[random];
			nums[random] = tmp;
			
			
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		
	}
}
