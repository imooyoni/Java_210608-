package pk5;

import java.util.Scanner;

public class Result {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String ID=scan.nextLine(); //smile
		
		System.out.println("비밀번호 : ");//클래스에서 받은 변수(=인스턴스변수)
		String PW=scan.nextLine();// String 은 냉장고, int는 냉장고 안에 있는 재료
		
		//비번 형변환(string -> int)
		int pass = Integer.parseInt(PW); 
		//클래스에서 따온 아이들을 클래스에서 변환해주기 위해서 integer사용 
		
		//아이디가 맞으면 비밀번호 확인으로 넘어가서 비밀번호
		
		if (ID.equals("smile")) {//equals 같냐? 데이터베이스에 있는 거랑 smile이랑 같냐?
			if (pass == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("로그인 실패: 존재하지 않는 아이디 입니다.");
		}//else
	
	}//main

}//class

//Syntax error = 오타