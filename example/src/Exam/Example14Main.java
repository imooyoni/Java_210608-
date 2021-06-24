package Exam;

import java.util.Scanner;

public class Example14Main {

	public static void main(String[] args) {
		
		Example14 ws = new Example14();
		
		String ans = ws.getAnswer();//정답 반환 메서드 호출
		
		//가져온 단어를 섞어서 변수방에 넣기
		String question = ws.getScrambleWord(ans);
		
		System.out.println("문제 : " + question);
		
			//boolean run;
		while (true) {
			
			System.out.print("단어는? : ");
			Scanner scan = new Scanner(System.in);
			String str = scan.next();
			
			if(str.equalsIgnoreCase(ans)) {//대소문자 구분하지 않고 같냐?
				System.out.println(str + "정답!!");
				break;
			} else {
				System.out.println(str + "오답... :(");
			}
			
		}
	}

}
