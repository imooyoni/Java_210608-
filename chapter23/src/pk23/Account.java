package pk23;

public class Account {

	int balance=1000;
	
	//출금 메서드. synchronized : 자원을 공유하지 않은 상태 (작업하는 동안 동시 접속불가능)
	public synchronized void withdraw(int money) {//은행에서는 데이터베이스 커밋을 꼭 해줘야해!
		//잔액 출금보다 적을 경우
		if(balance < money) {
			System.out.print("잔액이 부족합니다. 입금하세요 > ");
			try {
				wait(); //일시정지 스레드
			} catch (Exception e) {
				// TODO: handle exception
			}//try-catch
		}//if
		balance -= money;
	}//withdraw
	
	public synchronized void deposit(int money) {
		balance += money;
		notify();//정지된 스레드 하나 들어옴!
	}
}
