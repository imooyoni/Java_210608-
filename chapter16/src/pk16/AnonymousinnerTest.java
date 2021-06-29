package pk16;

class Outter2 {
	
	Runnable getRunable(int i) {
		int num=100;
		
		
		//클래스 명이 생략됨
		//class Inner {~
		return new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//num=200; Error 생명주기가 다름
				//i=500; Error 생명주기가 다름
				
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	//익명의 클래스 >> 자바랭!
	Runnable runner = new Runnable() {//runner가 메서드 
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Runnable이 재구현됨");
		}
	};
}



public class AnonymousinnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter2 outter = new Outter2();
		Runnable runnerable=outter.getRunable(10);
		
		runnerable.run();
		
		outter.runner.run();

	}

}
