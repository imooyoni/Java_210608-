package Exam;

import java.util.Scanner;

public class Example02_T {
	
	public static void main(String[] args) {
		
		//변수선언
		
		int n1=0, n2=0;
		int result=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하세요: ");
		n1=scan.nextInt();
		
		System.out.println("두번째 수를 입력하세요: ");
		n2=scan.nextInt();
		
		if(n1>n2) {
			int temp=n1;
			n1=n2;
			n2=temp;
		}
		//for문을 이용하여 합을 구함
		for (int i=n1; i<=n2; i++) {
			result +=i;
		}
		System.out.println("결과 : "+result);
	}

}
