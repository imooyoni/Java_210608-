package Exam;

import java.util.Scanner;

public class UserInfoMain {

	public static void main(String[] args) {
		//��������
		int select;
		int money=0;
		
		//��ü����
		Scanner scan = new Scanner(System.in);
		UserInfo ui = new UserInfo();
		
		//while
		outer: while(true) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.�� �� | 2.�� �� | 3.�ܾ�Ȯ�� | 4.����");
			System.out.println("-------------------------------------------------------");
			System.out.print("���� ���� > ");
			//��ĵ�Է�
			select = scan.nextInt();
			//switch
			switch(select) {
			case 1:
				System.out.println("-- �� �� --");
				System.out.print("�Ա��� �ݾ��� �Է��ϼ���. > ");
				money=scan.nextInt();
				
				ui.deposit(money);
				break;
				
			case 2:
				System.out.println("-- �� �� --");
				System.out.print("����� �ݾ��� �Է��ϼ���. > ");
				money=scan.nextInt();
				
				ui.withdraw(money);
				break;
				
			case 3:
				System.out.println("--�ܾ�Ȯ��--");
				System.out.println(ui.showMoney()+"��");
				break;
				
			case 4:
				System.out.println("�ŷ�����");
				break outer;
			}//switch
		}//while
			
			
	}//main
}//class
