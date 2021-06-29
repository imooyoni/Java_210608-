package pk16;

import java.util.Scanner;

public class EnumMain {
	
	public enum Item {//클래스화 된 배열 enum: 나열하다
		Start, Pause, Exit
	//item의 0번째, item의1번째, item의 2번째
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("0: 게임시작");
			System.out.println("1: 게임정지");
			System.out.println("2: 게임종료");
			
		Scanner scan = new Scanner(System.in);
		System.out.print("번호를 입력하세요 : ");
		int n = scan.nextInt();
		
		Item start = Item.Start;
		Item pause = Item.Pause;
		Item exit = Item.Exit;
		
		System.out.println(start.ordinal());
		
		if(n==start.ordinal())
			System.out.println("게임이 시작됨");
		else if(n==pause.ordinal())
			System.out.println("게임이 일시정지됨");
		else {
			System.out.println("게임종료");
			return;
		}
		}
	}

}
