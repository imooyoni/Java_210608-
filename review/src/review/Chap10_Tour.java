package review;

import java.util.Scanner;

public class Chap10_Tour {

	public static void main(String[] args) {
		/*
		��� : 
		������ �� : 2 (����ڰ� �Է�)
		������ ���
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ ���� �Է��ϼ���. >");
		int n = scan.nextInt();
		
		Chap10_Guide guide = new Chap10_Guide(n);
		
		for(int i=0; i<n; i++) {
			System.out.print((i+1)+". �̸� : ");
			guide.guest[i].setName(scan.next());
			
			System.out.print((i+1)+". ���� : ");
			guide.guest[i].setGender(scan.next());
			System.out.println("--------------------");
		}
		System.out.println("������ " + n + " �� ��� �Ϸ�!");
		
		
		boolean run=true;
		while(run) {
			
			System.out.println("--------------------");
			System.out.println("1. ������ ���� \n2. ������ ����\n3. ����");
			System.out.println("--------------------");
			System.out.println();
			System.out.print("���ϴ� �۾� ��ȣ�� �����ϼ���. >");
			int select = scan.nextInt();
			
			switch(select) {
				case 1:
					for (int i=0; i<n; i++) {
					guide.showGuestInfo(i);
					}//for
					break;
					
				case 2:
					System.out.println();
					System.out.print("���� �������� " +guide.point + "�Դϴ�.\n�����Ͻ� �������� �Է��ϼ���.>");
					guide.point=scan.next();
					System.out.println("�������� " + guide.point + "�� ����Ǿ����ϴ�.");
					break;
					
				case 3:
					System.out.println("�۾��� �����մϴ�.");
					run=false;
					break;
			}//switch
		}//while
		
	}//main

}//class

/*
1. �̸� : ȫ�浿
1. ���� : ��
--------------------------
2. �̸� : ȫ���
2. ���� : ��

1. ������ ����
2. ������ ����
3. ����

���� >> 1
1. �̸� : ȫ�浿
1. ���� : ��
1. ������ : ���ŵ�
--------------------------------------
2. �̸� : ȫ���
2. ���� : ��
2. ������ : ���ŵ�
========================================
1. ������ ����
2. ������ ����
3. ����

���� >> 2	
���� �����Ͻðڽ��ϱ� : ���̵�
���̵��� ������ ����
========================================
1. ������ ����
2. ������ ����
3. ����
���� >> 3
����
*/