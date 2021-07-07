package pk23;

public class ThreadEx extends Thread{
	
	//프로그램 > 프로세스 > 스레드
	//프로그램이 실행될 때 같이 실행되고 죽을 때 같이 죽는 것 > 조인되어있다고 함!
	//스레드는 독립적으로 사용됨!

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//프로세스에 독립적인 작업을 수행하는 영역
		for (int i=0; i<10; i++) {
			System.out.println((i+1)+"스레드 실행");
		}
	}
	
	

}
