package Exam;

import java.util.Scanner;

public class UserInfoMain {

	public static void main(String[] args) {
		//변수선언
		int select;
		int money=0;
		
		//객체선언
		Scanner scan = new Scanner(System.in);
		UserInfo ui = new UserInfo();
		
		//while
		outer: while(true) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.입 금 | 2.출 금 | 3.잔액확인 | 4.종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("업무 선택 > ");
			//스캔입력
			select = scan.nextInt();
			//switch
			switch(select) {
			case 1:
				System.out.println("-- 입 금 --");
				System.out.print("입금할 금액을 입력하세요. > ");
				money=scan.nextInt();
				
				ui.deposit(money);
				break;
				
			case 2:
				System.out.println("-- 출 금 --");
				System.out.print("출금할 금액을 입력하세요. > ");
				money=scan.nextInt();
				
				ui.withdraw(money);
				break;
				
			case 3:
				System.out.println("--잔액확인--");
				System.out.println(ui.showMoney()+"원");
				break;
				
			case 4:
				System.out.println("거래종료");
				break outer;
			}//switch
		}//while
			
			
	}//main
}//class
