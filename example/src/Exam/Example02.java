package Exam;

import java.util.Scanner;

public class Example02 {
	
	public static void main(String[] args) {
		
		/* Scanner�� ���� ���� n1, n2�� �Է¹޴´�.
	    �׸��� n1���� n2������ ���� ����Ͽ� �� ����� ����Ͻÿ�.
		ex) scan���� 5, 2�� �Է� : 2+3+4+5 �� ��°��  15�� �ֿܼ� ���
	 */
		
		Scanner scan = new Scanner(System.in);
		
		//��������
		
		int n1;
		int n2;
		int result=0;
		
		System.out.print("ù��° ���� �Է��ϼ���: ");
		n1 = scan.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ���: ");
		n2 = scan.nextInt();
		
		//Ȥ�� ū���� n1�� �ԷµǸ� ����(��ü�˰���)�� �̿��Ͽ� �������� n1�� ������
		
		if (n1>n2) {
			int a = n1;
			n1 = n2;
			n2 = a;
		} for (int i=n1; i<=n2; i++) {
			result += i;
		}
		
		System.out.println("����� : " + result);
		
				
	}

}