package pk23;

public class Thread_Ex_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//has a 방
		Thread_Ex t1 = new Thread_Ex();
		t1.start();
		
		try {
			Thread.sleep(2000); //2000>>2sec
			System.out.println("프로그램 종료");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
