package pk5;

import java.util.Scanner;

public class Result {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String ID=scan.nextLine(); //smile
		
		System.out.println("��й�ȣ : ");//Ŭ�������� ���� ����(=�ν��Ͻ�����)
		String PW=scan.nextLine();// String �� �����, int�� ����� �ȿ� �ִ� ���
		
		//��� ����ȯ(string -> int)
		int pass = Integer.parseInt(PW); 
		//Ŭ�������� ���� ���̵��� Ŭ�������� ��ȯ���ֱ� ���ؼ� integer��� 
		
		//���̵� ������ ��й�ȣ Ȯ������ �Ѿ�� ��й�ȣ
		
		if (ID.equals("smile")) {//equals ����? �����ͺ��̽��� �ִ� �Ŷ� smile�̶� ����?
			if (pass == 12345) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ����: ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("�α��� ����: �������� �ʴ� ���̵� �Դϴ�.");
		}//else
	
	}//main

}//class

//Syntax error = ��Ÿ