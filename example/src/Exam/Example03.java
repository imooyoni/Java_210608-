package Exam;

import java.util.Random;
import java.util.Scanner;

public class Example03 {
	
	public static void main(String[] args) {
		
		// ��ǻ�Ͱ� �������� �߻���Ű�� ��
		//1~9 ������ ���� �Է��ϼ���:
		/* 
		 ù��° ���� �Է� �ϼ��� : 4 
		 �ι�° ���� �Է� �ϼ��� : 5 
		 ����° ���� �Է� �ϼ��� : 6
		 
		 2Strike 0Ball
		 >> �� �ڸ��� ���ڰ� �� ���� �� ���� ��� �ݺ�! >> while ��
		 
		 ù��° ���� �Է� �ϼ��� : 7 
		 �ι�° ���� �Է� �ϼ��� : 8 
		 ����° ���� �Է� �ϼ��� : 9
		 OUT!!
		 
		 ù��° ���� �Է� �ϼ��� : 1 (4) 
		 �ι�° ���� �Է� �ϼ��� : 6 (1)
		 ����° ���� �Է� �ϼ��� : 5 (6)
		 0Strike 2Ball
		 
		 ù��° ���� �Է� �ϼ��� : 4 
		 �ι�° ���� �Է� �ϼ��� : 1
		 ����° ���� �Է� �ϼ��� : 6
		 WIN!!
		  */
		
		Scanner scan = new Scanner(System.in);
		
		int com1 = 0;
		int com2 = 0;
		int com3 = 0;
		
		do {
		com1 = new Random().nextInt(9)+1;
		com2 = new Random().nextInt(9)+1;
		com3 = new Random().nextInt(9)+1;
		}  while (com1==com2 || com1==com3||com2==com3) ;
		
		System.out.print(com1);
		System.out.print(com2);
		System.out.println(com3);
		
		int user1=0;
		int user2=0;
		int user3=0;
		
		while(true) {
			System.out.println("1���� 9������ ���� �Է��ϼ���.");
			
			System.out.print("ù��° ���� �Է� �ϼ���: ");
			user1 = scan.nextInt();
			System.out.print("�ι�° ���� �Է� �ϼ���: ");
			user2 = scan.nextInt();
			System.out.print("����° ���� �Է� �ϼ���: ");
			user3 = scan.nextInt();
			
			int strike=0;
			int ball=0;
			
			//���࿡ ����ڰ� �Է��� ù��° play���ڿ� com1�̶� ������ : strike 1�� ȹ��
			//user1�� ������� ���ڴ� ������ �ڸ����� �ٸ� ��� ���� ���� : ball 1�� ȹ��
			//===================================================================
			
			
			if (user1 == com1) {
				strike++;		
			}else if (user1 == com2 || user1==com3) {
				ball++;
			}
				//���࿡ ����ڰ� �Է��� �ι�° play ���ڿ� com2�� ������ : strike 1�� ȹ��
				//user2�� ������� ���ڴ� ������ �ڸ����� �ٸ� ��� ���� ���� : ball 1�� ȹ��
				//===================================================================
			if (user2 == com2) {
				strike++;
			}else if (user2 == com1 || user2 == com3) {
				ball++;
			}
				//���࿡ ����ڰ� �Է��� ����° play ���ڿ� com2�� ������ : strike 1�� ȹ��
				//user3�� ������� ���ڴ� ������ �ڸ����� �ٸ� ��� ���� ���� : ball 1�� ȹ��
				//===================================================================
			if (user3 == com3) {
				strike++;
			}else if (user3 == com1 || user3 == com2){
				ball++;
			}
			
			
			if (strike ==0 && ball == 0) {
				System.out.println("OUT!!");
			} else if (strike == 3) {
				System.out.println("WIN!!");
				break;
			} else {
			System.out.println(strike + " strike " + ball + " ball");
			}
			
			
			//strike 3���̸� WIN!! ��� �� ����
			//
			
			//strike 0 || ball 0 OUT!!
				
				
			//���ڴ� ������ �ڸ����� �ٸ� ��� ���� ���� : ball 1�� ȹ��
			
				//1~9 ������ ���� �Է��ϼ���:
			/* 
			 ù��° ���� �Է� �ϼ��� : 4 
			 �ι�° ���� �Է� �ϼ��� : 5 
			 ����° ���� �Է� �ϼ��� : 6
			 
			 2Strike 0Ball
			*/
		}
		
	}
}
