package pk5;

import java.util.Scanner;

public class IfExample08 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		//new가 붙(은 것은 인스턴스 변수)는 이유는 클래스 내에 새로운 심부름 꾼임을 선언
		//클래스 내에 새로 생기는 변수들은 필요한 만큼만 메모리를 할당 받음!
		
		//* new가 붙은 것들은 새로 메모리를 받은 것을 의미함 
		// >> 할당 받은 이후에는 scanner 클래스 내에 모든 기능을 사용할 수 있음
		
		System.out.print("첫 번째 수 : ");
		
		double num1=Double.parseDouble(scan.nextLine()) ; //nextLine():기본 자료형이 스트링(String)이다.
		//int num //4byte int를 선언하면 4byte를 주는 것!
		
//		System.out.println(num1);
		
		System.out.print("두 번째 수 : ");
		
		double num2=Double.parseDouble(scan.nextLine()) ; //nextLine():기본 자료형이 스트링(String)이다.
		//int num //4byte int를 선언하면 4byte를 주는 것!
		
//		System.out.print(num2); // 1번째 double 수행하기 전까지는 두번째 double이 노출되지 않음!
		
		//반드시 기억하고 있어야함!
		if (num2 != 0.0) { //나누어지는 수 피제수, 나누는 수 제수 
			System.out.println("결과 : " + (num1/num2));
		}else {
			System.out.println("0으로 나눌 수 없습니다."); //나누기 처리 할때는 나눌 수 없는 경우의 수 항상 언급해주기!
		}
		
		
	}

}
