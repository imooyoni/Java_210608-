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
			System.out.println("1. 학생수 | 2. 점수입력  | 3. 점수리스트 | 4.분석  | 5. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택 > ");

			a = s.nextInt();

			switch (a) {

			case 1:
				System.out.print("학생수 입력 : ");
				studentNum = s.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print(i + 1 + "번째 학생의 점수 입력 : ");
					grade = s.nextInt();
					scores[i] = grade;

				}
				break;
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번째 학생의 점수는 ->" + scores[i]);
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
				System.out.println("점수의 총합은 : " + sum);
				System.out.println("평균은 : " + avg);
				System.out.println("최대값  : "+max);
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료되었습니다.");

	}

	}


