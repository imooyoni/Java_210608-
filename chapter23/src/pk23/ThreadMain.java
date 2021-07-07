package pk23;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//has a 방식 사용
		ThreadEx t = new ThreadEx();
		
		t.start();//run 메서드가 호출됨! 독립적으로 스레드를 실행시켜! >> 스레드에는 런메서드가 항상 있어야 함!
		//t.run();//일반 메서드이므로 독립적으로 실행할 수 없다.
		//구현되어 있는 run을 구현되어 있는 스레드로 실행하고 싶다면 t.start()로 호출해야 한다.
		
		System.out.println("메인 클래스입니다!");//조인을 걸어주지 않으면 메인이 먼저 돌고 스레드가 실행
		System.out.println();
	}

}
