package pk16;

public class LocalInnerTest {

		int a=100; //필드
		
		public void innterTest(int n) { //로컬메서
			
			int b=200; //지역변수
			final int c = n; //상수
			class Inner {
				public void getData() {
					System.out.println("int a : "+a);
					System.out.println("int b : "+b);
					System.out.println("final int c : "+c);
					
				}//getData
			}//내부클래스
			//============================멤버변수=================================
			Inner inner = new Inner();
			inner.getData();
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerTest lit = new LocalInnerTest();
		lit.innterTest(500); //outter에서 정의한 메서드(내부클래스가 아님)
	}

}
