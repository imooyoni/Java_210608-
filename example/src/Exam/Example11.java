package Exam;

import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {

		
		//Ű���忡�� ���ڿ� Ư�����ڸ� ������ ���ĺ��� �������� �Է¹޴´�.
		//�Է¹��� ���ڿ��� �ҹ��� a�� � �ִ����� �Ǻ��ϴ� ������ �����Ͻÿ�
		
		//��) �����Է�>aaksdhakdkfnkgkasaa
		//��) a�� ����>6��
		Scanner scan = new Scanner(System.in);
		
		String str;
		int count=0;
		
		System.out.print("�Է�>> ");
		str = scan.next(); //����(char)�� �迭 = String
				
		//�Է� // for//if
		//str.charAt(i)=='a' //string �迭�� ���� char �ϳ��� �о� ���ڴ�.
				
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a') {
				count++;
			}//if
		}//for
		System.out.println("a�� ���� >> " +count);
	}

}
