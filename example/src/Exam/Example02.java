package Exam;

import java.util.Scanner;

public class Example02 {
	
	public static void main(String[] args) {
		
		/* Scanner를 통해 정수 n1, n2을 입력받는다.
	    그리고 n1부터 n2까지의 합을 계산하여 그 결과를 출력하시오.
		ex) scan으로 5, 2를 입력 : 2+3+4+5 의 출력결과  15를 콘솔에 출력
	 */
		
		Scanner scan = new Scanner(System.in);
		
		//변수선언
		
		int n1;
		int n2;
		int result=0;
		
		System.out.print("첫번째 수를 입력하세요: ");
		n1 = scan.nextInt();
		
		System.out.print("두번째 수를 입력하세요: ");
		n2 = scan.nextInt();
		
		//혹시 큰수가 n1에 입력되면 스왑(교체알고리즘)을 이용하여 작은수가 n1에 오도록
		
		if (n1>n2) {
			int a = n1;
			n1 = n2;
			n2 = a;
		} for (int i=n1; i<=n2; i++) {
			result += i;
		}
		
		System.out.println("결과값 : " + result);
		
				
	}

}