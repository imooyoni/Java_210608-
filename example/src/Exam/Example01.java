package Exam;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
		/* Scanner�� ���� ���� n�� �Է¹޴´�.
		    �׸��� 1���� �Է¹��� ���� n������ ���� ����Ͽ� �� ����� ����Ͻÿ�.
			ex) scan���� 5�� �Է� : 1+2+3+4+5 �� ��°��  15�� �ֿܼ� ���
		 */
		System.out.println("���ڸ� �Է��ϼ��� : ");
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		int sum=0; // ���� �Ʒ����� �������� ���� �Ÿ� �ʱ�ȭ�Ҷ� �������!
		
		n=scan.nextInt(); //�ֿܼ� ���ڸ� �޾ƶ�!
		
		for (int i = 1;i<=n ; i++) { //i�� 1���� �����ؼ� �Է¹��� n���� 1�� ���ض�!
			sum+=i; //0�� sum�� i�� ���� ���ض�! 
		}
				System.out.println("��� : " + sum); //n���� �� �������� ��� ���� �ѷ���!
	}
}
//initialized : �ʱ�ȭ�� ���� ���� ����