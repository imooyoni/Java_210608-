package Exam;

import java.lang.reflect.Array;
import java.util.Scanner;

//while
public class Example09 {

	public static void main(String[] args) {
		
		boolean run = true; // ��Ʈ �ѹ�, select �ѹ� 5 �극��ũ
		
		int studentNum = 0;
		int[] scores = null;//�Ƚᵵ ��! int[]score = new int[];
		
		int max = 0;
		int sum = 0;
		int count = 0;
		double avg = 0.0;
		
		//user ���� ����
		Scanner scan = new Scanner(System.in);
		
		while (run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5. ����");
			System.out.println("-------------------------------------------------------------");
			System.out.print("��ȣ�� �Է��ϼ���> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			
			if (selectNo ==1 ) {
				System.out.print("�л� ���� �Է��ϼ��� > ");
				//studentNum = scan.nextInt();
				studentNum = Integer.parseInt(scan.nextLine());
				scores = new int[studentNum];
			} else if(selectNo == 2 ) {
				for(int i=0; i<scores.length; i++) {
				System.out.print("score ["+ (i+1) +"] >");
				scores[i] = Integer.parseInt(scan.nextLine());
				}				
			} else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println((i+1)+"��° �л��� ������ "+scores[i]+"�Դϴ�.");
				}
			} else if(selectNo == 4) {
								
				for(int i=0; i<scores.length; i++) { 
					sum+=scores[i];
									}
				for(int i=0; i<scores.length; i++) {
					//max = (max<scores[i] ? scores[i] : max;
					if(max<scores[i]) {
						max=scores[i];
					}
				}//for
				avg = sum/studentNum;
				
				System.out.println("������ " + sum + "�Դϴ�.");
				System.out.println("����� " + avg + "�Դϴ�.");
				System.out.println("�ְ����� "+ max +"�� �Դϴ�.");
			} else if(selectNo==5) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				run = false;
				break;
			}
		}//while
	}//main
}//class
