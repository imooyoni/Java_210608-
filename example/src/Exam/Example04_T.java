package Exam;

import java.util.Scanner;

public class Example04_T {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 0;
		
		Scanner scan = new Scanner( System.in);
		
		System.out.print("ù��° ���� �Է� : ");
		n1 = scan.nextInt();
		
		System.out.print("�ι�° ���� �Է� : ");
		n2 = scan.nextInt();
		
		//�ּ� �����
		//�ݺ����� �̿��ϰ� �� �ȿ� if������ �� ���� ������ ������������ �ݺ�
		int i = 0;
		/*
		for (i=1; i<=n1*n2; i++) {
			if (i % n1 == 0 && i%n2 == 0)
				break;
		}
		*/
		
		while(true) {
			i++;
			if (i % n1 == 0 && i%n2 == 0)
				break;
		}
		System.out.println(n1 + "��(��) " + n2 + "�� �ּҰ���� : " + i);
		
	}

}
