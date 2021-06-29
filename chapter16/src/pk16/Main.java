package pk16;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.method();
		System.out.println();
		
		//인스턴스 클래스 객체 생성
		A.B b = a.new B();
		b.field1=3;
		b.method();
		
		//정적 클래스 객체 생성
		A.C c = new A.C();
		//일
		c.field1=3;
		c.method();
		//static
		A.C.field2=3;
		A.C.method2();
		
	}

}
