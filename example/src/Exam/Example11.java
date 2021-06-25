package Exam;

import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {

		
		//키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다.
		//입력받은 문자열에 소문자 a가 몇개 있는지를 판별하는 로직을 구현하시오
		
		//예) 문자입력>aaksdhakdkfnkgkasaa
		//답) a의 갯수>6개
		Scanner scan = new Scanner(System.in);
		
		String str;
		int count=0;
		
		System.out.print("입력>> ");
		str = scan.next(); //문자(char)의 배열 = String
				
		//입력 // for//if
		//str.charAt(i)=='a' //string 배열에 가서 char 하나씩 읽어 오겠다.
				
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a') {
				count++;
			}//if
		}//for
		System.out.println("a의 갯수 >> " +count);
	}

}
