package Exam;

import java.util.Scanner;

public class Example04 {
 
	public static void main(String[] args) {
		
		/* Ű���忡�� �� ���� �Է¹޾�, �Է¹��� �� ���� �ּҰ���� ���ϱ�.
		 * ��) 2�� 5�� �Է� : 2 4 6 8 10 (��� �߿��� �������� �� �������� 0�� �� ����)
		 * 				   5 10 15 20
		 * 
		 * 	*�� ���� ������ ���� �� ������ ������ ��
		 */
		
		//���� ����
		int num1, num2, a ;
		
		//��ĳ�� ��ü
		Scanner scan = new Scanner(System.in); //int�� stack �޸𸮿� �����, scan�� heap �޸𸮿� �����!
		
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		num1 = scan.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		num2 = scan.nextInt();
		
		a = num1 * num2;
		
		//�ּҰ����
		for (int i=1; i<=a; i++) {
			/*
			num1 = num1 * i;
			num2 = num2 * i;
			
			if(a % num1 == 0 || a % num2 == 0)
			*/
			
			if(i % num1 == 0 && i % num2 == 0)
				break;
			
			// System.out.println("�ְ������� : " + a);
		}
		System.out.println("�ְ������� : " + a);
		//�ݺ���
		
	}
}
