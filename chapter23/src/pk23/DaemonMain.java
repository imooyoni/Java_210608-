package pk23;


public class DaemonMain implements Runnable{//보조스트림과 유사한 역할을 함

	static boolean autoSave = false; //flag 역할을 함!

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
		
			try {
				Thread.sleep(3000);//3초마다
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			if (autoSave == true) {
				System.out.println("자동 저장되었습니다.");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//데몬스레드는 일반스레드를 돕는 보조적인 역할을 수행한다.
		//함께 구동중이던 일반 스레드가 종료되면 데몬도 자동으로 종료됨 (일반에 종속되어 있음)
		
		//문서작성 도중 3초 간격으로 자동저장이 필요하다고 가정하고 구현
		
		DaemonMain dm = new DaemonMain();
		Thread t = new Thread(dm);
		
		//t객체는 스레드가 데몬스레드임을 명시
		//메인스레드가 종료될 때 같이 종료(true일때)
		t.setDaemon(true);
		
		//run()실행
		t.start();
		
		for(int i=1; i<=15; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}//catch
			System.out.println(i);
			if (i==3) {
				autoSave=true; 
				//3 되었을때, for문이 이미 2번 돌고 찍고 올라가는데, 여기에 while로 올라가면 3초 후 부터 찍히니까 5초 후 부터 자동 저장됨!
			}//if
		}//for
	}//main
}//class
