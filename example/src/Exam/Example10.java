package Exam;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int studentNum = 0;
		int scores[] = null;
		boolean run = true;
		int grade = 0;
		int sum = 0;
		double avg = 0.0;
		int max = 0;

		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1. �븰�깮�닔 | 2. �젏�닔�엯�젰  | 3. �젏�닔由ъ뒪�듃 | 4.遺꾩꽍  | 5. 醫낅즺");
			System.out.println("-------------------------------------------------------");
			System.out.print("�꽑�깮 > ");

			a = s.nextInt();

			switch (a) {

			case 1:
				System.out.print("�븰�깮�닔 �엯�젰 : ");
				studentNum = s.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print(i + 1 + "踰덉㎏ �븰�깮�쓽 �젏�닔 �엯�젰 : ");
					grade = s.nextInt();
					scores[i] = grade;

				}
				break;
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "踰덉㎏ �븰�깮�쓽 �젏�닔�뒗 ->" + scores[i]);
				}
				break;

			case 4:
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if(scores[i]>=max) {
						max = scores[i];
					}
				}
				
				avg = (double) sum / scores.length;
				System.out.println("�젏�닔�쓽 珥앺빀�� : " + sum);
				System.out.println("�룊洹좎� : " + avg);
				System.out.println("理쒕�媛�  : "+max);
				break;
			case 5:
				run = false;
				break;
			}//switch
		}//while
		
		System.out.println("�봽濡쒓렇�옩 醫낅즺�릺�뿀�뒿�땲�떎.");

	}//main

}//class


