package ch12;

public class Exam12_3 {
	public static void main(String[] args) {
		String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
		// �ڵ� �ۼ�
		
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
