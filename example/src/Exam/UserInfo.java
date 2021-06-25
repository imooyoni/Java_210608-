package Exam;

public class UserInfo {


		/* UserInfo클래스를 만든 뒤, 금액을 저장할 money라는 변수를 만든다.
		deposit(int money)메서드를 만들어 유저가 돈을 입금했을 경우를 처리.
		withdraw(int money)메서드를 만들어 유저가 돈을 출금했을 경우를 처리.
		단 이 메서드에는 출금하고자 하는 돈 보다 잔액이 적을경우 잔액이 부족하다는 메시지가 출력되도록 한다.
		showMoney()메서드를 만들어 현재 잔액을 반환하도록 한다.

		UserInfo클래스는 여기까지. 
		//
		Main클래스를 새로 만들어 UserInfo형 객체를 생성한 뒤 아래의 결과가 나오도록 해보자. 
		
		1.입 금 :
		2.출 금 :
		3. 잔액확인 : 
		4. 종 료 :
		
		-- 입 금 --
		입금할 금액을 입력 : 1000
		입금성공
		
		---------------------
		-- 출 금 --
		출금할 금액을 입력 : 1000
		출금 후 잔액 : 
		출금성공
		잔액보다 출금액이 클 경우 잔액부족
		*/
		
		
		//필드
		private int money;//잔액
		
		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}

		//입금
		public void deposit(int money) {
			System.out.println(money + "원을 입금했습니다.");
			this.money+=money;
			
		}//deposit
		
		//출금
		public void withdraw(int money) {//userinfo의 머니에서 메인 머니를 뺏을 때 음수이면 잔액부족
			if (this.money>=money) {
				System.out.println(money + "원을 출금했습니다.");
				this.money-=money;
			}
			else if (this.money<money) {
				System.out.println("잔액이 부족합니다. 현재 잔액 : " + this.money);
			}
		}//withdraw
		
		//리턴메서드
		public int showMoney() {
			return money;
		}
		

}//class
