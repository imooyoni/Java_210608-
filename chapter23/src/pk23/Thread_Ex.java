package pk23;

public class Thread_Ex extends Thread {

	private int[] temp;
	
	public Thread_Ex() {
		// TODO Auto-generated constructor stub
		temp=new int[10];
		
		for (int i =0; i<temp.length; i++) {
			temp[i]=i;
		}
			
	}
	//스레드 클래스에서는 스레드를 작동하기 위해서 반드시 run호출이 있어야 함!
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i:temp) {
			
			try {
				Thread.sleep(1000); //1초 대
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			System.out.println("temp : " + temp[i]);
		}
		System.out.println("스레드 종료");
	}
	
	
	
}
