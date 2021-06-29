package pk16;

import javax.swing.JOptionPane;

public class StaticInner {

	int a = 10;
	private int b =100;
	static int c =300;
	
	static class Inner {
		
		static int d=1000;
		
		public void getData() {
			//스테이틱인 c와 힙메모리를 쓰는 a,b메모리 위치가 달라서 a,b와 c의 생존주기가 달라서 
			//System.out.println("int a : " + a);
			//System.out.println("private int b : " + b);
			System.out.println("static int c : " + c);
		}//getData
	}//class
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//방법1 : 바로 진입
		Inner inner = new Inner();
		inner.getData(); // void이기 때문에 return값이 없어서 저장이 불가능!
		//방법2 : 메인 클래스를 이용했으므로 바로 사용가능
		StaticInner.Inner inner1 = new StaticInner.Inner();
		inner1.getData();
		
		
	}

}
