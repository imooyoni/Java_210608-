package pk23;

public class ThreadJoin implements Runnable{ //위에서 아래 왼쪽에서 오른

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run()");
		first();
	}
	
	public void first() {
		System.out.println("first()");
		second();
	}
	
	public void second() {
		System.out.println("second()");
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인클래스 시작");
		ThreadJoin t1 = new ThreadJoin();
		
		Thread mthread = new Thread(t1);//스레드 조인이라는 메인클라스가 스레드화 되어서 들어감!
		mthread.start();//run이 호출됨!
		
		try {
			mthread.join(); //run이 작업을 마칠 때까지 메인이 기다려줌! 연결이 되어 있기 때문!
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("메인클래스 종료");
		
		
	}


}
