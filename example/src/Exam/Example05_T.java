package Exam;

import java.util.Scanner;

public class Example05_T {

	public static void main(String[] args) {
		
		int n1, n2;
		int check=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		n1 = scan.nextInt();
		System.out.print("�ι�° ���� : ");
		n2 = scan.nextInt();
		
		if (n1 >= n2) 
			check=n2; //������ ����
		else 
			check=n1;
		
		//for / while�� >> �� �� �߿� ���� �� ���� 
				//for (���� �� ; 1���� �۰ų� ���������� ;i--)
		int i;
		for(i= check; i>=1; i--) { //���� ���� �̿��ؼ� i�� ���� ������ �����ؼ� 1�� ���̴µ� 1���� ũ�ų� ���������� �ݺ�
			if (n1 % i == 0 && n2 % i == 0) {
			break;
			}
		}
		//���
		if (i==1 ) {
			System.out.println("�ִ������� �����ϴ�.");
		} else {
			System.out.println(n1 + "��(��) " + n2 + "�� �ִ����� : " + i);
		} //else
			
		}//main
		/*
		int a = n1;
		n1 = n2;
		n2 = a;
				
		for (i = n2; i1; i--) {
			if (i % n1 == 0 && i%n2 == 0)
				break;
		*/
}//class

