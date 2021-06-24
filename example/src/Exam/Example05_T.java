package Exam;

import java.util.Scanner;

public class Example05_T {

	public static void main(String[] args) {
		
		int n1, n2;
		int check=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		n1 = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		n2 = scan.nextInt();
		
		if (n1 >= n2) 
			check=n2; //작은수 추출
		else 
			check=n1;
		
		//for / while문 >> 두 수 중에 작은 수 추출 
				//for (작은 수 ; 1보다 작거나 같을때까지 ;i--)
		int i;
		for(i= check; i>=1; i--) { //작은 수를 이용해서 i가 작은 수에서 시작해서 1씩 줄이는데 1보다 크거나 같을때까지 반복
			if (n1 % i == 0 && n2 % i == 0) {
			break;
			}
		}
		//출력
		if (i==1 ) {
			System.out.println("최대공약수가 없습니다.");
		} else {
			System.out.println(n1 + "과(와) " + n2 + "의 최대공약수 : " + i);
		} //else
			
		}//main
		/*
		int a = n1;
		n1 = n2;
		n2 = a;
				
		for (i = n2; i1; i--) {
			if (i % n1 == 0 && i%n2 == 0)
				break;
		*/
}//class

