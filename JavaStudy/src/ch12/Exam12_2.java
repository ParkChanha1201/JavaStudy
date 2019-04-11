package ch12;

public class Exam12_2 {
	public static void main(String[] args) {
		String file = "/home/temp/Java.class";
		// 코드 작성
		String[] str = file.split("/");
			
		String seperator = "";
		
		for (String s : str) {
			System.out.println(seperator + s);
			seperator = "/";
		}
	}
}
