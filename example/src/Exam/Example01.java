package Exam;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
		/* Scanner를 통해 정수 n을 입력받는다.
		    그리고 1부터 입력받은 정수 n까지의 합을 계산하여 그 결과를 출력하시오.
			ex) scan으로 5를 입력 : 1+2+3+4+5 의 출력결과  15를 콘솔에 출력
		 */
		System.out.println("숫자를 입력하세요 : ");
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		int sum=0; // 값을 아래에서 정해주지 않을 거면 초기화할때 정해줘라!
		
		n=scan.nextInt(); //콘솔에 숫자를 받아라!
		
		for (int i = 1;i<=n ; i++) { //i가 1부터 시작해서 입력받은 n까지 1씩 더해라!
			sum+=i; //0인 sum에 i의 값을 더해라! 
		}
				System.out.println("결과 : " + sum); //n까지 다 더했으면 결과 값을 뿌려라!
	}
}
//initialized : 초기화가 되지 않음 오류