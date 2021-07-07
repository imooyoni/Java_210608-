package pk23;

import java.util.Scanner;

/*
스캐너를 이용하여 키보드에서 숫자를 입력받고
스레드에서 입력받은 숫자가 1씩 감소하다가 0이 되었을 때
“종료”라는 메시지와 함께 스레드를 빠져나오도록
 */
public class ThreadCount {
	
	private int n;
	
	public ThreadCount(int n) {
		this.n=n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하세요 > ");
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		
		ThreadCount tc = new ThreadCount(i);
		Thread t = new Thread();
		
		try {
			for(int j=i; j>=0; j--) {
				System.out.println(j);
				Thread.sleep(1000);
			}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("스레드 종료");
	}//main
}//class
