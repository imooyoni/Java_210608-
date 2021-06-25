package pk8;

public class AccessEx {
	private int aa;//은닉화(동일 클래스에서만 사용가능)
	public int bb; //공통
	int cc; //패키지가 같으면 사용가능
	
	public void SetA(int a) { //aa는 프라이빗이지만 메서드는 퍼블릭이라 메서드를 통해서 나가는 것은 허용됨
		aa=a;//private 이여도 public 메서드를 통해서 외부에서 사용가능
	}
	
	public void SetB(int b) {
		bb=b;	
	}
	
	public void SetC(int c) {
		cc=c;
	}
	
	public void Disp() {
		System.out.println("\naa값 : " + aa + "\nbb값 : " + bb + "\ncc값 : " + cc);
	}//class off
	
	public static void main(String[] args) {
		AccessEx obj = new AccessEx();
		/*
		obj.aa = 10; 멤버변수에 직접접근가능
		obj.bb = 20;
		obj.cc = 30;
		*/
		
		obj.SetA(10);//메서드로 변수방 초기화
		obj.SetB(20);
		obj.SetC(30);
		
		obj.Disp();
		
	}
}

