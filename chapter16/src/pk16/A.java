package pk16;

public class A /*implements Runnable*/{

	/*
	@Override
	public void run() {//클래스가 Runnable로 대체되어 사용
		// TODO Auto-generated method stub
		
	}
	*/
	
	public A() {
		System.out.println("A 객체가 생성됨");
	}
	//인스턴스 클래ㅅ
	public class B {
	
		int field1;
		//static int field2; 인클래스가 힙메모리 가운데에 있기 때문에 static변수 선언이 불가
	
		//생성자
		public B() {
			System.out.println("B 객체가 생성됨");
		}
		//메서드
		public void method() {}
	}
		//public static void method2() {}
	//스테이틱 클래
	static class C{
		int field1;
		static int field2;
		
		public C() {
			System.out.println("C 객체가 생성됨");
		}
		public void method() {
			
		}
		public static void method2() {}
		
	}//C
	//???	
	void method() {
		//로컬 클래스
		class D {
			public D() {
				System.out.println("D 객체가 생성");
			}
			int field1;
			//static int field2;
			public void method1() {
				
			}
			//public static void method2() {}
		}
		D d = new D();
		d.method1();
		d.field1=3;
	}
		
}//class B

