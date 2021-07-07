package pk23;

public class Thread_test1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0; i<50; i++) {
			System.out.println((i+1)+"번째" + "1");
		}
	}
	
	

}
