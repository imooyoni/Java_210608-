package pk8;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		//���� ����
		int money;
		String select = "";
		
		//��ü����
		Scanner scan = new Scanner(System.in);
		Vending ven = new Vending();
		
		ven.init(); //����� ���ÿϷ�
		
		//�Է¹޾� showCans ȣ��
		System.out.print("���� �����ϼ��� > ");
		money = scan.nextInt();
		
		ven.showCans(money);
		
		System.out.print("������� �����ϼ��� > ");
		select=scan.next();
		
		ven.outCan(select);
		
		
		//�Է¹޾� outCan ȣ��
				//���� �Է��ϴ� ���� ��ĵ�޾�, ���Ḧ ������, showcans�� ���� ������, ���� �Է���
		
	}

}
