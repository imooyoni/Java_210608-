package Exam;

import java.util.Random;
import java.util.Scanner;

public class Example03 {
	
	public static void main(String[] args) {
		
		// 컴퓨터가 랜덤으로 발생시키는 수
		//1~9 사이의 수를 입력하세요:
		/* 
		 첫번째 수를 입력 하세요 : 4 
		 두번째 수를 입력 하세요 : 5 
		 세번째 수를 입력 하세요 : 6
		 
		 2Strike 0Ball
		 >> 세 자리의 숫자가 다 맞을 때 까지 계속 반복! >> while 문
		 
		 첫번째 수를 입력 하세요 : 7 
		 두번째 수를 입력 하세요 : 8 
		 세번째 수를 입력 하세요 : 9
		 OUT!!
		 
		 첫번째 수를 입력 하세요 : 1 (4) 
		 두번째 수를 입력 하세요 : 6 (1)
		 세번째 수를 입력 하세요 : 5 (6)
		 0Strike 2Ball
		 
		 첫번째 수를 입력 하세요 : 4 
		 두번째 수를 입력 하세요 : 1
		 세번째 수를 입력 하세요 : 6
		 WIN!!
		  */
		
		Scanner scan = new Scanner(System.in);
		
		int com1 = 0;
		int com2 = 0;
		int com3 = 0;
		
		do {
		com1 = new Random().nextInt(9)+1;
		com2 = new Random().nextInt(9)+1;
		com3 = new Random().nextInt(9)+1;
		}  while (com1==com2 || com1==com3||com2==com3) ;
		
		System.out.print(com1);
		System.out.print(com2);
		System.out.println(com3);
		
		int user1=0;
		int user2=0;
		int user3=0;
		
		while(true) {
			System.out.println("1에서 9까지의 수를 입력하세요.");
			
			System.out.print("첫번째 수를 입력 하세요: ");
			user1 = scan.nextInt();
			System.out.print("두번째 수를 입력 하세요: ");
			user2 = scan.nextInt();
			System.out.print("세번째 수를 입력 하세요: ");
			user3 = scan.nextInt();
			
			int strike=0;
			int ball=0;
			
			//만약에 사용자가 입력한 첫번째 play숫자와 com1이랑 같으면 : strike 1점 획득
			//user1를 기분으로 숫자는 맞지만 자리수가 다를 경우 볼로 판정 : ball 1점 획득
			//===================================================================
			
			
			if (user1 == com1) {
				strike++;		
			}else if (user1 == com2 || user1==com3) {
				ball++;
			}
				//만약에 사용자가 입력한 두번째 play 숫자와 com2가 같으면 : strike 1점 획득
				//user2를 기분으로 숫자는 맞지만 자리수가 다를 경우 볼로 판정 : ball 1점 획득
				//===================================================================
			if (user2 == com2) {
				strike++;
			}else if (user2 == com1 || user2 == com3) {
				ball++;
			}
				//만약에 사용자가 입력한 세번째 play 숫자와 com2가 같으면 : strike 1점 획득
				//user3를 기분으로 숫자는 맞지만 자리수가 다를 경우 볼로 판정 : ball 1점 획득
				//===================================================================
			if (user3 == com3) {
				strike++;
			}else if (user3 == com1 || user3 == com2){
				ball++;
			}
			
			
			if (strike ==0 && ball == 0) {
				System.out.println("OUT!!");
			} else if (strike == 3) {
				System.out.println("WIN!!");
				break;
			} else {
			System.out.println(strike + " strike " + ball + " ball");
			}
			
			
			//strike 3점이면 WIN!! 출력 후 종료
			//
			
			//strike 0 || ball 0 OUT!!
				
				
			//숫자는 맞지만 자리수가 다를 경우 볼로 판정 : ball 1점 획득
			
				//1~9 사이의 수를 입력하세요:
			/* 
			 첫번째 수를 입력 하세요 : 4 
			 두번째 수를 입력 하세요 : 5 
			 세번째 수를 입력 하세요 : 6
			 
			 2Strike 0Ball
			*/
		}
		
	}
}
