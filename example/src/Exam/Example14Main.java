package Exam;

import java.util.Scanner;

public class Example14Main {

	public static void main(String[] args) {
		
		Example14 ws = new Example14();
		
		String ans = ws.getAnswer();//���� ��ȯ �޼��� ȣ��
		
		//������ �ܾ ��� �����濡 �ֱ�
		String question = ws.getScrambleWord(ans);
		
		System.out.println("���� : " + question);
		
			//boolean run;
		while (true) {
			
			System.out.print("�ܾ��? : ");
			Scanner scan = new Scanner(System.in);
			String str = scan.next();
			
			if(str.equalsIgnoreCase(ans)) {//��ҹ��� �������� �ʰ� ����?
				System.out.println(str + "����!!");
				break;
			} else {
				System.out.println(str + "����... :(");
			}
			
		}
	}

}
