package Exam;

import java.util.Scanner;

public class Example04 {
 
	public static void main(String[] args) {
		
		/* 키보드에서 두 수를 입력받아, 입력받은 두 수의 최소공배수 구하기.
		 * 예) 2와 5를 입력 : 2 4 6 8 10 (배수 중에서 나누었을 때 나머지가 0인 수 인출)
		 * 				   5 10 15 20
		 * 
		 * 	*두 수의 곱보다 작은 수 까지만 돌리면 됩
		 */
		
		//변수 선언
		int num1, num2, a ;
		
		//스캐너 객체
		Scanner scan = new Scanner(System.in); //int는 stack 메모리에 저장됨, scan은 heap 메모리에 저장됨!
		
		System.out.print("첫번째 수를 입력하세요 : ");
		num1 = scan.nextInt();
		
		System.out.print("두번째 수를 입력하세요 : ");
		num2 = scan.nextInt();
		
		a = num1 * num2;
		
		//최소공배수
		for (int i=1; i<=a; i++) {
			/*
			num1 = num1 * i;
			num2 = num2 * i;
			
			if(a % num1 == 0 || a % num2 == 0)
			*/
			
			if(i % num1 == 0 && i % num2 == 0)
				break;
			
			// System.out.println("최고공배수는 : " + a);
		}
		System.out.println("최고공배수는 : " + a);
		//반복문
		
	}
}
