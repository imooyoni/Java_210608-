package pk23;


public class Thread_Ex_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_test1 t1 = new Thread_test1();
		Thread_test2 t2 = new Thread_test2();
		
		t1.start();
		t2.start();
		
		//실행하면 스레드는 동시에 진행되거나 순서대로 진행되는 것이 아니고
		//번갈아가면서 실행
	}

}
