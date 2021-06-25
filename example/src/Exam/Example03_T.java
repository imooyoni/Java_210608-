package Exam;

import java.util.Random;
import java.util.Scanner;

public class Example03_T {
	
	public static void main(String[] args) {
		
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
				
			if (user1 == com1)
				strike++;
			
			else if ((user1 == com2) || (user1== com3))
				ball++;
			
			if (user2 == com2)
				strike++;
			
			else if ((user2 == com1) || (user2 == com3))
				ball++;
			
			if (user3 == com3)
				strike++;
			
			else if ((user3 == com1) || (user3 == com2))
				ball++;
			
			//strike 3점이면 WIN!! 출력 후 종료
			if (strike == 3) {
				System.out.println("WIN !! - " + com1 + com2 + com3);
				break;
				
			//strike 0 ball 0 OUT!!
			} else {
					if((strike>0)||(ball>0))
						System.out.println(strike + " Strike " + ball + " Ball");
					else //아무것도 맞추지 못했을 경우
						System.out.println("OUT !!");
				}//else
			}//if
	
	}//while

}//main
