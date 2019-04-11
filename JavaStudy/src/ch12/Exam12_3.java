package ch12;

public class Exam12_3 {
	public static void main(String[] args) {
		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		// 코드 작성
		
		String[] strArr = str.split(" ");
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j <= i; j++)
			{
				System.out.print(strArr[j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
}
