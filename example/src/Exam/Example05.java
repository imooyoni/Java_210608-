package Exam;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/* Ű���忡�� �� ���� �Է¹޾�, �Է¹��� �� ���� �ִ����� ���ϱ�.
		 * ��) 4�� 10�� �Է� : 1 2 4 
		 * 				    1 2 5 10
		 * 	  3�� 7�� �Է� : 1 3
		 * 				   1 7
		 * 
		 * 	*�� ���� ������ ���� �� ������ ������ ��
		 */
		
		//���� ����
		int n1, n2;
		
		
		//�� �� ��ĵ ��ü
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		n1 = scan.nextInt();
		
		System.out.print("�ι�° ���� : ");
		n2 = scan.nextInt();
		
		if (n1>n2) {
		int a = n1;
		n1 = n2;
		n2 = a;
		/*		
		for (i = n2; ; i--) {
			if (i % n1 == 0 && i%n2 == 0)
				break;
		}*/
		
		//for / while�� >> �� �� �߿� ���� �� ���� 
		//for (���� �� ; 1���� ũ�ų� ���������� ;i--)
		}
	}
}
