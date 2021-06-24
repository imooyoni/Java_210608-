package Exam;

import java.util.Scanner;

public class Example04_T {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 0;
		
		Scanner scan = new Scanner( System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		n1 = scan.nextInt();
		
		System.out.print("두번째 숫자 입력 : ");
		n2 = scan.nextInt();
		
		//최소 공배수
		//반복문을 이용하고 그 안에 if문으로 두 수가 나누어 떨어질때까지 반복
		int i = 0;
		/*
		for (i=1; i<=n1*n2; i++) {
			if (i % n1 == 0 && i%n2 == 0)
				break;
		}
		*/
		
		while(true) {
			i++;
			if (i % n1 == 0 && i%n2 == 0)
				break;
		}
		System.out.println(n1 + "과(와) " + n2 + "의 최소공배수 : " + i);
		
	}

}
