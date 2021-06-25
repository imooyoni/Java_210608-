package Exam;

import java.lang.reflect.Array;
import java.util.Scanner;

//while
public class Example09 {

	public static void main(String[] args) {
		
		boolean run = true; // 인트 넘버, select 넘버 5 브레이크
		
		int studentNum = 0;
		int[] scores = null;//안써도 됨! int[]score = new int[];
		
		int max = 0;
		int sum = 0;
		int count = 0;
		double avg = 0.0;
		
		//user 숫자 선택
		Scanner scan = new Scanner(System.in);
		
		while (run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
			System.out.println("-------------------------------------------------------------");
			System.out.print("번호를 입력하세요> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			
			if (selectNo ==1 ) {
				System.out.print("학생 수를 입력하세요 > ");
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
					System.out.println((i+1)+"번째 학생의 점수는 "+scores[i]+"입니다.");
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
				
				System.out.println("총합은 " + sum + "입니다.");
				System.out.println("평균은 " + avg + "입니다.");
				System.out.println("최고점은 "+ max +"점 입니다.");
			} else if(selectNo==5) {
				System.out.println("프로그램이 종료되었습니다.");
				run = false;
				break;
			}
		}//while
	}//main
}//class
