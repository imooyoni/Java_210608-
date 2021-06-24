package pk5;

import javax.swing.JOptionPane;

public class SwitchCase02 {

	public static void main(String[] args) {

		//1: 예금 조회 2: 출금 3: 입금 4: 이체 그외:잘못 누르셨습니다.
		
		int Num;
		Num=Integer.parseInt(JOptionPane.showInputDialog("번호를 입력하세요.(1~4)"));
		
		switch(Num) {
		
			case 1:
				System.out.println("예금 조회 을/를 선택하셨습니다.");
				break;
				
			case 2:
				System.out.println("예금 출금 을/를 선택하셨습니다.");
				break;
				
			case 3:
				System.out.println("예금 입금 을/를 선택하셨습니다.");
				break;
				
			case 4:
				System.out.println("계좌이체 을/를 선택하셨습니다."); 
				// 이후에 웹으로 넘어가서 계좌이체를 할 수 있는 기능으로 넘어가야함
				break;
				
			default :
				System.out.println("번호를 잘못 입력하셨습니다.");
		}//switch 종료
	}//main 종료

}//class 종료
