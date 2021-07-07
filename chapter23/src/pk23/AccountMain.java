package pk23;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		
		Runnable r = new AccountThread(acc);//accountthread가 러너블로 되어 있어서 타입이 러너블인것!
		Thread t1 = new Thread(r);
		
		t1.start();
		
		while(true) {
			System.out.println("출금 중 입니다.");
			Scanner scan = new Scanner(System.in);
			
			int n = scan.nextInt();
			acc.deposit(n);
		}
	}
}
