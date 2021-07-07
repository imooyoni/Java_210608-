package pk23;

import java.util.Scanner;

public class ThreadCount_runnable implements Runnable{
	
	private int n;

	public ThreadCount_runnable(int n) {
		this.n=n;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = n; i>=0 ; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			}
			catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			}
		}//for
		System.out.println("스레드 종료");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하세요 > ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ThreadCount_runnable tc = new ThreadCount_runnable(n);//
		Thread t = new Thread(tc);
		
		t.start();
		
	}//main
}//class
