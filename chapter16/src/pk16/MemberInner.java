package pk16;

public class MemberInner {
	
	//멤버변수
	int a=10;
	private int b=100;
	static int c=200;
	
	//내부클래스
	class Inner{
		
		public void printDate() {
			System.out.println("int a : " + a);
			System.out.println("private int b : " + b);
			System.out.println("static int c : " + c);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberInner outer = new MemberInner();//main클래스 객체생성
		//메인클래스의 객체를 통해서 내부클래스 메서드를 이용함
		MemberInner.Inner inner=outer.new Inner();//아우터를 통해서 들어온 내부 클래스 메서드활용
		
		//위의 두줄을 한줄로! >> 한줄코딩은 길어져서 잘 사용하지 않음! 
		//MemberInner.Inner inner2 = new MemberInner().new Inner(); //외부클래스를 통해서 내부클래스 객체 생성
		
		//MemberInner.Inner in2 = outer.new Inner();
		
		 

	}

}
