package Exam;

import java.util.Scanner;

public class Example02_T {
	
	public static void main(String[] args) {
		
		//��������
		
		int n1=0, n2=0;
		int result=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է��ϼ���: ");
		n1=scan.nextInt();
		
		System.out.println("�ι�° ���� �Է��ϼ���: ");
		n2=scan.nextInt();
		
		if(n1>n2) {
			int temp=n1;
			n1=n2;
			n2=temp;
		}
		//for���� �̿��Ͽ� ���� ����
		for (int i=n1; i<=n2; i++) {
			result +=i;
		}
		System.out.println("��� : "+result);
	}

}
