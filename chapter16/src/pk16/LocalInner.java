package pk16;

class Outter {
	//외부필드
	int outNum=100;
	static int sNum=200;
	
	//java.lang.Thread #run()을 사용하기 위함
	//Runnable은 매개변수(int i)와 지역변수는 final처럼 사용된다.
	Runnable getRunnable(final int i) {
		final int num=100;
		
	class MyRunnable implements Runnable{
			int localNum = 10;
		
		@Override
		public void run() {//thread처리 runnable로 익명의 클래스를 이용해 처리
			// TODO Auto-generated method stub
			//num=200; //Runnable이므로 상수로 바뀜
			//i=100; //Runnable이므로 매개변수 역시 상수로 바
			
			System.out.println("i =" +i);
			System.out.println("num =" +num);
			System.out.println("localNum =" +localNum);
			System.out.println("Outter.outNum =" +outNum + "외부인스턴");//재정의만 하지 않으면 사용하는데는 상관없음!
			System.out.println("Outter.sNum =" +Outter.sNum+"외부 static 변수");
			
			
			
		};//run
	}//MyRunnable
	return new MyRunnable();
		
	}//getRunnable
	
}//Outter

public class LocalInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outter out = new Outter();
		Runnable runner = out.getRunnable(10);
		runner.run();
		
	}

}
