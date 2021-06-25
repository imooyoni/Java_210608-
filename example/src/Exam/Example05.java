package Exam;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/* 키보드에서 두 수를 입력받아, 입력받은 두 수의 최대공약수 구하기.
		 * 예) 4와 10을 입력 : 1 2 4 
		 * 				    1 2 5 10
		 * 	  3과 7을 입력 : 1 3
		 * 				   1 7
		 * 
		 * 	*두 수의 곱보다 작은 수 까지만 돌리면 됩
		 */
		
		//변수 선언
		int n1, n2;
		
		
		//두 수 스캔 객체
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		n1 = scan.nextInt();
		
		System.out.print("두번째 숫자 : ");
		n2 = scan.nextInt();
		
		if (n1>n2) {
		int a = n1;
		n1 = n2;
		n2 = a;
		/*		
		for (i = n2; ; i--) {
			if (i % n1 == 0 && i%n2 == 0)
				break;
		}*/
		
		//for / while문 >> 두 수 중에 작은 수 추출 
		//for (작은 수 ; 1보다 크거나 같을때까지 ;i--)
		}
	}
}
