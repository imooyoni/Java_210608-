package pk23;

public class Thread_Main implements Runnable{

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
		Thread_Main t1 = new Thread_Main();
		
		Thread mThread = new Thread(t1);//자바 JDK에서 기본 제공함, 객체를 가져올 수 있음!
		mThread.start(); //run()호출
		System.out.println("메일클래스 종료!");
		
	}

	//메인클래스가 실행된 후에 스레드의 객체를 호출하고 start()를 사용하여 run()이 호출됨

}
