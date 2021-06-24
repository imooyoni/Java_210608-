package pk8;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		//변수 선언
		int money;
		String select = "";
		
		//객체선언
		Scanner scan = new Scanner(System.in);
		Vending ven = new Vending();
		
		ven.init(); //음료수 셋팅완료
		
		//입력받아 showCans 호출
		System.out.print("돈을 투입하세요 > ");
		money = scan.nextInt();
		
		ven.showCans(money);
		
		System.out.print("음료수를 선택하세요 > ");
		select=scan.next();
		
		ven.outCan(select);
		
		
		//입력받아 outCan 호출
				//돈을 입력하는 것을 스캔받아, 음료를 선택해, showcans로 음료 보여줘, 음료 입력해
		
	}

}
