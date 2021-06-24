package Exam;

import java.util.Scanner;

public class Example12 {
	public static void main(String[] args) {
		
		/*  
		 학생들의 수학과 영어성적을 등록하는 프로그램이 있다.
		 프로그램을 실행하면 몇 명의 정보를 저장 할 것인지를 입력받은 후,
		 입력받은 수 만큼 학생들의 이름과 수학성적, 영어성적을 입력받는 프로그램 작성 
		 */
		Scanner scan = new Scanner(System.in);
				
		System.out.print("등록할 인원수 : ");
		int n = scan.nextInt();
		
		String str[][]=new String[n][3]; // n=1 1행 3열, +1마다 3개(이름, 수학, 영어)를 입력가능
		
			for (int i = 0; i<str.length; i++ ) {
				System.out.print("이름 : ");
				str[i][0] = scan.next();
				
				System.out.print("수학 : ");
				str[i][1] = "수학 : " + scan.next();
				
				System.out.print("영어 : ");
				str[i][2] = "영어 : " + scan.next();
				System.out.println("--------------------");
			}
			
			System.out.println(str.length + "명 등록 완료!!");
			for(int i=0; i<str.length; i++) {
				for(int j=0; j<str[i].length; j++) {
					System.out.print(str[i][j]+"/");
				}
				System.out.println();
		}
		
		
		
	
}
}
