package pk16;

public class AnonyInner {
	
	public void test() {
		
		//클래스 정의가 생략
		new TestInter() {

			@Override
			public void printData() {
				// TODO Auto-generated method stub
				System.out.println("익명의 클래스");
				
			}
			
			
		}.printData(); 
		//테스트인터에 들어가면 정의가 되지 않은 프린트데이터가 있음!
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonyInner ani = new AnonyInner();
		ani.test();
	}

}
