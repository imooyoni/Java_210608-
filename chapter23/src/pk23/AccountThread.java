package pk23;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;

public class AccountThread implements Runnable{
	
	Account acc;
	
	public AccountThread(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			try {
				Thread.sleep(1500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			//출금은 100~300원 사이의 난수로 지정
			int money = (new Random().nextInt(3)+1)*100;
			acc.withdraw(money);
			System.out.println("잔액 : " + acc.balance);
		}
	}

	
	
}
