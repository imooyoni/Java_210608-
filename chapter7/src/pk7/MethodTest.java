package pk7;

import java.util.Scanner;

public class MethodTest {
	
	int[] bread = null;
	
	int selectNo = 0;
	int sum = 0;
	
	void makeBread() {
		System.out.println("�� �ϼ�!!");
	}
	
	void makeBread(int count) {
		bread = new int[count];
		
		for (int i=0; i<count; i++) {
			System.out.println( (i+1) +"�� �� �ϼ�!!!");
		}
		
		System.out.println("��û�Ͻ� " +count + "���� ���� ��� �ϼ��Ǿ����ϴ�.");
	}
	
	void makeBread(int count, String name) {
		bread = new int[count];
		
		for(int i=0; i<count; i++) {
			System.out.println( (i+1) + "��° " + name + " �ϼ�!!");
		}
		System.out.println("��û�Ͻ�" + count +"���� " + name +"�� ��� �ϼ��Ǿ����ϴ�.");
	}

	void order(int count) {//�޼ҵ忡�� �ٸ� �޼ҵ带 �ҷ��ͼ� ����� �� ����!
	
	boolean run = true;
	
	int a=0;
	String b=null;

	Scanner scan = new Scanner(System.in);
	
	while (run) {
		System.out.println("-------------------------------------------------------------");
		System.out.println("1. �� ������ ���� | 2. �� ������ ���� ���� | 3. ����");
		System.out.println("-------------------------------------------------------------");
		System.out.print("���� > ");
		
		selectNo = scan.nextInt();
		
		if (selectNo ==1 ) {
			System.out.print("�ֹ��� �� ���� : ");
			a = scan.nextInt();
			makeBread(a);
		} 
		else if(selectNo == 2 ) {
			for(int i=0; i<count; i++) {
			System.out.print("�� ���� : ");
			a=scan.nextInt();
			
			System.out.print("�� �̸� : ");
			b=scan.next();
			
			makeBread(a, b);
			}
		} 
		else if(selectNo == 3) {
			System.out.println("���α׷� ����");
			break;		
		}
	}
	}
}
